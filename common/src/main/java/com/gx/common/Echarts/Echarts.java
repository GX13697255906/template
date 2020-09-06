package com.gx.common.Echarts;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.AxisLine;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.SplitLine;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;
import com.github.abel533.echarts.style.LineStyle;

import java.util.ArrayList;
import java.util.List;

public class Echarts {


    public List<AccessData> getWeekData() {
        List<AccessData> list = new ArrayList<AccessData>(7);
        list.add(new AccessData("09-16", 4));
        list.add(new AccessData("09-17", 7));
        list.add(new AccessData("09-18", 14));
        list.add(new AccessData("09-19", 304));
        list.add(new AccessData("09-20", 66));
        list.add(new AccessData("09-21", 16));
        list.add(new AccessData("09-22", 205));
        return list;
    }

    public static void main(String[] args) {

        Echarts echarts = new Echarts();
        //获取数据
        List<AccessData> datas = echarts.getWeekData();
//创建Option对象
        Option option = new Option();
//设置图表标题，并且居中显示
        option.title().text("最近7天访问量图表").x(X.center);
//设置图例,居中底部显示，显示边框
        option.legend().data("访问量").x(X.center).y(Y.bottom).borderWidth(1);
//设置y轴为值轴，并且不显示y轴，最大值设置400，最小值-100（OSC为什么要有-100呢？）
        option.yAxis(new ValueAxis().name("IP")
                .axisLine(new AxisLine().show(true).lineStyle(new LineStyle().width(0)))
                .max(400).min(-100));
//创建类目轴，并且不显示竖着的分割线，onZero=false
        CategoryAxis categoryAxis = new CategoryAxis()
                .splitLine(new SplitLine().show(false))
                .axisLine(new AxisLine().onZero(false));
//不显示表格边框，就是围着图标的方框
        option.grid().borderWidth(0);

    }

}
