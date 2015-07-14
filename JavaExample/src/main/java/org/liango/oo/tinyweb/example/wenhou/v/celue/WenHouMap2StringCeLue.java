/*
 *  Copyright (c) Liango. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file epl-v10.html at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */

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
