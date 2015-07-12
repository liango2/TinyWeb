package org.liango.oo.tinyweb;

import org.liango.oo.tinyweb.example.wenhou.Constant;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 14:50
 */
public class HttpRequest {
    private String path = Constant.WENHOU_HTTPREQ_PATH;
    private String body = "赵薇 , 黄晓明 , 佟大为 , 黎妍 , 姜成镐 , 西蒙·赫尔伯格 , 凯特·戴琳斯 , 罗伯特·帕特里克 , 斯蒂芬·托布罗斯基 , 瑞斯·考罗 , 米西·派勒 , 瑞克·福克斯 , 丽贝卡·奥莱伊尼恰克 , 艾丽西娅·维拉-贝利 , 布莱恩·史密斯 , 帕维什·齐纳 , 奥马尔·J·多尔西 , 布里奇特·莱利";

    private HttpRequest(HttpRequestBuilder httpRequestBuilder) {
        this.path = httpRequestBuilder.path;
        this.body = httpRequestBuilder.body;
    }

    public String getPath() {
        return path;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "◎ HttpRequest{" +
                "path='" + path + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public static class HttpRequestBuilder {
        private String path;
        private String body;

        public HttpRequestBuilder setPath(String path) {
            this.path = path;
            return this;
        }

        public HttpRequestBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public HttpRequest createHttpRequest() {
            return new HttpRequest(this);
        }
    }
}
