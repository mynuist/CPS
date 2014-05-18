<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <title>支付中心-US云打印</title>
    <script type="text/javascript" src=""></script>
	<link rel="stylesheet" type="text/css" href="Client/css/Pay.css">
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
               <p class="align-left align-bottom" style="margin-left:22px;margin-bottom:-2px;"><a class="black_orange" href="">支付中心</a></p>
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
            <!--  <div class="main_middle_part_up "> 
                <div class="left">
                     <ul>
                        <li><a href="">支付中心</a></li>
                        <li>&gt;&gt;</li>
                        <li><a href="">订单支付</a></li> 
                        <li>&gt;&gt;</li>
                        <li><a href="">在线付款</a></li> 
                     </ul>
                </div>                                      
                                                   
              </div>-->
              <div class="main_middle_part_low"> 
                 <div class="pay_page weiruanyahei">
                      <div class="order_brief">
                           <div class="left_part"> 订单包含产品：Word文档，海报等 </div>
                           <div class="right_part"><a href="" class="linkfont">订单详情&gt;&gt;</a></div>
                      </div>
                      <div class="textlist"> 总费用: <font id="orangefont"> 162.4 </font> 元  </div>
                      <div class="textlist"> 余额: <font id="orangefont"> 9.8 </font>元  </div>
                      <div class="textlist"> 余额不足，请先<a id="orangelink" class="weiruanyahei" href="">充值</a> </div>
                      <div class="textlist">
                                                                                                              支付密码：<input type="password" style="width:250px;height:25px"/>
                      </div>
                      <div class="textlist">
                               <input id="orange_btn" type="button" value="支付"/>
                      </div>
                 </div> 
              </div>
        </div>
   </div>
   
   <jsp:include page="../Client/htmlSrc/tail.html"></jsp:include>
   
   
  </body>
</html>
