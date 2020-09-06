package first;

import cn.hutool.core.date.DateUtil;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.converter.core.Color;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.List;

public class WordUtil {

    public static String getStringDate(String scopeDate, Integer formatIndex) {
        String hformat = "yyyy-MM-dd";
        String pformat = "yyyy.MM.dd";
        String cformat = "yyyy年MM月dd日";
        String cformat2 = "yyyy年MM月dd";
        String yyyyMMformat1 = "MM月dd";
        String yyyyMMformat2 = "MM月dd日";
        String format = null;
        if (formatIndex.intValue() == 1) {
            format = hformat;
        } else if (formatIndex == 2) {
            format = pformat;
        } else if (formatIndex == 3) {
            format = cformat;
        } else if (formatIndex == 4) {
            format = cformat2;
        } else if (formatIndex == 5) {
            format = yyyyMMformat1;
        } else if (formatIndex == 6) {
            format = yyyyMMformat2;
        }
        String date = DateUtil.parse(scopeDate, hformat).toString(format);
        return date;
    }

    public static void main(String[] args) throws Exception {
        String startDate = "2020-08-15";
        String endDate = "2020-08-21";

        WordUtil wordUtil = new WordUtil();

        //创建文档对象
        XWPFDocument docxDocument = new XWPFDocument();
        // 设置页面大小间距
        CTDocument1 document = docxDocument.getDocument();
        CTBody body = document.getBody();
        if (!body.isSetSectPr()) {
            body.addNewSectPr();
        }
        CTSectPr section = body.getSectPr();
        if (!section.isSetPgSz()) {
            section.addNewPgSz();
        }
        // 设置页面大小  当前A4大小
        CTPageSz pageSize = section.getPgSz();
        if (!section.isSetPgMar()) {
            section.addNewPgMar();
        }
        //设置页边距
        CTPageMar pageMar = section.getPgMar();
        pageMar.setLeft(BigInteger.valueOf(1500L));
        pageMar.setTop(BigInteger.valueOf(1440L));
        pageMar.setRight(BigInteger.valueOf(1500L));
        pageMar.setBottom(BigInteger.valueOf(1440L));
        pageSize.setW(BigInteger.valueOf(11907));
        pageSize.setH(BigInteger.valueOf(16840));
        pageSize.setOrient(STPageOrientation.PORTRAIT);
//        CTP ctp = CTP.Factory.newInstance();
//        XWPFParagraph paragraph = new XWPFParagraph(ctp, docxDocument);
//        ctp.addNewR().addNewT().setStringValue("页眉");
//        ctp.addNewR().addNewT().setSpace(SpaceAttribute.Space.PRESERVE);
//        CTSectPr sectPr = docxDocument.getDocument().getBody().isSetSectPr() ? docxDocument.getDocument().getBody().getSectPr() : docxDocument.getDocument().getBody().addNewSectPr();
//        XWPFHeaderFooterPolicy policy = new XWPFHeaderFooterPolicy(docxDocument, sectPr);
//        XWPFHeader header = policy.createHeader(STHdrFtr.DEFAULT, new XWPFParagraph[] { paragraph });
//        header.setXWPFDocument(docxDocument);

        //创建段落1对象
        XWPFParagraph paraGraphX1 = docxDocument.createParagraph();
        //创建文本1对象
        XWPFRun run1 = paraGraphX1.createRun();
        //完成文本一内容格式
        run1.setText("电力市场运行周报");
        run1.setFontSize(18);
        run1.setFontFamily("宋体");
        run1.setTextPosition(26);
        paraGraphX1.setAlignment(ParagraphAlignment.CENTER);

        XWPFParagraph paraGraphX2 = docxDocument.createParagraph();
        XWPFRun run2 = paraGraphX2.createRun();
        run2.setText(startDate.replace("-", ".") + "-" + endDate.replace("-", "."));
        run2.setFontSize(12);
        run2.setFontFamily("宋体");
        run2.setTextPosition(26);
        paraGraphX2.setAlignment(ParagraphAlignment.CENTER);

        XWPFParagraph paraGraphX3 = docxDocument.createParagraph();
        XWPFRun run3 = paraGraphX3.createRun();
        run3.setText("（备注：21日用户侧申报数据还没有收到）");
        run3.setFontSize(11);
        run3.setFontFamily("宋体");
        run3.setTextPosition(26);
        paraGraphX3.setAlignment(ParagraphAlignment.CENTER);

        /**
         * 参与市场主体数量
         */
        wordUtil.marketSubjectNumber(docxDocument, startDate, endDate);
        /**
         * 市场边界条件
         */
        wordUtil.marketBoundaryCondition(docxDocument, startDate, endDate);
        /**
         *市场成员申报
         */
        wordUtil.marketDeclareCondition(docxDocument, startDate, endDate);
        /**
         * 市场出清
         */
        wordUtil.marketClear(docxDocument, startDate, endDate);
        /**
         * 市场结构
         */
        wordUtil.marketStructure(docxDocument, startDate, endDate);
        /**
         * 市场运行总结
         */
        wordUtil.marketRunSummary(docxDocument, startDate, endDate);
        //输出文档到指定地点
        OutputStream os = new FileOutputStream("D:\\能监局周报（" + getStringDate(startDate, 5) + "-" + getStringDate(endDate, 6) +")-"+ System.currentTimeMillis()+".docx");
        docxDocument.write(os);
        os.close();
    }

    /**
     * 参与市场主体数量
     */
    public void marketSubjectNumber(XWPFDocument docxDocument, String startDate, String endDate) throws Exception {
        XWPFParagraph titleParagraph = docxDocument.createParagraph();

        XWPFRun titleRun = titleParagraph.createRun();
        titleRun.setText("参与市场主体数量");
        titleRun.setUnderline(UnderlinePatterns.DOUBLE);
        titleRun.setFontFamily("宋体");
        titleRun.setFontSize(10);
        titleRun.setTextPosition(6);
        titleParagraph.setAlignment(ParagraphAlignment.LEFT);
        titleRun.setColor("FFFFFF");
        titleRun.getCTR().addNewRPr().addNewHighlight().setVal(STHighlightColor.BLACK);

        XWPFParagraph textParagraph = docxDocument.createParagraph();
        XWPFRun textRun = textParagraph.createRun();
        textRun.setText("    " + getStringDate(startDate, 3) + "至" + getStringDate(endDate, 3) + "广东省电力现货市场有各类发电机组，售电公司，批发用户参与现货市场申报，具体数量如下：");
        textRun.setFontFamily("宋体");
        textRun.setFontSize(10);
        textRun.setTextPosition(22);

        //创建一个表格
        XWPFTable table = docxDocument.createTable(4, 8);
        List<XWPFTableRow> rows = table.getRows();
        XWPFTableRow row;
        List<XWPFTableCell> cells;
        XWPFTableCell cell;
        int rowSize = rows.size();
        int cellSize;
        for (int i = 0; i < rowSize; i++) {
            row = rows.get(i);
            //设置行的高度
            row.setHeight(300);
            cells = row.getTableCells();
            cellSize = cells.size();
            for (int j = 0; j < cellSize; j++) {
                cell = cells.get(j);
                //单元格属性
                CTTc cttc = cell.getCTTc();
                CTTcPr cellPr = cell.getCTTc().addNewTcPr();
                cellPr.addNewVAlign().setVal(STVerticalJc.CENTER);
                //设置宽度
                cellPr.addNewTcW().setW(BigInteger.valueOf(1105));
                cttc.getPList().get(0).addNewPPr().addNewJc().setVal(STJc.CENTER);
                cell.getCTTc().addNewTcPr().addNewVAlign().setVal(STVerticalJc.CENTER);
                if (i == 0) {
                    if (j == 0) {
                        cell.setText("");
                    } else {
                        cell.setText("8月" + (j + 7));
                    }
                }
                if (i == 1) {
                    if (j == 0) {
                        cell.setText("发电机组");
                    } else {
                        cell.setText("251");
                    }
                }
                if (i == 2) {
                    if (j == 0) {
                        cell.setText("售电公司");
                    } else if (j == 7) {
                        cell.setText("");
                    } else {
                        cell.setText("136");
                    }
                }
                if (i == 3) {
                    if (j == 0) {
                        cell.setText("批发用户");
                    } else if (j == 7) {
                        cell.setText("");
                    } else {
                        cell.setText("1");
                    }
                }
            }
        }
    }

    /**
     * 市场边界条件
     */
    public void marketBoundaryCondition(XWPFDocument docxDocument, String startDate, String endDate) throws Exception {
        XWPFParagraph titleParagraph = docxDocument.createParagraph();
        XWPFRun titleRun = titleParagraph.createRun();
        titleRun.addCarriageReturn();
        titleRun.setText("市场边界条件");
        titleRun.setFontFamily("宋体");
        titleRun.setFontSize(10);
        titleRun.setTextPosition(6);
        titleParagraph.setAlignment(ParagraphAlignment.LEFT);
        titleRun.setColor("FFFFFF");
        titleRun.getCTR().addNewRPr().addNewHighlight().setVal(STHighlightColor.BLACK);
        titleRun.setUnderline(UnderlinePatterns.THICK);
        XWPFParagraph textParagraph = docxDocument.createParagraph();
        XWPFRun textRun = textParagraph.createRun();
        textRun.setText("    " + getStringDate(startDate, 3) + "至" + getStringDate(endDate, 3) + "最大负荷平均值为115000MW，每日最大负荷相对应时刻市场竞价空间的平均值为40601.73MW,每日最大统调负荷时刻需/共比的平均值为0.41。");
        textRun.setFontFamily("宋体");
        textRun.setFontSize(10);
        textRun.setTextPosition(22);
        //增加一张图片
        XWPFParagraph pictureParagraph = docxDocument.createParagraph();
        XWPFRun pictureRun = pictureParagraph.createRun();
        pictureParagraph.setAlignment(ParagraphAlignment.CENTER);
        byte[] bytes = Echart.echartUtil("市场边界条件");
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        bis.reset();
        pictureRun.addPicture(bis, XWPFDocument.PICTURE_TYPE_PNG, "市场边界条件", Units.toEMU(410), Units.toEMU(180));
    }

    public void marketDeclareCondition(XWPFDocument docxDocument, String startDate, String endDate) throws Exception {
        XWPFParagraph marketDeclareConditionParagraphTitle = docxDocument.createParagraph();
        XWPFRun titleRun = marketDeclareConditionParagraphTitle.createRun();
        titleRun.addCarriageReturn();
        titleRun.setText("市场成员申报");
        titleRun.setFontFamily("宋体");
        titleRun.setFontSize(10);
        titleRun.setTextPosition(6);
        marketDeclareConditionParagraphTitle.setAlignment(ParagraphAlignment.LEFT);
        titleRun.setColor("FFFFFF");
        titleRun.getCTR().addNewRPr().addNewHighlight().setVal(STHighlightColor.BLACK);
        titleRun.setUnderline(UnderlinePatterns.THICK);

        XWPFParagraph OneParagraphText = docxDocument.createParagraph();
        XWPFRun textOne = OneParagraphText.createRun();
        textOne.setText("    " + getStringDate(startDate, 3) + "至" + getStringDate(endDate, 3) + "所有机组的申报平均价格为437.1元/MWh,燃煤机组的平均申报价格为384.1元/MWh,燃气机组的平均申报价格为674.96元/MWh。");
        textOne.setFontFamily("宋体");
        textOne.setFontSize(10);
        textOne.setTextPosition(22);

        //增加一张图片
        XWPFParagraph oneParagraphPicture = docxDocument.createParagraph();
        XWPFRun oneRunPicture = oneParagraphPicture.createRun();
        oneParagraphPicture.setAlignment(ParagraphAlignment.CENTER);
        byte[] bytes2 = Echart.echartUtil("市场成员申报");
        ByteArrayInputStream bis2 = new ByteArrayInputStream(bytes2);
        bis2.reset();
        oneRunPicture.addPicture(bis2, XWPFDocument.PICTURE_TYPE_PNG, "市场成员申报", Units.toEMU(300), Units.toEMU(150));

        XWPFParagraph twoParagraphText = docxDocument.createParagraph();
        XWPFRun twoRunText = twoParagraphText.createRun();
        twoRunText.addCarriageReturn();
        twoRunText.setText("    " + getStringDate(startDate, 3) + "至" + getStringDate(endDate, 3) + "售电公司累计申报电量为46.8361亿千瓦时, 日平均值为7.8060亿千瓦时，批发用户累计申报电量为0.04434亿千瓦时，日平均0.00739亿千瓦时。");
        twoRunText.setFontFamily("宋体");
        twoRunText.setFontSize(10);
        twoRunText.setTextPosition(22);

        //增加一张图片
        XWPFParagraph twoParagraphPicture = docxDocument.createParagraph();
        XWPFRun twoRunPicture = twoParagraphPicture.createRun();
        twoParagraphPicture.setAlignment(ParagraphAlignment.CENTER);
        byte[] bytes3 = Echart.echartUtil("市场成员申报");
        ByteArrayInputStream bis3 = new ByteArrayInputStream(bytes3);
        bis3.reset();
        twoRunPicture.addPicture(bis3, XWPFDocument.PICTURE_TYPE_PNG, "市场成员申报", Units.toEMU(410), Units.toEMU(180));
    }

    public void marketClear(XWPFDocument docxDocument, String startDate, String endDate) throws Exception {
        XWPFParagraph marketCleaParagraphrTitle = docxDocument.createParagraph();
        XWPFRun titleRun = marketCleaParagraphrTitle.createRun();
        titleRun.addCarriageReturn();
        titleRun.setText("市场出清");
        titleRun.setFontFamily("宋体");
        titleRun.setFontSize(10);
        titleRun.setTextPosition(6);
        marketCleaParagraphrTitle.setAlignment(ParagraphAlignment.LEFT);
        titleRun.setColor("FFFFFF");
        titleRun.getCTR().addNewRPr().addNewHighlight().setVal(STHighlightColor.BLACK);
        titleRun.setUnderline(UnderlinePatterns.THICK);

        XWPFParagraph textParagraph = docxDocument.createParagraph();
        XWPFRun textRun = textParagraph.createRun();
        textRun.setText("    " + getStringDate(startDate, 3) + "至" + getStringDate(endDate, 3) + "日前出清电价平均值为140.74元/MW，实时出清电价平均值为 123.29元/MW（截止至8月20日）。");
        textRun.setFontFamily("宋体");
        textRun.setFontSize(10);
        textRun.setTextPosition(22);

        //增加一张图片
        XWPFParagraph pictureParagraph = docxDocument.createParagraph();
        XWPFRun pictureRun = pictureParagraph.createRun();
        pictureParagraph.setAlignment(ParagraphAlignment.CENTER);
        byte[] bytes4 = Echart.echartUtil("市场出清");
        ByteArrayInputStream bis4 = new ByteArrayInputStream(bytes4);
        bis4.reset();
        pictureRun.addPicture(bis4, XWPFDocument.PICTURE_TYPE_PNG, "市场出清", Units.toEMU(410), Units.toEMU(210));
    }

    public void marketStructure(XWPFDocument docxDocument, String startDate, String endDate) throws Exception {
        XWPFParagraph titleParagraph = docxDocument.createParagraph();
        XWPFRun titleRun = titleParagraph.createRun();
        titleRun.addCarriageReturn();
        titleRun.setText("市场结构");
        titleRun.setFontFamily("宋体");
        titleRun.setFontSize(10);
        titleRun.setTextPosition(6);
        titleParagraph.setAlignment(ParagraphAlignment.LEFT);
        titleRun.setColor("FFFFFF");
        titleRun.getCTR().addNewRPr().addNewHighlight().setVal(STHighlightColor.BLACK);
        titleRun.setUnderline(UnderlinePatterns.THICK);

        XWPFParagraph oneTextParagraph = docxDocument.createParagraph();
        XWPFRun oneTextRun = oneTextParagraph.createRun();
        oneTextRun.setText("    " + getStringDate(startDate, 3) + "至" + getStringDate(endDate, 3) + "发电机组的市场集中度（HHI）平均为1258.69（实时）。");
        oneTextRun.setFontFamily("宋体");
        oneTextRun.setFontSize(10);
        oneTextRun.setTextPosition(22);

        XWPFParagraph twoTextParagraph = docxDocument.createParagraph();
        XWPFRun twoTextRun = twoTextParagraph.createRun();
        twoTextRun.setText("    " + getStringDate(startDate, 3) + "至" + getStringDate(endDate, 3) + "发电侧的机组多元化指数均值为：0.3436（实时）。");
        twoTextRun.setFontFamily("宋体");
        twoTextRun.setFontSize(10);
        twoTextRun.setTextPosition(22);

        //增加一张图片
        XWPFParagraph pictureParagraph = docxDocument.createParagraph();
        XWPFRun prctireRun = pictureParagraph.createRun();
        pictureParagraph.setAlignment(ParagraphAlignment.CENTER);
        byte[] bytes5 = Echart.echartUtil("市场结构");
        ByteArrayInputStream bis5 = new ByteArrayInputStream(bytes5);
        bis5.reset();
        prctireRun.addPicture(bis5, XWPFDocument.PICTURE_TYPE_PNG, "市场结构", Units.toEMU(410), Units.toEMU(190));
    }

    public void marketRunSummary(XWPFDocument docxDocument, String startDate, String endDate) throws Exception {
        XWPFParagraph oneTextParagraph = docxDocument.createParagraph();
        XWPFRun oneTextRun = oneTextParagraph.createRun();
        oneTextRun.addCarriageReturn();
        oneTextRun.setText("市场运行总结");
        oneTextRun.setFontFamily("宋体");
        oneTextRun.setFontSize(10);
        oneTextRun.setTextPosition(6);
        oneTextParagraph.setAlignment(ParagraphAlignment.LEFT);
        oneTextRun.setColor("FFFFFF");
        oneTextRun.getCTR().addNewRPr().addNewHighlight().setVal(STHighlightColor.BLACK);
        oneTextRun.setUnderline(UnderlinePatterns.THICK);

        XWPFParagraph twoTextParagraph = docxDocument.createParagraph();
        XWPFRun twoTextRun = twoTextParagraph.createRun();
        twoTextRun.setText("    近一周（" + getStringDate(startDate, 4) + "~" + getStringDate(endDate, 3) + "）市场参与主体数量不变，发电机组151个（套机拆分之后），售电公司136家，批发用户1家。");
        twoTextRun.setFontFamily("宋体");
        twoTextRun.setFontSize(10);
        twoTextRun.setTextPosition(22);

        XWPFParagraph threeTextParagraph = docxDocument.createParagraph();
        XWPFRun threeTextRun = threeTextParagraph.createRun();
        threeTextRun.setText("    发电侧所有机组申报的平均价格在420~470元/MWh之间，燃煤机组申报平均价格在370~420元/MWh之间，燃气机组申报平均价格在660~710元/MWh之间。由于一次能源的种类不同燃气机组的申报价格比燃煤机组平均高75%。");
        threeTextRun.setFontFamily("宋体");
        threeTextRun.setFontSize(10);
        threeTextRun.setTextPosition(22);

        XWPFParagraph fourTextParagraph = docxDocument.createParagraph();
        XWPFRun fourTexrRun = fourTextParagraph.createRun();
        fourTexrRun.setText("    用户侧每日平均申报用电量在6.9亿千瓦时~8.3亿千瓦时之间，主要是售电公司申报用电量，批发用户只一家，平均每日申报739.16MWh。用电侧申报量较为平稳，与最大统调负荷的变化较为一致，8月16日预测统调最高负荷最低，同一天用电侧日前申报量最低。8月17预测统调负荷最高，同日的用电侧日前申报量排名上周第二。");
        fourTexrRun.setFontFamily("宋体");
        fourTexrRun.setFontSize(10);
        fourTexrRun.setTextPosition(22);

        XWPFParagraph fiveTextParagraph = docxDocument.createParagraph();
        XWPFRun fiveTextRun = fiveTextParagraph.createRun();
        fiveTextRun.setText("    机组出清价格方面，总体上日前机组出清价格高于实时机组出清价格，日前出清电价平均值为140.74元/MW，实时出清电价平均值为 123.29元/MW。");
        fiveTextRun.setFontFamily("宋体");
        fiveTextRun.setFontSize(10);
        fiveTextRun.setTextPosition(22);

        XWPFParagraph sixTextParagraph = docxDocument.createParagraph();
        XWPFRun sixTextRun = sixTextParagraph.createRun();
        sixTextRun.setText("    市场结构方面，HHI指数平均为1258.69，周最大值1399.31，周最小值1101.27，都处于（1800, 1000]区间范围，表明市场处于低寡占型市场。");
        sixTextRun.setFontFamily("宋体");
        sixTextRun.setFontSize(10);
        sixTextRun.setTextPosition(22);

        XWPFParagraph sevenTextParagraph = docxDocument.createParagraph();
        XWPFRun sevenTextRun = sevenTextParagraph.createRun();
        sevenTextRun.setText("    近一周没有出现价格帽中标情况；机组多元化指数均值为0.3436，周最小值为0.2471，最大值为0.3963，说明燃气机组和燃煤机组的出清占比变化较小。");
        sevenTextRun.setFontFamily("宋体");
        sevenTextRun.setFontSize(10);
        sevenTextRun.setTextPosition(22);
    }

    public void line(XWPFDocument docxDocument) throws Exception {
        XWPFParagraph lineParagraph = docxDocument.createParagraph();
        XWPFRun lineRun = lineParagraph.createRun();
        lineRun.setFontFamily("宋体");
        lineRun.setFontSize(10);
        lineRun.setTextPosition(6);
        lineRun.setBold(true);
        lineParagraph.setAlignment(ParagraphAlignment.LEFT);
        lineRun.setText("-------------------dfdfdf-----------------------"+"                                        ");
//        lineRun.setUnderline(UnderlinePatterns.SINGLE);
//        lineRun.setUnderline(UnderlinePatterns.WORDS);
//        lineRun.setUnderline(UnderlinePatterns.DOUBLE);
        lineRun.setUnderline(UnderlinePatterns.WAVY_HEAVY);
//        lineRun.setUnderline(UnderlinePatterns.DOTTED_HEAVY);


    }
}
