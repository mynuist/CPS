<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <title>产品列表-US云打印</title>
    <script type="text/javascript" src=""></script>
	<link rel="stylesheet" type="text/css" href="Client/css/Product.css">
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
               <p class="align-left align-bottom" style="margin-left:22px;margin-bottom:-2px;"><a class="black_orange" href="">产品和服务</a></p>
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
          <!--    <div class="main_middle_part_up "> 
                <div class="left">
                     <ul>
                        <li><a href="">产品和服务</a></li> 
                        <li>&gt;&gt;</li>
                        <li><a href="">打印产品</a></li> 
                     </ul>
                </div>                                      
                <div class="right" style="margin-right:30px;">
                     <ul >
  
                     </ul>
                </div>                                          
              </div> -->
              <div class="main_middle_part_low"> 
                 <div class="productlist">
                      <iframe src="Client/comSrc/luyu_frames/productlist.html" width="100%" height="500px"  frameborder="0" scrolling="no" ></iframe>
                 </div> 
              </div>
        </div>
   </div>
   
    <jsp:include page="../Client/htmlSrc/tail.html"></jsp:include>
   
   
  </body>
</html>
