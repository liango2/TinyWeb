/*
 *  Copyright (c) Liango. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file epl-v10.html at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */

package org.liango.oo.tinyweb.server.jetty.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 一个 http servelet
 * 使用 javax.servelet.jar  D:/tomcat/apache-tomcat-6.0.41-windows-x86/lib/servlet-api.jar!/
 */
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String appid = httpServletRequest.getParameter("appid");
        String conta = httpServletRequest.getParameter("conta");

        System.out.println("Appid : " + appid);
        System.out.println("Conta : " + conta);

        httpServletResponse.setContentType("text/plain");
        PrintWriter out = httpServletResponse.getWriter();
        out.println("Hello World!");
        out.close();
    }
}