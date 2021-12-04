<%-- 
    Document   : login
    Created on : 03-Dec-2021, 16:50:56
    Author     : IRFAN ALAM
--%>
<%@include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login ke Aplikasi Kas Bulanan 5D</title>
    </head>
    <body>
        <form method="get" modelAttribute="emp" action="login/save.htm">
            <table align="center">
                <tr>
                <td>Username</td><td><input type="text" name="username"/></td>
                </tr>
                <tr>
                  <td>Password:</td><td><input type="password" name="password"/></td>
                <tr><td colspan="2"><input type="submit" value="Login"/></td></tr>
                <tr><td colspan="2">${message}</td></tr>
                </tr>
            </table>
        </form>
    </body>
</html>
