/*
 *  Copyright (c) Liango. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file epl-v10.html at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */

package org.liango.oo.tinyweb.example

import org.liango.oo.tinyweb.HttpRequest
import org.liango.oo.tinyweb.example.wenhou.c.WenHouController

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-12 15:31
 */
class WenHouControllerTest extends GroovyTestCase {
    void testRequest2Map() {

        println("hi, groovy.")

        assert 'Groovy is cool!' == sprintf('%2$s %3$s %1$s', ['cool!', 'Groovy', 'is'])
        assert '00042' == sprintf('%05d', 42)

        def map = new WenHouController(null).request2Map(new HttpRequest())
        ///MapUtils.debugPrint(System.out, "myMap", map); // 不是很漂亮
        println "map = $map"


    }
}
