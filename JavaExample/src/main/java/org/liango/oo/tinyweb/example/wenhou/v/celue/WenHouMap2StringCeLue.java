package org.liango.oo.tinyweb.example.wenhou.v.celue;

import org.liango.oo.tinyweb.example.wenhou.Constant;
import org.liango.oo.tinyweb.v.celue.Map2StringCeLue;

import java.util.List;
import java.util.Map;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-12 15:38
 */
public class WenHouMap2StringCeLue implements Map2StringCeLue {

    @Override
    public String map2String(Map<String, List<String>> map) {
        List<String> greetings = map.get(Constant.WENHOU_MAP_KEY);
        StringBuilder sb = new StringBuilder();
        for (String greeting : greetings) {
            sb.append(String.format("<h2>%s</h2>\n", greeting));
        }
        return String.valueOf(sb);
    }
}
