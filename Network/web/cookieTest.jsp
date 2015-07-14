<%--
  ~  Copyright (c) Liango. All rights reserved.
  ~  The use and distribution terms for this software are covered by the
  ~  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
  ~  which can be found in the file epl-v10.html at the root of this distribution.
  ~  By using this software in any fashion, you are agreeing to be bound by
  ~  the terms of this license.
  ~  You must not remove this notice, or any other, from this software.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: liango
  Date: 2015-07-13
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie cookie = new Cookie("username", "guest");

    cookie.setMaxAge(100);
    response.addCookie(cookie);
%>
<html>
<head>
    <title>HttpCookie Demo</title>
</head>
<body>
Add cookie. Cookie name
= <%=cookie.getName() + ". Cookie value = " + cookie.getValue() %>
</body>
</html>