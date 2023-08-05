<%-- 
    Document   : user-form
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
                        <c:if test="${user != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${user == null}">
                            <form action="add_new_user" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${user != null}">
                                    Edit User
                                </c:if>
                                <c:if test="${user == null}">
                                    Add New User
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${user != null}">
                            <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>User Name</label> <input type="text" value="<c:out value='${user.ten}' />" class="form-control" name="ten" required="required">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Tai khoan</label> <input type="text" value="<c:out value='${user.tk}' />" class="form-control" name="tk" required="required">
                        </fieldset><!-- comment -->
                        
                        <fieldset class="form-group">
                            <label>Mat khau</label> <input type="text" value="<c:out value='${user.mk}' />" class="form-control" name="mk" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Email</label> <input type="text" value="<c:out value='${user.email}' />" class="form-control" name="email">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Dia chi</label> <input type="text" value="<c:out value='${user.diaChi}' />" class="form-control" name="diaChi">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Vai tro</label> <input type="text" value="<c:out value='${user.vaiTro}' />" class="form-control" name="vaiTro" required="required">
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

