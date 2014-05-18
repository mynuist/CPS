<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String pagePath = basePath + "Client/comSrc/luyu_frames/";
String order_ctnt[][] = {
		{"2014-01-02 12:22:11","论文打印","5.8","一卡通充值","<a href=''style='color:blue'>详情</a>"},
		{"2014-01-02 12:22:11","PPT打印","13.2","淘宝充值","<a href='' style='color:blue'>详情</a>"}
};


String ctnt = "";

	for(int i=0;i<order_ctnt.length; i++)
	{
		ctnt += "<div class='list_outline'><table cellpadding='0' cellspacing='0'  class='order_ctnt_list_item_1'>"+
   				"<tr>"+
		"<td valign='middle' class='order_ctnt_list_item_clm_1'>"+order_ctnt[i][0]+"</td>"+
		"<td valign='middle' class='order_ctnt_list_item_clm_2'>"+order_ctnt[i][1]+"</td>"+
		"<td valign='middle' class='order_ctnt_list_item_clm_3'>"+order_ctnt[i][2]+"</td>"+
		"<td valign='middle' class='order_ctnt_list_item_clm_4'>"+order_ctnt[i][3]+"</td>"+
		"<td valign='middle' class='order_ctnt_list_item_clm_5'>"+order_ctnt[i][4]+"&nbsp;<img alt=''  width='8' height='13' src='"+pagePath+"img/more_tip.png'/></td>"+
		"</tr>"+
		"</table></div>";
	}

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
    		<a href="<%=pagePath %>luyu_user_center_info.jsp" style="">个人资料</a>
    		<a href="<%=pagePath %>luyu_user_center_consumption_record.jsp" style="">消费记录</a>
    		<a href="<%=pagePath %>luyu_user_center_charge_record.jsp" style="background-color:#f6f6f6;">充值记录</a>
    	</div>
    	
    	<div id="order_ctnt_field">
    		
    		<div id="order_ctnt_list">
    			<div class="order_ctnt_list_item" style="height:24px;">
    				<div class="order_ctnt_list_item_top_1">充值时间</div>
    				<div class="order_ctnt_list_item_top_2">备注</div>
    				<div class="order_ctnt_list_item_top_3">金额（元）</div>
    				<div class="order_ctnt_list_item_top_4">充值类型</div>
    				<div class="order_ctnt_list_item_top_5"></div>
    			</div>
    			<%=ctnt %>
    			
    		</div>
    		
    		
    	</div>
    </div>
  </body>
</html>
