/*
 *  Copyright (c) Liango. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file epl-v10.html at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */

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
