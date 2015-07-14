/*
 *  Copyright (c) Liango. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file epl-v10.html at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */

package org.liango.oo.tinyweb.v.celue;

import org.liango.oo.tinyweb.v.View;
import org.liango.oo.tinyweb.v.ex.Map2StringCeLueException;

import java.util.List;
import java.util.Map;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-12 14:55
 */
public class CeLueView implements View {

    private Map2StringCeLue map2StringCeLue;

    public CeLueView(Map2StringCeLue map2StringCeLue) {
        this.map2StringCeLue = map2StringCeLue;
    }

    @Override
    public String map2String(Map<String, List<String>> map) {
        try {
            return map2StringCeLue.map2String(map);
        } catch (Exception e) {
            throw new Map2StringCeLueException(e);
        }
    }
}
