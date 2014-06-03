<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <title>填写用户信息-US云打印</title>
    <script type="text/javascript" src=""></script>
	<link rel="stylesheet" type="text/css" href="Client/css/InputUserinfo.css">
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
               <p class="align-left align-bottom" style="margin-left:22px;margin-bottom:-2px;"><a class="black_orange" href="">填写真实学生信息</a></p>
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
              <div class="main_middle_part_up weiruanyahei"> 
                                                                       填写真实信息，升级为校园联盟VIP会员！从此打印只需要 8分 钱/张。还有更多后续惊喜产品等着您～
              </div>
              <div class="main_middle_part_low"> 
                 <div class="main_inner_left">
                    <iframe src="Client/comSrc/user_input_info_com/luyu_form.html" width="370px" height="650px" id="input_info_frame" frameborder="0" scrolling="no"  style="display: block;margin-left:20px;"></iframe>
                  </div>
                  <div class="main_inner_right">
                     <img src="Client/img/userinfo_input_pic.png" style="width:450px;height: 500px;margin-top:40px;margin-right:100px;" />
                  </div>
              </div>
             
        </div>
   </div>
   
   <jsp:include page="../Client/htmlSrc/tail.html"></jsp:include>
   
   
  </body>
</html>
