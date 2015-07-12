package org.liango.oo.tinyweb.f;

import org.liango.oo.tinyweb.HttpRequest;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 14:45
 */
public interface Filter {
    HttpRequest doFilter(HttpRequest httpRequest);
}
