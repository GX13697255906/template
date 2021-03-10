package com.gx.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoxun
 * ConCurrentHashMap  线程安全切高效的HashMap
 */
public class concurrentHasnMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "GX");

    }

}
