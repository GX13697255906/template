package com.fx.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fan
 * @date 2016/4/7
 */
public class MainTest {
    public static void main(String[] args) {
        Map<MapKey, Integer> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            MapKey key = new MapKey(i);
            System.out.println("hashCode = "+key.hashCode());
            int h= (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            System.out.println("h = "+h);
            map.put(key, i);
        }


    }


}
