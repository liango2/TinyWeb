package org.liango.oo.tinyweb.util;

import sun.applet.Main;

import java.util.*;

public class PrettyPrintingMap<K, V> {
    private Map<K, V> map;

    public PrettyPrintingMap(Map<K, V> map) {
        this.map = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<K, V>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<K, V> entry = iter.next();
            sb.append(entry.getKey());
            sb.append(':');


            V value = entry.getValue();
            if (value instanceof List) {
                sb.append('[');
                ((List) value).forEach(o1 -> sb.append(o1 + System.lineSeparator()));
                sb.append(']');
            } else {
                sb.append(value);
            }
            if (iter.hasNext()) {
                sb.append(',').append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<String, List<String>>() {{
            put("《横冲直撞好莱坞》", Arrays.asList("赵薇", "黄晓明", "佟大为"));
        }};

        PrettyPrintingMap<String, List<String>> map1 = new PrettyPrintingMap<>(map);
        System.out.println("map1 = " + map1);
    }
}