<%-- 
    Document   : login
    Created on : Jun 13, 2022, 2:57:37 PM
    Author     : daotr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="img/logonho.png" type="image/x-icon">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/dang-nhap.css">
    <title>MBShop</title>
</head>
<body>
    
    <div class="main-body">
        <form action="dangnhap" method="POST" class="form-login" id="form-1">
            <div class="form-content">
                <div class="form-header">
                    <p>Đăng nhập</p>
                </div>
                <div class="form-body">
                    <div class="form-group">
                        <label for="email" class="form-label">Tài khoản</label>
                        <input id="email" name="user" type="text" placeholder="Tên đăng nhập" class="form-control" onblur="isRequired('#email')">
                        <span class="form-message"></span>
                    </div>
                    <div class="form-group">
                        <label for="password" class="form-label">Mật khẩu</label>
                        <input id="password" name="pass" type="password" placeholder="Nhập mật khẩu" class="form-control">
                        <span class="form-message"></span>
                    </div>
                    <% 
                    String er  = (String) request.getAttribute("error");
                    if(er != null){
                    %>
                    <p style="color:red"><%= er %></p>
                    <%
                        }
                    %>
                </div>
                <div class="form-footer">
                    <button type="submit" class="form-submit" onclick="validate()">ĐĂNG NHẬP</button>
                </div>
                
            </div>
        </form>
    </div>
    
 
<style>
    .main-body{
    padding: 170px 0px 50px 0px;
}
.form-login {
    width: 360px;
    border: 1px solid gray;
    border-radius: 4px;
    margin: 0 auto;
    font-family: 'Open Sans', 'Helvetica Neue', sans-serif;
    border: none;
}
.heading{
    text-align: center;
}
.desc{
    text-align: center;
}
.form-content {
    margin: 20px;
}
.form-header p{
    font-size: 40px;
    text-align: center;
    font-weight: 700;
    color: #151f3c;
    margin-bottom: 8px;
}
.form-group{
    display: grid;
}
.form-label{
    padding-bottom: 6px;
    padding-top: 14px;
    font-weight: bold;
    font-size: 14px;
}
.form-group input{
    padding: 16px 12px;
    font-size: 16px;
    border: none;
    background: #837c7c1f;
}
.form-group input:focus{
    outline: none;
}
.form-footer{
    text-align: center;
    margin-top: 35px;
}
.form-submit{
    background-color: #151f3c;
    outline: none;
    font-weight: 600;
    cursor: pointer;
    border: none;
    color: #fff;
    width: 100%;
    padding: 12px 16px;
    border-radius: 8px;
    font-size: 17px;
    height: 50px;
}
.text-footer{
    display: flex;
    font-size: 15px;
}
.text-footer a{
    margin: 14.5px 10px;
    color: #4060bd;
}
</style>
</body>
</html>