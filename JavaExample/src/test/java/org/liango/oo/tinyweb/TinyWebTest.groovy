package org.liango.oo.tinyweb

import org.liango.oo.tinyweb.c.Controller
import org.liango.oo.tinyweb.example.wenhou.c.WenHouController
import org.liango.oo.tinyweb.example.wenhou.f.LogingFilter
import org.liango.oo.tinyweb.example.wenhou.v.celue.WenHouMap2StringCeLue
import org.liango.oo.tinyweb.v.View
import org.liango.oo.tinyweb.v.celue.CeLueView
import org.liango.oo.tinyweb.v.celue.Map2StringCeLue

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-12 16:08
 */
class TinyWebTest extends GroovyTestCase {
    void testRequest2Response() {

        Map2StringCeLue map2StringCeLue = new WenHouMap2StringCeLue();
        View view = new CeLueView(map2StringCeLue)
        Controller controller = new WenHouController(view)

        def web = new TinyWeb([(org.liango.oo.tinyweb.example.wenhou.Constant.WENHOU_HTTPREQ_PATH): controller], [new LogingFilter()])

        def httpRequest = new HttpRequest.HttpRequestBuilder().createHttpRequest()
        println "httpRequest = $httpRequest"

        def response = web.request2Response(httpRequest)
        println "response = $response"
    }
}
