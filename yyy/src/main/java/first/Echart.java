package first;

import com.alibaba.fastjson.JSONObject;
import com.github.abel533.echarts.json.GsonOption;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Echart {

    public static void main(String[] args) throws Exception {
        Echart.echartUtil("图例");
//        Demo.wordHutoolUtil();
//        Demo.wordEasyPoiUtil();
    }
    /**
     * 生成报表工具
     * @throws Exception
     */
    public static byte[] echartUtil(String title) throws Exception{
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
        String base64 = EchartsUtil.generateEchartsBase64(optionStr, "http://127.0.0.1:6666");
        String base = base64;
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(base);
        for (int i = 0; i < bytes.length; ++i) {
            if (bytes[i] < 0) {// 调整异常数据
                bytes[i] += 256;
            }
        }
        // 生成jpeg图片
        OutputStream out = new FileOutputStream("D:/bar.png");
        out.write(bytes);
        out.flush();
        out.close();
        return bytes;
    }

}
