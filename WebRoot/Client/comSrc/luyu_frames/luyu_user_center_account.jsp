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
    		<a href="<%=pagePath %>luyu_user_center_account.jsp" style="background-color:#f6f6f6;">我的账户</a>
    		<a href="<%=pagePath %>luyu_user_center_info.jsp" style="">个人资料</a>
    		<a href="<%=pagePath %>luyu_user_center_consumption_record.jsp" style="">消费记录</a>
    		<a href="<%=pagePath %>luyu_user_center_charge_record.jsp" style="">充值记录</a>
    	</div>
    	
    	<div id="order_ctnt_field">
    		<div class="luyu_user_center_account_title" >
    			账户信息
    		</div>
    		<table class="luyu_user_center_account_table" cellspacing="16" cellpadding="0">
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					账户名
    				</td>
    				<td class="luyu_user_center_account_table_text">
    					汤波<span style="color:#F0D232;font-weight:bold;">&nbsp;已通过学生认证</span><img alt="" width="15" height="15" src="<%=pagePath %>img/vip_logo.png"/>
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					账户状态
    				</td>
    				<td class="luyu_user_center_account_table_text">
    					安全<img alt="" width="15" height="15" src="<%=pagePath %>img/ver_logo.png"/>
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					账户等级
    				</td>
    				<td class="luyu_user_center_account_table_text">
    					<span style="color:#77476F;font-weight:bold;margin-top:-3px;">VIP</span><img alt=""  width="15" height="15" src="<%=pagePath %>img/vip_logo2.png"/>
    				</td>
    			</tr>
    			<tr>
    				<td class="luyu_user_center_account_table_label">
    					账户余额
    				</td>
    				<td class="luyu_user_center_account_table_text" >
    					<span style="color:#FA6801;font-weight:bold;font-size:24px;">9.8</span>元
    				</td>
    			</tr>
    			<tr>
    				<td colspan="2">
    					<a href>充值</a>
    				
    					<a href>预约提现</a>
    				</td>
    			</tr>
    		</table>
    		
    		
    	</div>
    </div>
  </body>
</html>
