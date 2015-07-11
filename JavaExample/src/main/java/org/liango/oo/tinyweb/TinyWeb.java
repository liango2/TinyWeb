package org.liango.oo.tinyweb;

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

    public HttpResponse handleRequerst(HttpRequest httpRequest) {

        // ¹ýÂËÆ÷
        for (Filter filter : filters) {
            httpRequest = filter.doFilter(httpRequest);
        }

        // ¿ØÖÆÆ÷
        String path = httpRequest.getPath();
        Controller controller = controllers.get(path);

        if (controller == null) {
            return null;
        } else {
            return controller.handleRequest(httpRequest);
        }
    }
}
