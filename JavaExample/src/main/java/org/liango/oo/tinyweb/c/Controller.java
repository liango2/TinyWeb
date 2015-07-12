package org.liango.oo.tinyweb.c;

import org.liango.oo.tinyweb.HttpRequest;
import org.liango.oo.tinyweb.HttpResponse;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 14:44
 */
public interface Controller {
    HttpResponse request2Response(HttpRequest httpRequest);
}
