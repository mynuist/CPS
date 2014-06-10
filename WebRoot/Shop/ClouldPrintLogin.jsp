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
	<link rel="stylesheet" type="text/css" href="Shop/css/login.css">
  </head>
  <body>
   
   
   <div class="head">
       <div class="head_middle_part">
             <div class="head_inner_first">
                <p class="english" >US</><p class="chinese"  >云打印</p>
             </div>
             <div class="head_inner_second">
               <p  ><a href=""><img src="Client/img/school_logo.png" style="width:20px;height:20px;" /></a></p>
               <p style="margin-left:25px;margin-top:5px;" ><a class="black_orange" href="">南京信息工程大学站</a></p>
             </div> 
           <div class="head_inner_third">
               <p class="fangzhengshuti" >智能校园，让校园生活更美好</p>
             </div>
       </div>
      
   </div>
   
   <div  style="height:100px;">
   </div>
   <div class="main">
        <div class="main_middle_part">
             
        </div>
   </div>
   
    <jsp:include page="../Client/htmlSrc/tail.html"></jsp:include>
   
   
  </body>
</html>
