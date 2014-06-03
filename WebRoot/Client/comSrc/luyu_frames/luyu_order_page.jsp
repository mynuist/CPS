<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String pagePath = basePath + "Client/comSrc/luyu_frames/";
String page_type = request.getParameter("page_type");//参数值 0:所有订单,1:待付款，2:未付款, 3:已完成
String order_state[] = {"所有订单","等待买家支付","已付款","已完成"};
String order_style[] = {"","","",""};
String order_ctnt[][] = {
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20001","<span>1.文档打印（A4）：Doc文档*1+封面+保护纸<br/>2.海报：海报*1（900高*1200宽）</span>","162.4","1","<a href=''style='color:#E2403E;'>立即支付</a>"},
		{"KBS20002","文档打印（A4）：Doc文档*1+封面","5.8","3","<a href=''style='color:#4AB847'>删除记录</a>"},
		{"KBS20003","海报：海报*1（900高*1200宽）","13.2","2","<a href='' style='color:#FF9803'>提醒店家打印</a>"}
};
if(page_type==null||(!page_type.equals("0")&&!page_type.equals("1")&&!page_type.equals("2")&&!page_type.equals("3")))
{
	page_type = "0";
}
order_style[Integer.parseInt(page_type)] = "background-color:#f6f6f6;";
String ctnt = "";

	for(int i=0;i<order_ctnt.length; i++)
	{
		if(page_type.equals("0")||page_type.equals(order_ctnt[i][3]))
		{
		
			String state = order_state[Integer.parseInt(order_ctnt[i][3])];
			ctnt += "<div class='list_outline'><table cellpadding='0' cellspacing='0'  class='order_ctnt_list_item_1'>"+
    				"<tr>"+
			"<td valign='middle' class='order_ctnt_list_item_clm_1'>"+order_ctnt[i][0]+"</td>"+
			"<td valign='middle' class='order_ctnt_list_item_clm_2'>"+order_ctnt[i][1]+"</td>"+
			"<td valign='middle' class='order_ctnt_list_item_clm_3'>"+order_ctnt[i][2]+"</td>"+
			"<td valign='middle' class='order_ctnt_list_item_clm_4'>"+state+"</td>"+
			"<td valign='middle' class='order_ctnt_list_item_clm_5'>"+order_ctnt[i][4]+"</td>"+
		"</tr>"+
	"</table></div>";
		}
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
	<link rel="stylesheet" type="text/css" href="<%=pagePath %>css/luyu_order.css">

  </head>
  
  <body>
    <div id="order_field">
    	<div id="order_top_index">
    		<a href="<%=pagePath %>luyu_order_page.jsp?page_type=0" style="<%=order_style[0]%>">所有订单</a>
    		<a href="<%=pagePath %>luyu_order_page.jsp?page_type=1" style="<%=order_style[1]%>">待付款</a>
    		<a href="<%=pagePath %>luyu_order_page.jsp?page_type=2" style="<%=order_style[2]%>">已付款</a>
    		<a href="<%=pagePath %>luyu_order_page.jsp?page_type=3" style="<%=order_style[3]%>">已完成</a>
    	</div>
    	
    	<div id="order_ctnt_field">
    		
    		<div id="order_ctnt_list">
    			<div class="order_ctnt_list_item" style="height:24px;">
    				<div class="order_ctnt_list_item_top_1">订单ID</div>
    				<div class="order_ctnt_list_item_top_2">所购打印产品列表</div>
    				<div class="order_ctnt_list_item_top_3">费用（元）</div>
    				<div class="order_ctnt_list_item_top_4">状态</div>
    				<div class="order_ctnt_list_item_top_5">操作</div>
    			</div>
    			<%=ctnt %>
    			
    		</div>
    		
    	</div>
    </div>
  </body>
</html>
