<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String pagePath = basePath + "Client/comSrc/luyu_frames/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>订单列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=pagePath %>css/luyu_user_center.css">

  </head>
  
  <body>
    <div id="order_field">
    	<div id="order_top_index">
    		<a href="<%=pagePath %>luyu_user_center_account.jsp" style="">我的账户</a>
    		<a href="<%=pagePath %>luyu_user_center_info.jsp" style="background-color:#f6f6f6;">个人资料</a>
    		<a href="<%=pagePath %>luyu_user_center_consumption_record.jsp" style="">消费记录</a>
    		<a href="<%=pagePath %>luyu_user_center_charge_record.jsp" style="">充值记录</a>
    	</div>
    	
    	<div id="order_ctnt_field">
    		<div class="luyu_user_center_account_title" >
    			基本信息
    		</div>
    		<table class="luyu_user_center_account_table" style="margin-left:12px;" cellspacing="8" cellpadding="0">
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					姓名
    				</td>
    				<td class="luyu_user_center_account_table_text_1">
    					汤波<span style="color:#F0D232;font-weight:bold;">&nbsp;已通过学生认证</span><img alt="" width="15" height="15" src="<%=pagePath %>img/vip_logo.png"/>
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					昵称
    				</td>
    				<td class="luyu_user_center_account_table_text_1">
    					阿汤哥玩校盟
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					性别
    				</td>
    				<td class="luyu_user_center_account_table_text_1">
    					男
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					邮箱
    				</td>
    				<td class="luyu_user_center_account_table_text_1" >
    					user@mail.com
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					QQ
    				</td>
    				<td class="luyu_user_center_account_table_text_1" >
    					12345678
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					手机
    				</td>
    				<td class="luyu_user_center_account_table_text_1" >
    					1391112333
    			</tr>
    		</table>
    		
    		<div class="luyu_user_center_account_title" style="margin-top:20px;">
    			学生信息
    		</div>
    		<table class="luyu_user_center_account_table" style="margin-left:12px;" cellspacing="8" cellpadding="0">
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					班级信息
    				</td>
    				<td class="luyu_user_center_account_table_text_1">
    					南京信息工程大学|研究生|计算机与软件学院|计算机应用|研究生（1）班
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					学号
    				</td>
    				<td class="luyu_user_center_account_table_text_1">
    					20111231234
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					宿舍住址
    				</td>
    				<td class="luyu_user_center_account_table_text_1">
    					南京信息工程大学|东苑|硕园|#123室
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					其他地址
    				</td>
    				<td class="luyu_user_center_account_table_text_1" >
    					南京信息工程大学|电子楼N415
    				</td>
    			</tr>
    		</table>
    		
    	</div>
    </div>
  </body>
</html>
