package bar;

import com.alibaba.fastjson.JSONObject;
import com.github.abel533.echarts.axis.*;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Line;
import first.EchartsUtil;
import sun.misc.BASE64Decoder;
import util.EnhancedOption;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class DoubleBarUtil {
    public static void main(String[] args) throws Exception {
        DoubleBarUtil doubleBarUtil = new DoubleBarUtil();
        doubleBarUtil.marketBoundary();
        doubleBarUtil.userDeclaration();
    }
    //用电测申报情况
    public byte[] userDeclaration() throws Exception {
        EnhancedOption option = new EnhancedOption();
        option.title("用电测申报情况");
        option.legend("售电公司", "批发用户");
        option.grid().y(60).y2(30).x2(60);
        option.xAxis( new CategoryAxis().data("8月15日", "8月16日", "8月17日", "8月18日", "8月19日", "8月20日"));
        option.yAxis(new ValueAxis().axisLabel(new AxisLabel().formatter("{value}")));
        Bar b1 = new Bar("售电公司");
        b1.itemStyle().normal().color("rgba(65,105,225,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(15);
        b1.data(778541.487, 720413.73, 785935.524, 814761.155, 778384.436, 805565.862);
        Bar b2 = new Bar("批发用户");
        b2.itemStyle().normal().color("rgba(225,140,0,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(15);
        b2.data(58094, 46070, 80656.5, 80775, 81074.82, 81070.48200);
        option.series(b1, b2);
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
        OutputStream out = new FileOutputStream("G:/....zzm乱七八糟/用电测申报情况.png");
        out.write(bytes);
        out.flush();
        out.close();
        return bytes;
    }
//折线计算
    //市场边界条件
    public byte[] marketBoundary() throws Exception {
        EnhancedOption option = new EnhancedOption();
        option.title("市场边界条件");
        option.legend("最大统调负荷", "竞价空间","供/需比");
        option.grid().y(60).y2(30).x2(60);
        option.xAxis(new CategoryAxis().data("8月15日", "8月16日", "8月17日", "8月18日", "8月19日", "8月20日", "8月21日"));
        Bar b1 = new Bar("最大统调负荷");
        b1.itemStyle().normal().color("rgba(65,105,225,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(15);
        b1.data(112000, 98000, 115000, 113000, 108000, 107000, 113000);

        Bar b2 = new Bar("竞价空间");
        b2.itemStyle().normal().color("rgba(225,140,0,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(15);
        b2.data(35922.41, 34435.05, 40601.73, 48110.19, 30808.08, 40182.08);

        Line l1 = new Line("供/需比");
        l1.itemStyle().normal().color("rgba(225,140,0,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(15);
        l1.data(0.29, 0.32, 0.398,0.41, 0.25, 0.36,0.37);

        option.series(b1,b2).yAxis(new ValueAxis().axisLabel(new AxisLabel().formatter("{value}")));
        option.series(l1.yAxisIndex(1)).yAxis(new ValueAxis().axisLabel(new AxisLabel().formatter("{value}")));
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
        OutputStream out = new FileOutputStream("G:/....zzm乱七八糟/市场边界条件.png");
        out.write(bytes);
        out.flush();
        out.close();
        return bytes;
    }
}
