package org.liango.oo.tinyweb.example.wenhou.v.celue

import org.liango.oo.tinyweb.example.wenhou.Constant

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-12 15:51
 */
class WenHouMap2StringCeLueTest extends GroovyTestCase {

    void testMap2String() {
        def ceLue = new WenHouMap2StringCeLue()
        def string = ceLue.map2String([(Constant.WENHOU_MAP_KEY): ['John', 'Peter', 'Mark']])
        println "string = $string"

        //------------------------------
        // 其他
        // groovy 相关
        Integer inm1 = 10
        String int2f = 'hello'

        // Regular map with string keys
        assert [inm1: 'hello', int2f: 'world'] == ['inm1': 'hello', 'int2f': 'world']

        // And evaluated keys in parentheses
        assert [(inm1): 'hello', (int2f): 'world'] == [10: 'hello', 'hello': 'world']
    }
}
