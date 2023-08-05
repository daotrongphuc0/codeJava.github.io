<%-- 
    Document   : user-list
    Created on : Aug 25, 2022, 2:49:20 PM
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
                        <a href="" class="navbar-brand">Management App </a>
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

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of sach</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="sach-form.jsp" class="btn btn-success">Add
     New sach</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>ten</th>
                                <th>Tac gia</th>
                                <th>The loai</th>
                                <th>gia</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="sach" items="${listS}">

                                <tr>
                                    <td>
                                        <c:out value="${sach.id}" />
                                    </td>
                                    <td>
                                        <c:out value="${sach.ten}" />
                                    </td>
                                    <td>
                                        <c:out value="${sach.tacGia}" />
                                    </td>
                                    <td>
                                        <c:out value="${sach.theLoai}" />
                                    </td>
                                    <td>
                                        <c:out value="${sach.gia}" />
                                    </td>
                                    
                                    <td><a href="edit_sach?id=<c:out value='${sach.id}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete_sach?id=<c:out value='${sach.id}' />">Delete</a></td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
            <style>
                            #dx{
                                margin-left: 70%;
                            }
                        </style>
        </body>

        </html>
