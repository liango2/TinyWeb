package org.liango.oo.tinyweb;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 14:45
 */
public interface Filter {
    HttpRequest doFilter(HttpRequest httpRequest);
}
