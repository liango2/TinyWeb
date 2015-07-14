;
;  Copyright (c) Liango. All rights reserved.
;  The use and distribution terms for this software are covered by the
;  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;  which can be found in the file epl-v10.html at the root of this distribution.
;  By using this software in any fashion, you are agreeing to be bound by
;  the terms of this license.
;  You must not remove this notice, or any other, from this software.
;

(ns
  ^{:author liango}
  org.liango.oo.tinyweb.step1
  (:import (org.liango.oo.tinyweb HttpRequest HttpRequest$HttpRequestBuilder)))

(defn test-controller [http-request] {:name (.getBody http-request)})
(def test-builder (HttpRequest$HttpRequestBuilder.))
(def test-http-request (.. test-builder (setPath "/say-hello") (setBody "i'm body of http-request") createHttpRequest))
(defn test-controller-with-map [test-http-request] {:name (:body test-http-request)})

(println (test-controller test-http-request))

(println (test-controller-with-map {:body "i'm body of a map"}))


