/*
 *  Copyright (c) Liango. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file epl-v10.html at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */

package org.liango.oo.tinyweb.server.jetty;

import org.mortbay.http.SocketListener;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.ServletHttpContext;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Jetty/Tutorial/Embedding Jetty - Eclipsepedia
 * http://wiki.eclipse.org/Jetty/Tutorial/Embedding_Jetty
 */
public class Jetty {

    /**
     * 测试： - 打开浏览器 访问 http://localhost:8080/MO
     * @param args
     */
    public static void main(String[] args) {
        try {
            Server server = new Server();
            SocketListener socketListener = new SocketListener();

            System.out.println("Max Thread :" + socketListener.getMaxThreads() + " Min Thread :" + socketListener.getMinThreads());

            socketListener.setHost("localhost");
            socketListener.setPort(8080);
            socketListener.setMinThreads(5);
            socketListener.setMaxThreads(250);
            server.addListener(socketListener);

            ServletHttpContext context = (ServletHttpContext) server.getContext("/");
            context.addServlet("/MO", "org.liango.oo.tinyweb.server.jetty.servelet.HelloWorldServlet");

            server.start();
            server.join();

        /*//We will create our server running at http://localhost:8070
        Server server = new Server();
        server.addListener(":8070");

        //We will deploy our servlet to the server at the path '/'
        //it will be available at http://localhost:8070
        ServletHttpContext context = (ServletHttpContext) server.getContext("/");
        context.addServlet("/MO", "jetty.HelloWorldServlet");

        server.start();
        */

        } catch (Exception ex) {
            Logger.getLogger(Jetty.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
} 