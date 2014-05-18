<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <title>登录-US云打印</title>
    <script type="text/javascript" src=""></script>
	<link rel="stylesheet" type="text/css" href="Client/css/login.css">
  </head>
  <body>
   
   
   <div class="head">
       <div class="head_middle_part">
             <div class="head_inner_first">
                <p class="english" style="margin-bottom:-8px;" >US</><p class="chinese"  style="margin-bottom:-8px;">云打印</p>
             </div>
             <div class="head_inner_second">
               <p class="align-left align-bottom" style="margin-bottom:6px;" ><a href=""><img src="Client/img/school_logo.png" style="width:20px;height:20px;" /></a></p>
               <p class="align-left align-bottom" style="margin-left:22px;margin-bottom:3px;"><a class="black_orange" href="">南京信息工程大学站</a></p>
             </div> 
           <div class="head_inner_third">
               <p class="align-right align-bottom" style="margin-bottom:2px;margin-right:2px;">校盟网提示您，使用US云打印可以大大节省打印开销</p>
             </div>
       </div>
       <div class="head_footline">
       </div>
   </div>
   
   
   <div class="main">
        <div class="main_middle_part">
              <div class="main_inner_left">
                 <img src="Client/img/login_main_pic.png" style="width:70%;height: 70%;margin-top:40px;margin-left:60px;" />
              </div>
              <div class="main_inner_right">
                <iframe src="Client/comSrc/user_login_com/login.html" width="286" height="387" id="loginIframe" frameborder="0" scrolling="no"  style="display: block;"></iframe>
              </div>
        </div>
   </div>
   
    <jsp:include page="../Client/htmlSrc/tail.html"></jsp:include>
   
   
  </body>
</html>
