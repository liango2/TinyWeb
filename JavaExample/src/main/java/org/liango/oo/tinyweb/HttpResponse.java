package org.liango.oo.tinyweb;

/**
 * @author liango
 * @version 1.0
 * @since 2015-07-11 14:50
 */
public class HttpResponse {
    private Integer responseCode; // 响应码
    private String responseBody; // 响应体


    //    java创建 不可变对象的方式
//    1. 使用 构造方法的方式 创建对象 的缺点是：对于 大规模类 会显得笨拙
//    2. 使用 getter/setter方式 创建对象 的缺点是： 会引入可变性
//    3. 使用 生成器模式: 生成器模式 是java中 获取不可变对象的标准方式
    public HttpResponse(HttpResponseBuilder httpResponseBuilder) {
        this.responseCode = httpResponseBuilder.responseCode;
        this.responseBody = httpResponseBuilder.responseBody;
    }

    @Override
    public String toString() {
        return "● HttpResponse{" +
                "responseCode=" + responseCode +
                ", responseBody='" + responseBody + '\'' +
                '}';
    }


    /**
     * <<Effective Java, 2nd Edition >>
     * -  Item 2: Consider a builder when faced with many constructor parameters
     * In summary, the Builder pattern is a good choice when designing classes whose constructors or static factories would have more than a handful of parameters, especially if most of those parameters are optional. Client code is much easier to read and write with builders than with the traditional telescoping constructor pattern, and builders are much safer than JavaBeans.
     */
    public static class HttpResponseBuilder {
        private Integer responseCode;
        private String responseBody;

        public HttpResponseBuilder setResponseCode(Integer responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        public HttpResponseBuilder setResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }

        public HttpResponse createHttpResponse() {
            return new HttpResponse(this);
        }
    }
}
