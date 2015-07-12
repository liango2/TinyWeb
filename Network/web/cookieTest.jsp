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
