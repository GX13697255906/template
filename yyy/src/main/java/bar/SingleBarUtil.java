package bar;

import com.alibaba.fastjson.JSONObject;
import com.github.abel533.echarts.axis.*;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Line;
import first.BarData;
import first.BarParam;
import first.EchartBar;
import first.EchartsUtil;
import sun.misc.BASE64Decoder;
import util.EnhancedOption;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class SingleBarUtil {

    public static void main(String[] args) throws Exception {
        SingleBarUtil singleBarUtil = new SingleBarUtil();
        singleBarUtil.marketStructure();
//        Demo.wordHutoolUtil();
//        Demo.wordEasyPoiUtil();
    }
    /**
     * 生成单柱状图工具
     * @throws Exception
     */
    public static byte[] echartBarUtil(String title) throws Exception{
        BarData data = new BarData();
        data.setTitle("测试报表");
        BarParam barParam = new BarParam();
        barParam.setBarName(new String[]{"A", "B", "C", "D", "E", "F","G"});
        barParam.setBarValue(new Integer[]{43364, 13899, 12000, 2181, 21798, 1796, 1300});
        barParam.setLegendName(title);
        data.setBarParamList(barParam);
        data.setHorizontal(true);
        GsonOption option = EchartBar.createBar(data);
        String optionStr = JSONObject.toJSONString(option);
        String base64 = EchartsUtil.generateEchartsBase64(optionStr, "http://172.16.0.82:6666");
        String base = base64;
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(base);
        for (int i = 0; i < bytes.length; ++i) {
            if (bytes[i] < 0) {// 调整异常数据
                bytes[i] += 256;
            }
        }
        // 生成jpeg图片
        OutputStream out = new FileOutputStream("G:/....zzm乱七八糟/bar.png");
        out.write(bytes);
        out.flush();
        out.close();
        return bytes;
    }

    //市场结构情况
    public byte[] marketStructure()throws Exception{
        EnhancedOption option = new EnhancedOption();
        option.title("市场结构情况");
        option.legend("实时出清量HHI","机组多元化指数");
        option.grid().y(60).y2(30).x2(60);
        option.xAxis(new CategoryAxis().data("8月15日", "8月16日", "8月17日", "8月18日", "8月19日", "8月20日"));

        Line l1 = new Line("机组多元化指数");
        l1.itemStyle().normal().color("rgba(225,140,0,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(15);
        l1.data(0.3292,0.2471,0.3491,0.3791,0.361,0.3963);

        Bar b1 = new Bar("实时出清量HHI");
        b1.itemStyle().normal().color("rgba(65,105,225,1)").label().position(Position.top).show(true).textStyle().color("#000000").fontSize(15);
        b1.data(1341.4, 1399.31, 1284.68, 1237.06, 1188.43, 1101.27);
        b1.setBarWidth(40);

        option.series(b1).yAxis(new ValueAxis().axisLabel(new AxisLabel().formatter("{value}")));
        option.series(l1.yAxisIndex(1)).yAxis(new ValueAxis().max(0.5).min(0).interval(0.05));
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
        OutputStream out = new FileOutputStream("G:/....zzm乱七八糟/市场结构情况.png");
        out.write(bytes);
        out.flush();
        out.close();
        return bytes;
    }
}
