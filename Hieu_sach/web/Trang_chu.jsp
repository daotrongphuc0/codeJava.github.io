<%-- 
    Document   : Trang_chu
    Created on : Aug 23, 2022, 5:15:25 PM
    Author     : daotr
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Sach"%>
<%@page import="model.NguoiDung"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hieu Sach</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/index.css" type="text/css">
    </head>
    <body>
        <div class="container-menu">
            <div class = "Menu">
                <div class="search">
                    <form action="">
                        <input type="text"  placeholder="Tim kiem">
                        <input type="submit"  value="tim">
                    </form>
                </div>
                <ul class="topnav">
                    <li>
                        <a href="trangchu">
                            <i class="fa fa-home" aria-hidden="true"></i>
                            <p>Trang chủ</p>
                        </a>
                    </li>

                    <%
                        NguoiDung tmp = (NguoiDung) session.getAttribute("account");
                        if (tmp != null) {
                    %>
                    <li>
                        <a href="giohang">
                            <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                            <p>Giỏ hàng</p>
                        </a>
                    </li>
                    <%
                    } else {
                    %>
                    <li>
                        <a href="login.jsp">
                            <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                            <p>Giỏ hàng</p>
                        </a>
                    </li>
                    <%
                        }
                    %>


                    <%
                        //NguoiDung tmp = (NguoiDung) session.getAttribute("account");
                        if (tmp != null) {
                    %>
                    <li>
                        <a href="dangxuat">
                            <i class="fa fa-user-circle-o" aria-hidden="true"></i>
                            <p><%= tmp.getTen()%></p>
                            <p color="red">Đăng xuât</p>
                        </a>
                    </li>
                    <%
                    } else {
                    %>
                    <li>
                        <a href="login.jsp">
                            <i class="fa fa-user-circle-o" aria-hidden="true"></i>
                            <p>Đăng nhập</p>
                        </a>
                    </li>
                    <%
                        }
                    %>
                </ul>
            </div>
        </div>
        <div class="body1">
            <table class="tb" border="1px">
                <tr>
                    <th>ten</th>
                    <th>tac gia</th>
                    <th>gia</th>
                    <th></th>
                </tr>
                <%
                    ArrayList<Sach> dss = (ArrayList<Sach>) request.getAttribute("dssach");
                    for (Sach i : dss) {
                %>
                <tr>
                    <td class="tablerow"><%= i.getTen()%></td>
                    <td class="tablerow"><%= i.getTacGia()%></td>
                    <td class="tablerow"><%= i.getGia()%></td>
                    
                    <%
                        //NguoiDung tmp = (NguoiDung) session.getAttribute("account");
                        if (tmp != null) {  
                    %>
                        <td class="tablerow"><a href="them_sp_vao_gh?idsp=<%= i.getId() %>" >them</a></td>
                    <%
                    } else {
                    %>
                        <td class="tablerow"><a href="login.jsp" >them</a></td>
                <%
                    }
                %>
                </tr>
                <%
                    }
                %>
            </table>

        </div>
        <div class="footer"></div>
    </div>

</body>
</html>
