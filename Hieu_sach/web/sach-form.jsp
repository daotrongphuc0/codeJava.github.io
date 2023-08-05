<%-- 
    Document   : sach-form
    Created on : Aug 25, 2022, 2:52:02 PM
    Author     : daotr
--%>

<%@page import="model.NguoiDung"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>User Management Application</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="https://www.javaguides.net" class="navbar-brand"> User Management App </a>
                    </div>

                   <ul class="navbar-nav">
                        <li><a href="/Hieu_sach/admin_nguoidung" class="nav-link">Users</a></li>
                    </ul>
                    <ul class="navbar-nav">
                        <li><a href="/Hieu_sach/admin_sach" class="nav-link">Sach</a></li>
                    </ul>
                    <ul class="navbar-nav" id="dx">
                         <%
                        NguoiDung tmp = (NguoiDung) session.getAttribute("account");
                        %>
                        <li><a href="dangxuat" class="nav-link"><p><%= tmp.getTen()%></p>Đăng xuât</a></li>
                        
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${sach != null}">
                            <form action="update_sach" method="post">
                        </c:if>
                        <c:if test="${sach == null}">
                            <form action="add_new_sach" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${sach != null}">
                                    Edit sach
                                </c:if>
                                <c:if test="${sach == null}">
                                    Add New sach
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${sach != null}">
                            <input type="hidden" name="id" value="<c:out value='${sach.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>Name</label> <input type="text" value="<c:out value='${sach.ten}' />" class="form-control" name="ten" required="required">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Tac gia</label> <input type="text" value="<c:out value='${sach.tacGia}' />" class="form-control" name="tacGia" required="required">
                        </fieldset><!-- comment -->
                        
                        <fieldset class="form-group">
                            <label>The loai</label> <input type="text" value="<c:out value='${sach.theLoai}' />" class="form-control" name="theLoai" required="required">
                        </fieldset>

                        

                        <fieldset class="form-group">
                            <label>Gia</label> <input type="text" value="<c:out value='${sach.gia}' />" class="form-control" name="gia" required="required">
                        </fieldset><!-- comment -->
                        
                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
                        <style>
                            #dx{
                                margin-left: 70%;
                            }
                        </style>
        </body>

        </html>

