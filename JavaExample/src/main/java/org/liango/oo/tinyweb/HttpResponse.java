package org.liango.oo.tinyweb;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 14:50
 */
public class HttpResponse {
    private  Integer responseCode;
    private String responseBody;

    public HttpResponse(Integer responseCode, String responseBody) {
        this.responseCode = responseCode;
        this.responseBody = responseBody;
    }

    @Override
    public String toString() {
        return "● HttpResponse{" +
                "responseCode=" + responseCode +
                ", responseBody='" + responseBody + '\'' +
                '}';
    }
}
