/*
 *  Copyright (c) Liango. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file epl-v10.html at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */

package org.liango.oo.tinyweb;

import org.liango.oo.tinyweb.c.Controller;
import org.liango.oo.tinyweb.f.Filter;

import java.util.List;
import java.util.Map;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 14:45
 */
public class TinyWeb {

    private Map<String, Controller> controllers;
    private List<Filter> filters;

    public TinyWeb(Map<String, Controller> controllers, List<Filter> filters) {
        this.controllers = controllers;
        this.filters = filters;
    }

    public HttpResponse request2Response(HttpRequest httpRequest) {

        // 过滤器
        for (Filter filter : filters) {
            httpRequest = filter.doFilter(httpRequest);
        }

        // 控制器
        String path = httpRequest.getPath();
        Controller controller = controllers.get(path);

        if (controller == null) {
            return null;
        } else {
            return controller.request2Response(httpRequest);
        }
    }
}
