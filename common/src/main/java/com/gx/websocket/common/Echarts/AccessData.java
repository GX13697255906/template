package com.gx.websocket.common.Echarts;

//数据对象
class AccessData {
    //日期
    private String date;
    //访问量
    private Integer nums;

    AccessData(String date, Integer nums) {
        this.date = date;
        this.nums = nums;
    }

    public String getDate() {
        return date;
    }

    public Integer getNums() {
        return nums;
    }
}
