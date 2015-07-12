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
