package bar;

import com.alibaba.fastjson.JSONObject;
import com.github.abel533.echarts.axis.*;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.series.Bar;
import first.EchartsUtil;
import sun.misc.BASE64Decoder;
import util.EnhancedOption;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FourBarUtil {
    public static void main(String args[])throws Exception{
        FourBarUtil fourBarUtil = new FourBarUtil();
        fourBarUtil.generationClean();
    }
//负数应放在下方
    //发电测出清电价
    public byte[] generationClean()throws Exception{
        EnhancedOption option = new EnhancedOption();
        option.title("发电测出清电价");
        option.tooltip(Trigger.axis);
        option.legend("日前出清平均电价", "实时出清平均电价", "日前节点平均电价","实时节点平均电价");
        option.calculable(true);
        option.grid().y(60).y2(30).x2(60);
        option.xAxis(
                new CategoryAxis().data("8月15日", "8月16日", "8月17日", "8月18日", "8月19日", "8月20日"),
                new CategoryAxis()
                        .axisLine(new AxisLine().show(false))
                        .axisTick(new AxisTick().show(false))
                        .axisLabel(new AxisLabel().show(false))
                        .splitArea(new SplitArea().show(false))
                        .axisLine(new AxisLine().show(false))
                        .data("8月15日", "8月16日", "8月17日", "8月18日", "8月19日", "8月20日")
        );
        option.yAxis(new ValueAxis().axisLabel(new AxisLabel().formatter("{value}")));

        Bar b4 = new Bar("日前出清平均电价");
        b4.itemStyle().normal().color("rgba(65,105,225,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(14);
        b4.data(159.15, 116.32, 171.88, 165.7, 118.5, 112.53).xAxisIndex(1);

        Bar b5 = new Bar("实时出清平均电价");
        b5.itemStyle().normal().color("rgba(225,140,0,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(14);
        b5.data(132.05, 100.61, 153.59, 136.57, 102.58, 114.36).xAxisIndex(1);

        Bar b6 = new Bar("日前节点平均电价");
        b6.itemStyle().normal().color("rgba(169,169,169,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(14);
        b6.data(159.33, 115.78, 169.02, 154.11, 118.23, 111.92).xAxisIndex(1);

        Bar b7 = new Bar("实时节点平均电价");
        b7.itemStyle().normal().color("rgba(255,215,0,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(14);
        b7.data(127.25, 130.93, 166.92, 162.92, -38.98, 150.23).xAxisIndex(1);
        option.series(b4, b5, b6, b7);
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
        OutputStream out = new FileOutputStream("G:/....zzm乱七八糟/发电测出清电价.png");
        out.write(bytes);
        out.flush();
        out.close();
        return bytes;
    }
}
