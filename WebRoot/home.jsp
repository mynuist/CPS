<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <title>US云打印</title>
    <script type="text/javascript" src="./js/jquery-1.10.2.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="Home Page">
	<link rel="stylesheet" type="text/css" href="Common/css/basic.css">
  </head>
  <body>
  
 <div class="nav"> 
    <div>
        <ul class="nav_l">
           <li><a href="Client/Product.jsp"> US快捷云打印</a></li>
           <li><a href="Client/Login.jsp"> 请登录</a></li>
           <li><a href="Client/Register.jsp"> 免费注册</a></li>
        </ul>
        <ul class="nav_r">
           <li><a href="TaskSubmit.jsp"> 我要打印</a></li>
           <li><a href="Client/UserCenter.jsp"> 用户中心</a></li>
           <li><a href=""> 网站导航</a></li>
        </ul>
     </div>
</div>
<div class="gold_line"> </div>

<div class="middle_body">
  <div class="background">
       <div class="middle_frame">
          <div class="middle_up_frame">
                <div  class="middle_up_left_frame">
                    <div class="body_info_title_first">
                                                                                校园， 智能一点                                                          
                     </div>
                     <div class="body_info_title_second">
                                                                                生活， 方便一点
                     </div>
                     <div class="body_info_text">
                       <p>US快捷云打印，您在再不需要到处借U盘。输入网址，即可打印。</p><p style="height:10px"></p>
                       <p>US快捷云打印，您在宿舍就可以打印您的文档。我们将在全校各个区域设置取件点。您只需要前往拿取即可。</p><p style="height:10px"></p>
                       <p>我们提供的网上电子帐户付账功能，可以有效的利用零钱。我们还提供提现功能，毕业离校，用不了，兜着走。</p>
                     </div>
                </div>
                <div  class="middle_up_right_frame">
                  <iframe src="Client/comSrc/user_login_com/login.html" width="286" height="387" id="loginIframe" frameborder="0" scrolling="no"  style="display: block;"></iframe>
                </div>
          </div>
          <div class="middle_low_frame">
               <div class="Whitelinklist">
                   <ul>
                          <li><a href="">什么是云打印</a></li>
                          <li>|</li>
                          <li><a href="">云打印如何收费</a></li>
                          <li>|</li>
                          <li><a href="">US校盟社团服务协议</a></li>
                  </ul>
               </div>
           </div>
       </div>
  </div>
</div>
<div class="bottom_body">
  <div>
      <ul>
          <table>
              <tr class="fisrtpage_bottomframe_bigtext">
                  <td>
                                                                           打印还要排队？弱爆了！
                  </td>
              </tr>
              <tr class="fisrtpage_bottomframe_smalltext">
                  <td>
                                                                           网上直接提交文件到打印店，老板精心帮您装订～完毕后您可前往打印店拿起就跑。
                  </td>
              </tr>
          </table>
      </ul>
      <ul>
            <table>
              <tr class="fisrtpage_bottomframe_bigtext">
                  <td>
                                                                           零钱也是钱！
                  </td>
              </tr>
              <tr class="fisrtpage_bottomframe_smalltext">
                  <td>
                                                                           每次打印完都会收到1毛硬币？每次回到宿舍都随便一扔？太浪费了！电子帐户，花的就是零钱～
                  </td>
              </tr>
          </table>
      </ul>
      <ul>
          <table>
              <tr class="fisrtpage_bottomframe_bigtext">
                  <td>
                                                                          毕业了，帐户余额咋办？
                  </td>
              </tr>
              <tr class="fisrtpage_bottomframe_smalltext">
                  <td>
                                                                           帐户余额，可凭借充值卡到指定地点提现。
                  </td>
              </tr>
          </table>
      </ul>
  </div>
</div>

<footer class="footer">
   <div class="foot_line"></div> 
   <div class="foot_main">
       <div class="partner">
          <div class="foot_main_left">合作伙伴:</div>
          <div class="foot_main_right">
             <ul>     
                <li >
                    <table class="middlestyle"> 
                         <tr><td><img src="Common/img/partner_us.png"/></td></tr>
                         <tr><td>校园联盟（US）社团</td></tr>
                    </table>
                </li>
                 <li >
                    <table class="middlestyle"> 
                         <tr><td><img src="Common/img/partner_nuist.jpg"/></td></tr>
                         <tr><td>南京信息工程大学</td></tr>
                    </table>
                </li>
                 <li >
                    <table class="middlestyle"> 
                         <tr><td><img src="Common/img/partner_print.png"/></td></tr>
                         <tr><td>南信东苑打印店</td></tr>
                    </table>
                </li>
             </ul>
          </div>
       </div>
       <div class="linklist">
          <ul>
            <li><a href="">关于我们</a></li>
            <li>|</li>
            <li><a href="">合作伙伴</a></li>
            <li>|</li>
            <li><a href="">诚聘英才</a></li>
            <li>|</li>
            <li><a href="">联系我们</a></li>
            <li>|</li>
            <li><a href="">网站地图</a></li>
            <li>|</li>
            <li><a href="">版权说明</a></li>
          </ul>
       </div>
       <div class="copyright">
           <ul>
             <li>校园联盟(United School) 版权所有 2014- ICP证: 浙B2-20100257 当前站：南京信息工程大学</li>
           </ul>
       </div>
   </div> 
</footer>
    
     
  </body>
</html>
