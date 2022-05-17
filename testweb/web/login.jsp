<%-- 
    Document   : testweb
    Created on : May 17, 2022, 6:05:24 PM
    Author     : daotr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color: blue">dang nhap</h1>
        <% 
            if(request.getAttribute("error") != null){
                String error = (String) request.getAttribute("error");
            %>
        <h1 style="color: red"><%= error%></h1>
        <%
            }
        %>
        <form action="login" method="get">
            Tai khoan:<input type="text" name="user"/><br/>
            Mat khau:<input type="text" name="pass"/><br/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
