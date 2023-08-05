<%-- 
    Document   : GioHang
    Created on : Jun 21, 2022, 4:22:27 AM
    Author     : daotr
--%>


<%@page import="model.DatSach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.NguoiDung"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@taglib   uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hieu Sach</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
              crossorigin="anonymous">
        <link rel="stylesheet" href="css/gio-hang.css" type="text/css">
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
        <section>
            <table class="listSanPham" style="width: 100%;">
                <tbody>
                    <tr>
                        <th>STT</th>
                        <th>Tên sản phẩm</th>
                        <th>Giá</th>
                        <th>Số lượng</th>
                        <th>Thành tiền</th>
                        <th>Xoá</th>
                    </tr>
                    <% 
                    ArrayList<DatSach> list = (ArrayList<DatSach>)request.getAttribute("list_gh");
                    int dem =0,gia=0;
                    for(DatSach ghi:list){
                    dem++;
                    gia+=ghi.tinhGia();
                    %>
                    <tr>
                        <td><%= dem  %></td>
                        <td class="noPadding">
                            <a href="chi_tiet_san_pham?id=<%= ghi.getSach().getId() %>" target="_blank" title="Xem chi tiết"><%= ghi.getSach().getTen() %></a>
                        </td>
                        <td class="alignRight"><fmt:setLocale value="vi_VN"/><fmt:formatNumber value="<%= ghi.getSach().getGia()  %>" type="currency"/></td>
                        <td class="soluong">
                            <a href="update_so_luong?idsp=<%= ghi.getSach().getId() %>&soluong=<%= ghi.getSl()-1 %>"><i class="fa fa-minus"></i></a>
                            
                            <p><%= ghi.getSl() %></p>
                            <a href="update_so_luong?idsp=<%= ghi.getSach().getId() %>&soluong=<%= ghi.getSl()+1 %>"><i class="fa fa-plus"></i></a>
                        </td>
                        <td class="alignRight"><fmt:setLocale value="vi_VN"/><fmt:formatNumber value="<%=  ghi.tinhGia() %>" type="currency"/></td>
                        <td class="noPadding1">
                            <a href="xoa_san_pham_gh?idDS=<%= ghi.getId() %>"><i class="fa fa-trash"></i></a>
                        </td>
                    </tr>
                    
                    
                    
                    <%
                        }
                    
                    %>
                    

                </tbody>
            </table>
            <div class="thanhtien">
                Thành tiền (VNĐ):
                <span class="gia"><fmt:setLocale value="vi_VN"/><fmt:formatNumber value="<%=  gia %>" type="currency"/> </span>
            </div>
            <div class="delete">
                <a href=""><input type="button" class="deleteall" value="Thanh toán"></a>
            </div>
        </section>
        
    </body>
</html>