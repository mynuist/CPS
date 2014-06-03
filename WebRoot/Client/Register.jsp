<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <title>注册,加入我们-US云打印</title>
    <script type="text/javascript" src=""></script>
	<link rel="stylesheet" type="text/css" href="Client/css/Register.css">
  </head>
  <body>
   
   
    <jsp:include page="../Client/htmlSrc/nav.html"></jsp:include>
   
   
   <div class="head">
       <div class="head_middle_part">
             <div class="head_inner_first">
                <p class="english" style="margin-bottom:-8px;" >US</><p class="chinese"  style="margin-bottom:-8px;">云打印</p>
             </div>
             <div class="head_inner_second weiruanyahei">
               <p class="align-left align-bottom" style="margin-bottom:-2px; font-size:30px" >|</p>
               <p class="align-left align-bottom" style="margin-left:22px;margin-bottom:-2px;"><a class="black_orange" href="">新用户注册</a></p>
             </div> 
            <div class="head_inner_third">
               <p class="align-right align-bottom" style="margin-bottom:-4px;margin-right:2px;">校盟网提示您，使用US云打印可以大大节省打印开销</p>
             </div>
       </div>
       <div class="head_footline">
       </div>
   </div>
   
   
   <div class="main">
        <div class="main_middle_part">
            <div class="main_middle_part_up "> 
                 <img src="Client/img/register_main_top.jpg" style="width:900px;height: 40px;margin-top:10px;" />                   
              </div>
              <div class="main_middle_part_low"> 
                 <div class="low_left">
                     <iframe src="Client/comSrc/luyu_frames/quick_register.html" width="370px" height="450px" id="input_info_frame" frameborder="0" scrolling="no"  style="margin-top:60px;margin-left:20px;"></iframe>
                 </div> 
                  <div class="low_right">
                     <img src="Client/img/userinfo_input_pic.png" style="width:450px;height: 500px;margin-top:20px;margin-right:100px;" />
                 </div> 
              </div>
        </div>
   </div>
   
    <jsp:include page="../Client/htmlSrc/tail.html"></jsp:include>
   
   
  </body>
</html>
