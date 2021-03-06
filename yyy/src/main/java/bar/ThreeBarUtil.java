/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package bar;

import com.alibaba.fastjson.JSONObject;
import com.github.abel533.echarts.axis.*;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.series.Bar;
import first.EchartsUtil;
import sun.misc.BASE64Decoder;
import util.EnhancedOption;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author liuzh
 */
public class ThreeBarUtil {

    public static void main(String[] args) throws Exception {
        ThreeBarUtil threeBarUtil = new ThreeBarUtil();
        threeBarUtil.genSideAveOffer();
    }

    public byte[] test() throws Exception {
        EnhancedOption option = new EnhancedOption();
        option.title("ECharts2 vs ECharts1", "Chrome下测试数据");
        option.tooltip(Trigger.axis);
        option.legend(
                "ECharts1 - 2k数据", "ECharts1 - 2w数据", "ECharts1 - 20w数据", "",
                "ECharts2 - 2k数据", "ECharts2 - 2w数据", "ECharts2 - 20w数据");
        option.toolbox().show(true)
                .feature(
                        Tool.mark, Tool.dataView,
                        new MagicType(Magic.line, Magic.bar),
                        Tool.restore, Tool.saveAsImage);
        option.calculable(true);
        option.grid().y(70).y2(30).x2(20);
        option.xAxis(
                new CategoryAxis().data("Line", "Bar", "Scatter", "K", "Map"),
                new CategoryAxis()
                        .axisLine(new AxisLine().show(false))
                        .axisTick(new AxisTick().show(false))
                        .axisLabel(new AxisLabel().show(false))
                        .splitArea(new SplitArea().show(false))
                        .axisLine(new AxisLine().show(false))
                        .data("Line", "Bar", "Scatter", "K", "Map")
        );
        option.yAxis(new ValueAxis().axisLabel(new AxisLabel().formatter("{value} ms")));

        Bar b1 = new Bar("ECharts2 - 2k数据");
        b1.itemStyle().normal().color("rgba(193,35,43,1)").label().show(true);
        b1.data(40, 155, 95, 75, 0);
        Bar b2 = new Bar("ECharts2 - 2w数据");
        b2.itemStyle().normal().color("rgba(181,195,52,1)").label().show(true).textStyle().color("#27727B");
        b2.data(100, 200, 105, 100, 156);

        Bar b3 = new Bar("ECharts2 - 20w数据");
        b3.itemStyle().normal().color("rgba(252,206,16,1)").label().show(true).textStyle().color("#E87C25");
        b3.data(906, 911, 908, 778, 0);

        Bar b4 = new Bar("ECharts1 - 2k数据");
        b4.itemStyle().normal().color("rgba(193,35,43,0.5)").label().show(true);
        b4.data(96, 224, 164, 124, 0).xAxisIndex(1);

        Bar b5 = new Bar("ECharts1 - 2w数据");
        b5.itemStyle().normal().color("rgba(181,195,52,0.5)").label().show(true);
        b5.data(491, 2035, 389, 955, 347).xAxisIndex(1);

        Bar b6 = new Bar("ECharts1 - 20w数据");
        b6.itemStyle().normal().color("rgba(252,206,16,0.5)").label().show(true);
        b6.data(3000, 3000, 2817, 3000, 0, 1242).xAxisIndex(1);
        option.series(b1, b2, b3, b4, b5, b6);
        String optionStr = JSONObject.toJSONString(option);
        String base64 = EchartsUtil.generateEchartsBase64(optionStr, "http://172.16.0.82:6666");
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(base64);
        for (int i = 0; i < bytes.length; ++i) {
            if (bytes[i] < 0) {// 调整异常数据
                bytes[i] += 256;
            }
        }
        // 生成jpeg图片
        OutputStream out = new FileOutputStream("D:/threeBar.png");
        out.write(bytes);
        out.flush();
        out.close();
        return bytes;
    }

    //字放在上方
    //发电测平均报价图
    public byte[] genSideAveOffer() throws Exception {
        EnhancedOption option = new EnhancedOption();
        option.title("发电测平均报价");
        option.tooltip(Trigger.axis);
        option.legend("所有机组", "燃煤机组", "燃气机组");
        option.calculable(true);
        option.grid().y(60).y2(30).x2(60);
        option.xAxis(
                new CategoryAxis().data("8月15日", "8月16日", "8月17日", "8月18日", "8月19日", "8月20日", "8月21日"),
                new CategoryAxis()
                        .axisLine(new AxisLine().show(false))
                        .axisTick(new AxisTick().show(true))
                        .axisLabel(new AxisLabel().show(false))
                        .splitArea(new SplitArea().show(false))
                        .axisLine(new AxisLine().show(false))
                        .data("8月15日", "8月16日", "8月17日", "8月18日", "8月19日", "8月20日", "8月21日")
        );
        option.yAxis(new ValueAxis().axisLabel(new AxisLabel().formatter("{value}")));

        Bar b4 = new Bar("所有机组");
        b4.itemStyle().normal().color("rgba(65,105,225,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(14);
        b4.data(458.69, 460.55, 459.71, 451.06, 469.79, 490.14, 485.05).xAxisIndex(1);

        Bar b5 = new Bar("燃煤机组");
        b5.itemStyle().normal().color("rgba(225,140,0,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(14);
        b5.data(411.79, 460.2, 412.8, 403.76, 426.87, 445.42, 440.21).xAxisIndex(1);

        Bar b6 = new Bar("燃气机组");
        b6.itemStyle().normal().color("rgba(169,169,169,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(14);
        b6.data(650.21, 686.26, 652.23, 644.4, 646.19, 659.31, 654.26).xAxisIndex(1);
        option.series(b4, b5, b6);
        String optionStr = JSONObject.toJSONString(option);
        String base64 = EchartsUtil.generateEchartsBase64(optionStr, "http://172.16.0.82:6666");
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(base64);
        for (int i = 0; i < bytes.length; ++i) {
            if (bytes[i] < 0) {// 调整异常数据
                bytes[i] += 256;
            }
        }
        // 生成jpeg图片
        OutputStream out = new FileOutputStream("D:/发电测平均报价图.png");
        out.write(bytes);
        out.flush();
        out.close();
        return bytes;
    }
}