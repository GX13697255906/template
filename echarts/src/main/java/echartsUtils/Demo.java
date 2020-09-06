package echartsUtils;

import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.word.WordExportUtil;
import cn.afterturn.easypoi.word.entity.MyXWPFDocument;
import com.alibaba.fastjson.JSONObject;
import com.github.abel533.echarts.json.GsonOption;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) throws Exception {
        Demo.echartUtil();
//        Demo.wordHutoolUtil();
//        Demo.wordEasyPoiUtil();
    }

    public static void wordEasyPoiUtil(){

        try {
            XWPFDocument document = new MyXWPFDocument();
            Map<String, Object> map = new HashMap<>();
            map.put("name", "GX");
            ImageEntity imageEntity = new ImageEntity();
            imageEntity.setWidth(300);
            imageEntity.setHeight(150);
            imageEntity.setData(echartUtil());
            imageEntity.setType(ImageEntity.URL);
            map.put("image", imageEntity);
            WordExportUtil.exportWord07(document,map);
            FileOutputStream fileOutputStream = new FileOutputStream("D:/test2.docx");
            document.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * word文档工具
     */
    public static void wordHutoolUtil() throws Exception{

        XWPFDocument doc = new XWPFDocument();
        doc.addPictureData(echartUtil(), XWPFDocument.PICTURE_TYPE_PNG);
        doc.createTable(5,4);
        OutputStream out = new FileOutputStream("D:/test.docx");
        doc.write(out);
        out.close();

//        Word07Writer writer = new Word07Writer(xwpfDocument);
//        // 添加段落（标题）
//        writer.addText(new Font("方正小标宋简体", Font.PLAIN, 22), "我是第一部分", "我是第二部分");
//// 添加段落（正文）
//        writer.addText(new Font("宋体", Font.PLAIN, 22), "我是正文第一部分", "我是正文第二部分");
//        ParagraphAlignment imageAlignment = ParagraphAlignment.valueOf(2);
//        List<List<String>> name = new ArrayList<>();
//        List<String> name1 = new ArrayList<>();
//        name1.add("name1");
//        name1.add("name2");
//        name1.add("name3");
//        name1.add("name4");
//        List<String> name2 = new ArrayList<>();
//        name2.add("name5");
//        name2.add("name6");
//        name2.add("name7");
//        name2.add("name8");
//        List<String> name3 = new ArrayList<>();
//        name3.add("name5");
//        name3.add("name6");
//        name3.add("name7");
//        name3.add("name8");
//        name.add(name1);name.add(name2);name.add(name3);
//        writer.addTable(name);
//// 写出到文件
//        writer.flush(new File("D:/test.docx"));
//// 关闭
//        writer.close();

    }

    /**
     * 生成报表工具
     * @throws Exception
     */
    public static byte[] echartUtil() throws Exception{
        BarData data = new BarData();
        data.setTitle("测试报表");
        BarParam barParam = new BarParam();
        barParam.setBarName(new String[]{"A", "B", "C", "D", "E", "F","G"});
        barParam.setBarValue(new Integer[]{43364, 13899, 12000, 2181, 21798, 1796, 1300});
        barParam.setLegendName("图例");
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
