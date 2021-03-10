package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统实际负荷表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_system_load_actual")
@ApiModel(value = "SystemLoadActual对象", description = "系统实际负荷表")
public class SystemLoadActual extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "系统实际负荷表id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码，以区域编码要求为准")
    private String areaCode;

    @ApiModelProperty(value = "区域名称，广东")
    private String areaName;

    @ApiModelProperty(value = "00:00 负荷,MW")
    private Double p0000;

    @ApiModelProperty(value = "00:05 负荷,MW")
    private Double p0005;

    @ApiModelProperty(value = "00:10 负荷,MW")
    private Double p0010;

    @ApiModelProperty(value = "00:15 负荷,MW")
    private Double p0015;

    @ApiModelProperty(value = "00:20 负荷,MW")
    private Double p0020;

    @ApiModelProperty(value = "00:25 负荷,MW")
    private Double p0025;

    @ApiModelProperty(value = "00:30 负荷,MW")
    private Double p0030;

    @ApiModelProperty(value = "00:35 负荷,MW")
    private Double p0035;

    @ApiModelProperty(value = "00:40 负荷,MW")
    private Double p0040;

    @ApiModelProperty(value = "00:45 负荷,MW")
    private Double p0045;

    @ApiModelProperty(value = "00:50 负荷,MW")
    private Double p0050;

    @ApiModelProperty(value = "00:55 负荷,MW")
    private Double p0055;

    @ApiModelProperty(value = "01:00 负荷,MW")
    private Double p0100;

    @ApiModelProperty(value = "01:05 负荷,MW")
    private Double p0105;

    @ApiModelProperty(value = "01:10 负荷,MW")
    private Double p0110;

    @ApiModelProperty(value = "01:15 负荷,MW")
    private Double p0115;

    @ApiModelProperty(value = "01:20 负荷,MW")
    private Double p0120;

    @ApiModelProperty(value = "01:25 负荷,MW")
    private Double p0125;

    @ApiModelProperty(value = "01:30 负荷,MW")
    private Double p0130;

    @ApiModelProperty(value = "01:35 负荷,MW")
    private Double p0135;

    @ApiModelProperty(value = "01:40 负荷,MW")
    private Double p0140;

    @ApiModelProperty(value = "01:45 负荷,MW")
    private Double p0145;

    @ApiModelProperty(value = "01:50 负荷,MW")
    private Double p0150;

    @ApiModelProperty(value = "01:55 负荷,MW")
    private Double p0155;

    @ApiModelProperty(value = "02:00 负荷,MW")
    private Double p0200;

    @ApiModelProperty(value = "02:05 负荷,MW")
    private Double p0205;

    @ApiModelProperty(value = "02:10 负荷,MW")
    private Double p0210;

    @ApiModelProperty(value = "02:15 负荷,MW")
    private Double p0215;

    @ApiModelProperty(value = "02:20 负荷,MW")
    private Double p0220;

    @ApiModelProperty(value = "02:25 负荷,MW")
    private Double p0225;

    @ApiModelProperty(value = "02:30 负荷,MW")
    private Double p0230;

    @ApiModelProperty(value = "02:35 负荷,MW")
    private Double p0235;

    @ApiModelProperty(value = "02:40 负荷,MW")
    private Double p0240;

    @ApiModelProperty(value = "02:45 负荷,MW")
    private Double p0245;

    @ApiModelProperty(value = "02:50 负荷,MW")
    private Double p0250;

    @ApiModelProperty(value = "02:55 负荷,MW")
    private Double p0255;

    @ApiModelProperty(value = "03:00 负荷,MW")
    private Double p0300;

    @ApiModelProperty(value = "03:05 负荷,MW")
    private Double p0305;

    @ApiModelProperty(value = "03:10 负荷,MW")
    private Double p0310;

    @ApiModelProperty(value = "03:15 负荷,MW")
    private Double p0315;

    @ApiModelProperty(value = "03:20 负荷,MW")
    private Double p0320;

    @ApiModelProperty(value = "03:25 负荷,MW")
    private Double p0325;

    @ApiModelProperty(value = "03:30 负荷,MW")
    private Double p0330;

    @ApiModelProperty(value = "03:35 负荷,MW")
    private Double p0335;

    @ApiModelProperty(value = "03:40 负荷,MW")
    private Double p0340;

    @ApiModelProperty(value = "03:45 负荷,MW")
    private Double p0345;

    @ApiModelProperty(value = "03:50 负荷,MW")
    private Double p0350;

    @ApiModelProperty(value = "03:55 负荷,MW")
    private Double p0355;

    @ApiModelProperty(value = "04:00 负荷,MW")
    private Double p0400;

    @ApiModelProperty(value = "04:05 负荷,MW")
    private Double p0405;

    @ApiModelProperty(value = "04:10 负荷,MW")
    private Double p0410;

    @ApiModelProperty(value = "04:15 负荷,MW")
    private Double p0415;

    @ApiModelProperty(value = "04:20 负荷,MW")
    private Double p0420;

    @ApiModelProperty(value = "04:25 负荷,MW")
    private Double p0425;

    @ApiModelProperty(value = "04:30 负荷,MW")
    private Double p0430;

    @ApiModelProperty(value = "04:35 负荷,MW")
    private Double p0435;

    @ApiModelProperty(value = "04:40 负荷,MW")
    private Double p0440;

    @ApiModelProperty(value = "04:45 负荷,MW")
    private Double p0445;

    @ApiModelProperty(value = "04:50 负荷,MW")
    private Double p0450;

    @ApiModelProperty(value = "04:55 负荷,MW")
    private Double p0455;

    @ApiModelProperty(value = "05:00 负荷,MW")
    private Double p0500;

    @ApiModelProperty(value = "05:05 负荷,MW")
    private Double p0505;

    @ApiModelProperty(value = "05:10 负荷,MW")
    private Double p0510;

    @ApiModelProperty(value = "05:15 负荷,MW")
    private Double p0515;

    @ApiModelProperty(value = "05:20 负荷,MW")
    private Double p0520;

    @ApiModelProperty(value = "05:25 负荷,MW")
    private Double p0525;

    @ApiModelProperty(value = "05:30 负荷,MW")
    private Double p0530;

    @ApiModelProperty(value = "05:35 负荷,MW")
    private Double p0535;

    @ApiModelProperty(value = "05:40 负荷,MW")
    private Double p0540;

    @ApiModelProperty(value = "05:45 负荷,MW")
    private Double p0545;

    @ApiModelProperty(value = "05:50 负荷,MW")
    private Double p0550;

    @ApiModelProperty(value = "05:55 负荷,MW")
    private Double p0555;

    @ApiModelProperty(value = "06:00 负荷,MW")
    private Double p0600;

    @ApiModelProperty(value = "06:05 负荷,MW")
    private Double p0605;

    @ApiModelProperty(value = "06:10 负荷,MW")
    private Double p0610;

    @ApiModelProperty(value = "06:15 负荷,MW")
    private Double p0615;

    @ApiModelProperty(value = "06:20 负荷,MW")
    private Double p0620;

    @ApiModelProperty(value = "06:25 负荷,MW")
    private Double p0625;

    @ApiModelProperty(value = "06:30 负荷,MW")
    private Double p0630;

    @ApiModelProperty(value = "06:35 负荷,MW")
    private Double p0635;

    @ApiModelProperty(value = "06:40 负荷,MW")
    private Double p0640;

    @ApiModelProperty(value = "06:45 负荷,MW")
    private Double p0645;

    @ApiModelProperty(value = "06:50 负荷,MW")
    private Double p0650;

    @ApiModelProperty(value = "06:55 负荷,MW")
    private Double p0655;

    @ApiModelProperty(value = "07:00 负荷,MW")
    private Double p0700;

    @ApiModelProperty(value = "07:05 负荷,MW")
    private Double p0705;

    @ApiModelProperty(value = "07:10 负荷,MW")
    private Double p0710;

    @ApiModelProperty(value = "07:15 负荷,MW")
    private Double p0715;

    @ApiModelProperty(value = "07:20 负荷,MW")
    private Double p0720;

    @ApiModelProperty(value = "07:25 负荷,MW")
    private Double p0725;

    @ApiModelProperty(value = "07:30 负荷,MW")
    private Double p0730;

    @ApiModelProperty(value = "07:35 负荷,MW")
    private Double p0735;

    @ApiModelProperty(value = "07:40 负荷,MW")
    private Double p0740;

    @ApiModelProperty(value = "07:50 负荷,MW")
    private Double p0745;

    @ApiModelProperty(value = "07:50 负荷,MW")
    private Double p0750;

    @ApiModelProperty(value = "07:55 负荷,MW")
    private Double p0755;

    @ApiModelProperty(value = "08:00 负荷,MW")
    private Double p0800;

    @ApiModelProperty(value = "08:05 负荷,MW")
    private Double p0805;

    @ApiModelProperty(value = "08:10 负荷,MW")
    private Double p0810;

    @ApiModelProperty(value = "08:15 负荷,MW")
    private Double p0815;

    @ApiModelProperty(value = "08:20 负荷,MW")
    private Double p0820;

    @ApiModelProperty(value = "08:25 负荷,MW")
    private Double p0825;

    @ApiModelProperty(value = "08:30 负荷,MW")
    private Double p0830;

    @ApiModelProperty(value = "08:35 负荷,MW")
    private Double p0835;

    @ApiModelProperty(value = "08:40 负荷,MW")
    private Double p0840;

    @ApiModelProperty(value = "08:45 负荷,MW")
    private Double p0845;

    @ApiModelProperty(value = "08:50 负荷,MW")
    private Double p0850;

    @ApiModelProperty(value = "08:55 负荷,MW")
    private Double p0855;

    @ApiModelProperty(value = "09:00 负荷,MW")
    private Double p0900;

    @ApiModelProperty(value = "09:05 负荷,MW")
    private Double p0905;

    @ApiModelProperty(value = "09:10 负荷,MW")
    private Double p0910;

    @ApiModelProperty(value = "09:15 负荷,MW")
    private Double p0915;

    @ApiModelProperty(value = "09:20 负荷,MW")
    private Double p0920;

    @ApiModelProperty(value = "09:25 负荷,MW")
    private Double p0925;

    @ApiModelProperty(value = "09:30 负荷,MW")
    private Double p0930;

    @ApiModelProperty(value = "09:35 负荷,MW")
    private Double p0935;

    @ApiModelProperty(value = "09:40 负荷,MW")
    private Double p0940;

    @ApiModelProperty(value = "09:45 负荷,MW")
    private Double p0945;

    @ApiModelProperty(value = "09:50 负荷,MW")
    private Double p0950;

    @ApiModelProperty(value = "09:55 负荷,MW")
    private Double p0955;

    @ApiModelProperty(value = "10:00 负荷,MW")
    private Double p1000;

    @ApiModelProperty(value = "10:05 负荷,MW")
    private Double p1005;

    @ApiModelProperty(value = "10:10 负荷,MW")
    private Double p1010;

    @ApiModelProperty(value = "10:15 负荷,MW")
    private Double p1015;

    @ApiModelProperty(value = "10:20 负荷,MW")
    private Double p1020;

    @ApiModelProperty(value = "10:25 负荷,MW")
    private Double p1025;

    @ApiModelProperty(value = "10:30 负荷,MW")
    private Double p1030;

    @ApiModelProperty(value = "10:35 负荷,MW")
    private Double p1035;

    @ApiModelProperty(value = "10:40 负荷,MW")
    private Double p1040;

    @ApiModelProperty(value = "10:45 负荷,MW")
    private Double p1045;

    @ApiModelProperty(value = "10:50 负荷,MW")
    private Double p1050;

    @ApiModelProperty(value = "10:55 负荷,MW")
    private Double p1055;

    @ApiModelProperty(value = "11:00 负荷,MW")
    private Double p1100;

    @ApiModelProperty(value = "11:05 负荷,MW")
    private Double p1105;

    @ApiModelProperty(value = "11:10 负荷,MW")
    private Double p1110;

    @ApiModelProperty(value = "11:15 负荷,MW")
    private Double p1115;

    @ApiModelProperty(value = "11:20 负荷,MW")
    private Double p1120;

    @ApiModelProperty(value = "11:25 负荷,MW")
    private Double p1125;

    @ApiModelProperty(value = "11:30 负荷,MW")
    private Double p1130;

    @ApiModelProperty(value = "11:35 负荷,MW")
    private Double p1135;

    @ApiModelProperty(value = "11:40 负荷,MW")
    private Double p1140;

    @ApiModelProperty(value = "11:45 负荷,MW")
    private Double p1145;

    @ApiModelProperty(value = "11:50 负荷,MW")
    private Double p1150;

    @ApiModelProperty(value = "11:55 负荷,MW")
    private Double p1155;

    @ApiModelProperty(value = "12:00 负荷,MW")
    private Double p1200;

    @ApiModelProperty(value = "12:05 负荷,MW")
    private Double p1205;

    @ApiModelProperty(value = "12:10 负荷,MW")
    private Double p1210;

    @ApiModelProperty(value = "12:15 负荷,MW")
    private Double p1215;

    @ApiModelProperty(value = "12:20 负荷,MW")
    private Double p1220;

    @ApiModelProperty(value = "12:25 负荷,MW")
    private Double p1225;

    @ApiModelProperty(value = "12:30 负荷,MW")
    private Double p1230;

    @ApiModelProperty(value = "12:35 负荷,MW")
    private Double p1235;

    @ApiModelProperty(value = "12:40 负荷,MW")
    private Double p1240;

    @ApiModelProperty(value = "12:40 负荷,MW")
    private Double p1245;

    @ApiModelProperty(value = "12:50 负荷,MW")
    private Double p1250;

    @ApiModelProperty(value = "12:55 负荷,MW")
    private Double p1255;

    @ApiModelProperty(value = "13:00 负荷,MW")
    private Double p1300;

    @ApiModelProperty(value = "13:05 负荷,MW")
    private Double p1305;

    @ApiModelProperty(value = "13:10 负荷,MW")
    private Double p1310;

    @ApiModelProperty(value = "13:15 负荷,MW")
    private Double p1315;

    @ApiModelProperty(value = "13:20 负荷,MW")
    private Double p1320;

    @ApiModelProperty(value = "13:25 负荷,MW")
    private Double p1325;

    @ApiModelProperty(value = "13:30 负荷,MW")
    private Double p1330;

    @ApiModelProperty(value = "13:35 负荷,MW")
    private Double p1335;

    @ApiModelProperty(value = "13:40 负荷,MW")
    private Double p1340;

    @ApiModelProperty(value = "13:45 负荷,MW")
    private Double p1345;

    @ApiModelProperty(value = "13:50 负荷,MW")
    private Double p1350;

    @ApiModelProperty(value = "13:55 负荷,MW")
    private Double p1355;

    @ApiModelProperty(value = "14:00 负荷,MW")
    private Double p1400;

    @ApiModelProperty(value = "14:05负荷,MW")
    private Double p1405;

    @ApiModelProperty(value = "14:10 负荷,MW")
    private Double p1410;

    @ApiModelProperty(value = "14:15 负荷,MW")
    private Double p1415;

    @ApiModelProperty(value = "14:20 负荷,MW")
    private Double p1420;

    @ApiModelProperty(value = "14:25 负荷,MW")
    private Double p1425;

    @ApiModelProperty(value = "14:30 负荷,MW")
    private Double p1430;

    @ApiModelProperty(value = "14:35 负荷,MW")
    private Double p1435;

    @ApiModelProperty(value = "14:40 负荷,MW")
    private Double p1440;

    @ApiModelProperty(value = "14:45 负荷,MW")
    private Double p1445;

    @ApiModelProperty(value = "14:50 负荷,MW")
    private Double p1450;

    @ApiModelProperty(value = "14:55 负荷,MW")
    private Double p1455;

    @ApiModelProperty(value = "15:00 负荷,MW")
    private Double p1500;

    @ApiModelProperty(value = "15:05 负荷,MW")
    private Double p1505;

    @ApiModelProperty(value = "15:10 负荷,MW")
    private Double p1510;

    @ApiModelProperty(value = "15:15 负荷,MW")
    private Double p1515;

    @ApiModelProperty(value = "15:20 负荷,MW")
    private Double p1520;

    @ApiModelProperty(value = "15:25 负荷,MW")
    private Double p1525;

    @ApiModelProperty(value = "15:30 负荷,MW")
    private Double p1530;

    @ApiModelProperty(value = "15:35 负荷,MW")
    private Double p1535;

    @ApiModelProperty(value = "15:40 负荷,MW")
    private Double p1540;

    @ApiModelProperty(value = "15:45 负荷,MW")
    private Double p1545;

    @ApiModelProperty(value = "15:50 负荷,MW")
    private Double p1550;

    @ApiModelProperty(value = "15:55 负荷,MW")
    private Double p1555;

    @ApiModelProperty(value = "16:00 负荷,MW")
    private Double p1600;

    @ApiModelProperty(value = "16:05 负荷,MW")
    private Double p1605;

    @ApiModelProperty(value = "16:10 负荷,MW")
    private Double p1610;

    @ApiModelProperty(value = "16:15 负荷,MW")
    private Double p1615;

    @ApiModelProperty(value = "16:20 负荷,MW")
    private Double p1620;

    @ApiModelProperty(value = "16:25 负荷,MW")
    private Double p1625;

    @ApiModelProperty(value = "16:30 负荷,MW")
    private Double p1630;

    @ApiModelProperty(value = "16:35 负荷,MW")
    private Double p1635;

    @ApiModelProperty(value = "16:40 负荷,MW")
    private Double p1640;

    @ApiModelProperty(value = "16:45 负荷,MW")
    private Double p1645;

    @ApiModelProperty(value = "16:50 负荷,MW")
    private Double p1650;

    @ApiModelProperty(value = "16:55 负荷,MW")
    private Double p1655;

    @ApiModelProperty(value = "17:00 负荷,MW")
    private Double p1700;

    @ApiModelProperty(value = "17:05 负荷,MW")
    private Double p1705;

    @ApiModelProperty(value = "17:10 负荷,MW")
    private Double p1710;

    @ApiModelProperty(value = "17:15 负荷,MW")
    private Double p1715;

    @ApiModelProperty(value = "17:20 负荷,MW")
    private Double p1720;

    @ApiModelProperty(value = "17:25 负荷,MW")
    private Double p1725;

    @ApiModelProperty(value = "17:30 负荷,MW")
    private Double p1730;

    @ApiModelProperty(value = "17:35 负荷,MW")
    private Double p1735;

    @ApiModelProperty(value = "17:40 负荷,MW")
    private Double p1740;

    @ApiModelProperty(value = "17:45 负荷,MW")
    private Double p1745;

    @ApiModelProperty(value = "17:50 负荷,MW")
    private Double p1750;

    @ApiModelProperty(value = "17:55 负荷,MW")
    private Double p1755;

    @ApiModelProperty(value = "18:00 负荷,MW")
    private Double p1800;

    @ApiModelProperty(value = "18:05 负荷,MW")
    private Double p1805;

    @ApiModelProperty(value = "18:10 负荷,MW")
    private Double p1810;

    @ApiModelProperty(value = "18:15 负荷,MW")
    private Double p1815;

    @ApiModelProperty(value = "18:20 负荷,MW")
    private Double p1820;

    @ApiModelProperty(value = "18:25 负荷,MW")
    private Double p1825;

    @ApiModelProperty(value = "18:30 负荷,MW")
    private Double p1830;

    @ApiModelProperty(value = "18:35 负荷,MW")
    private Double p1835;

    @ApiModelProperty(value = "18:40 负荷,MW")
    private Double p1840;

    @ApiModelProperty(value = "18:45 负荷,MW")
    private Double p1845;

    @ApiModelProperty(value = "18:50 负荷,MW")
    private Double p1850;

    @ApiModelProperty(value = "18:55 负荷,MW")
    private Double p1855;

    @ApiModelProperty(value = "19:00 负荷,MW")
    private Double p1900;

    @ApiModelProperty(value = "19:05 负荷,MW")
    private Double p1905;

    @ApiModelProperty(value = "19:10 负荷,MW")
    private Double p1910;

    @ApiModelProperty(value = "19:15 负荷,MW")
    private Double p1915;

    @ApiModelProperty(value = "19:20 负荷,MW")
    private Double p1920;

    @ApiModelProperty(value = "19:25 负荷,MW")
    private Double p1925;

    @ApiModelProperty(value = "19:30 负荷,MW")
    private Double p1930;

    @ApiModelProperty(value = "19:35 负荷,MW")
    private Double p1935;

    @ApiModelProperty(value = "19:40 负荷,MW")
    private Double p1940;

    @ApiModelProperty(value = "19:45 负荷,MW")
    private Double p1945;

    @ApiModelProperty(value = "19:50 负荷,MW")
    private Double p1950;

    @ApiModelProperty(value = "19:55 负荷,MW")
    private Double p1955;

    @ApiModelProperty(value = "20:00 负荷,MW")
    private Double p2000;

    @ApiModelProperty(value = "20:05 负荷,MW")
    private Double p2005;

    @ApiModelProperty(value = "20:10 负荷,MW")
    private Double p2010;

    @ApiModelProperty(value = "20:15 负荷,MW")
    private Double p2015;

    @ApiModelProperty(value = "20:20 负荷,MW")
    private Double p2020;

    @ApiModelProperty(value = "20:25 负荷,MW")
    private Double p2025;

    @ApiModelProperty(value = "20:30 负荷,MW")
    private Double p2030;

    @ApiModelProperty(value = "20:35 负荷,MW")
    private Double p2035;

    @ApiModelProperty(value = "20:40 负荷,MW ")
    private Double p2040;

    @ApiModelProperty(value = "20:45 负荷,MW")
    private Double p2045;

    @ApiModelProperty(value = "20:50 负荷,MW")
    private Double p2050;

    @ApiModelProperty(value = "20:55 负荷,MW")
    private Double p2055;

    @ApiModelProperty(value = "21:00 负荷,MW")
    private Double p2100;

    @ApiModelProperty(value = "21:05 负荷,MW")
    private Double p2105;

    @ApiModelProperty(value = "21:10 负荷,MW")
    private Double p2110;

    @ApiModelProperty(value = "21:15 负荷,MW")
    private Double p2115;

    @ApiModelProperty(value = "21:20 负荷,MW")
    private Double p2120;

    @ApiModelProperty(value = "21:25 负荷,MW")
    private Double p2125;

    @ApiModelProperty(value = "21:30 负荷,MW")
    private Double p2130;

    @ApiModelProperty(value = "21:35 负荷,MW")
    private Double p2135;

    @ApiModelProperty(value = "21:40 负荷,MW")
    private Double p2140;

    @ApiModelProperty(value = "21:45 负荷,MW")
    private Double p2145;

    @ApiModelProperty(value = "21:50 负荷,MW")
    private Double p2150;

    @ApiModelProperty(value = "21:55 负荷,MW")
    private Double p2155;

    @ApiModelProperty(value = "22:00 负荷,MW")
    private Double p2200;

    @ApiModelProperty(value = "22:05 负荷,MW")
    private Double p2205;

    @ApiModelProperty(value = "22:10 负荷,MW")
    private Double p2210;

    @ApiModelProperty(value = "22:15 负荷,MW")
    private Double p2215;

    @ApiModelProperty(value = "22:20 负荷,MW")
    private Double p2220;

    @ApiModelProperty(value = "22:25 负荷,MW")
    private Double p2225;

    @ApiModelProperty(value = "22:30 负荷,MW")
    private Double p2230;

    @ApiModelProperty(value = "22:35 负荷,MW")
    private Double p2235;

    @ApiModelProperty(value = "22:40 负荷,MW")
    private Double p2240;

    @ApiModelProperty(value = "22:45 负荷,MW")
    private Double p2245;

    @ApiModelProperty(value = "22:50 负荷,MW")
    private Double p2250;

    @ApiModelProperty(value = "22:55 负荷,MW")
    private Double p2255;

    @ApiModelProperty(value = "23:00 负荷,MW")
    private Double p2300;

    @ApiModelProperty(value = "23:05 负荷,MW")
    private Double p2305;

    @ApiModelProperty(value = "23:10 负荷,MW")
    private Double p2310;

    @ApiModelProperty(value = "23:15 负荷,MW")
    private Double p2315;

    @ApiModelProperty(value = "23:20 负荷,MW")
    private Double p2320;

    @ApiModelProperty(value = "23:25 负荷,MW")
    private Double p2325;

    @ApiModelProperty(value = "23:30 负荷,MW")
    private Double p2330;

    @ApiModelProperty(value = "23:35 负荷,MW")
    private Double p2335;

    @ApiModelProperty(value = "23:40 负荷,MW")
    private Double p2340;

    @ApiModelProperty(value = "23:45 负荷,MW")
    private Double p2345;

    @ApiModelProperty(value = "23:50 负荷,MW")
    private Double p2350;

    @ApiModelProperty(value = "23:55 负荷,MW")
    private Double p2355;

    @ApiModelProperty(value = "时间（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
