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
