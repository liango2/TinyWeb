/*
 *  Copyright (c) Liango. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file epl-v10.html at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */

package org.liango.oo.tinyweb.c;

import org.liango.oo.tinyweb.HttpRequest;
import org.liango.oo.tinyweb.HttpResponse;
import org.liango.oo.tinyweb.v.View;

import java.util.List;
import java.util.Map;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 15:26
 */
public abstract class TemplateController implements Controller {

    private View view;

    public TemplateController(View view) {
        this.view = view;
    }

    @Override
    public HttpResponse request2Response(HttpRequest httpRequest) {
        Map<String, List<String>> map = request2Map(httpRequest);
        Integer responseCode = 200;
        String responseBody = view.map2String(map);
        return new HttpResponse.HttpResponseBuilder().setResponseCode(responseCode).setResponseBody(responseBody).createHttpResponse();
    }

      protected abstract Map<String, List<String>> request2Map(HttpRequest httpRequest);
}
