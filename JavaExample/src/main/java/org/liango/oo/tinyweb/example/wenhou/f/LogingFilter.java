package org.liango.oo.tinyweb.example.wenhou.f;

import org.liango.oo.tinyweb.HttpRequest;
import org.liango.oo.tinyweb.f.Filter;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-12 16:43
 */
public class LogingFilter implements Filter {
    @Override
    public HttpRequest doFilter(HttpRequest httpRequest) {

        System.out.println("▓ LogingFilter： 类LongingFilter的doFilter(HttpRequest httpRequest)方法;  参数httpRequest = " + httpRequest);

        return httpRequest;
    }
}
