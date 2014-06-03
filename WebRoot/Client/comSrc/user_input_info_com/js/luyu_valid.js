
$(function(){
	
	//alert(document.cookie);
	$("#luyu_valid_form_field input").each(function(index){
		if(index >= $("#luyu_valid_form_field input").length-1) return;
		var name = $(this).attr('id');
		$(this).val(getCookie(name));
	});
	$("#luyu_valid_form_field select").each(function(index){
		var name = $(this).attr('id');
		$(this).val(getCookie(name));
	});
	
	$("#luyu_valid_form_field input").each(function(index){
		$(this).blur(function(){
			if(index >= $("#luyu_valid_form_field input").length-1) return;
			var name = $(this).attr('id');
			var value = $(this).val();
			setCookie(name,value);
			//alert(document.cookie);
		});
	});
	$("#luyu_valid_form_field select").each(function(index){
		$(this).blur(function(){
			var name = $(this).attr('id');
			var value = $(this).val();
			setCookie(name,value);
			//alert(document.cookie);
		});
	});
	
	
	$("#luyu_valid_form_field").find("select#school").change(function(){
		var school_id = $(this).val();
		
	});
	
});

function setCookie(name,value)//两个参数，一个是cookie名，一个是值
{
    var Days = 30; //此 cookie 将被保存 30 天
    var exp = new Date();    //new Date("December 31, 9998");
    exp.setTime(exp.getTime() + Days*24*60*60*1000);
    document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();
}

function setCookie(name,value,expiredays)
{
	var exdate = new Date()
	exdate.setDate(exdate.getDate()+expiredays)
	document.cookie = name+ "=" +escape(value) + ((expiredays==null) ? "" : ";expires="+exdate.toGMTString())
}

//操作cookie
function getCookie(name){//取cookies函数    
    var arr = document.cookie.match(new RegExp("(^| )"+name+"=([^;]*)(;|$)"));
	if(arr != null) 
		return unescape(arr[2]); 
	return null;
} 

// form validation function //
function validate(form) {
  var school = form.school.value;
  var school_area = form.school_area.value;
  var realname = form.realname.value;
  var nickname = form.nickname.value;
  var stu_num = form.stu_num.value;
  var depart = form.depart.value;
  var major = form.major.value;
  var class_num = form.class_num.value;
  var qq_num = form.qq_num.value;
  var tele_num = form.tele_num.value;
  var email = form.email.value;
  var dorm_biulding = form.dorm_biulding.value;
  var room_num = form.room_num.value;
  
  var nickNameRegex = /^[a-zA-Z]+(([\'\,\.\- ][a-zA-Z ])?[a-zA-Z]*)*$/;//验证用户名，以英文字符开头，长度在5-12位之间
  var teleNumRegex = /^1[3|4|5|8][0-9]\d{8}$/;
  var qqNumRegex = /^[0-9]{5,10}$/;
  var realNameRegex = new RegExp(/((^[\u4E00-\u9FA5]{2,5}$)|(^[a-zA-Z]+[\s\.]?([a-zA-Z]+[\s\.]?){0,4}[a-zA-Z]$))/); //验证中文真实姓名，2-4位中文字符
  var emailRegex = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;//验证邮箱的正则表达式
  var messageRegex = new RegExp(/<\/?\w+((\s+\w+(\s*=\s*(?:".*?"|'.*?'|[^'">\s]+))?)+\s*|\s*)\/?>/gim);//验证备注
  
  if(school == "") {
    luyu_show_err_Msg('school','请选择您的学校',2);
    return false;
  }
  
  if(school_area == "") {
    luyu_show_err_Msg('school_area','您选择您的校区',2);
    return false;
  }
  
  if(realname == "")
  {
	luyu_show_err_Msg('realname','请输入真实姓名',2);
    return false;
  }
  if(realname.length <= 1 )
  {
	luyu_show_err_Msg('realname','姓名长度太短',2);
    return false;
  }
  if(!realname.match(realNameRegex)) {
    luyu_show_err_Msg('realname','你输入的名字好像不合适</br>，不要包括\',.等特殊符号.',2);
    return false;
  }
  
  if(nickname == "")
  {
	luyu_show_err_Msg('nickname','请输入真是姓名',2);
    return false;
  }
  if(!nickname.match(nickNameRegex)) {
    luyu_show_err_Msg('nickname','请输入5-12位的英文字符，不要包括\',.等特殊符号.',2);
    return false;
  }
  
 
  
  if(stu_num.length<1)
  {
	luyu_show_err_Msg('stu_num','请填写正确的学号',2);
    return false;
  }
  
  if(depart.length<1)
  {
	luyu_show_err_Msg('depart','请填写正确的学院',2);
    return false;
  }
  
  if(major.length<1)
  {
	luyu_show_err_Msg('major','请填写正确的专业',2);
    return false;
  }
  
  if(class_num.length<1)
  {
	luyu_show_err_Msg('class_num','请填写正确的班级',2);
    return false;
  }
  
  if(!qq_num.match(qqNumRegex))
  {
	luyu_show_err_Msg('qq_num','请填写正确的QQ号码',2);
    return false;
  }
  
  if(!tele_num.match(teleNumRegex))
  {
	luyu_show_err_Msg('tele_num','请填写正确的手机号码',2);
    return false;
  }
  
  if(email == "") {
    luyu_show_err_Msg('email','请填写 email.',2);
    return false;
  }
  if(!email.match(emailRegex)) {
    luyu_show_err_Msg('email','请填写正确的email',2);
    return false;
  }
  
  if(dorm_biulding.length<1)
  {
	luyu_show_err_Msg('dorm_biulding','请选择您的宿舍楼',2);
    return false;
  }
  
  if(room_num.length<1)
  {
	luyu_show_err_Msg('room_num','请选择您的房间号',2);
    return false;
  }
  return true;
}

// START OF MESSAGE SCRIPT //

var MSGTIMER = 20;
var MSGSPEED = 5;
var MSGOFFSET = 3;
var MSGHIDE = 3;

// build out the divs, set attributes and call the fade function //
function luyu_show_err_Msg(target,string,autohide) {
  var msg;
  var msgcontent;
  if(!document.getElementById('luyu_tip_msg')) {
    msg = document.createElement('div');
    msg.id = 'luyu_tip_msg';
    msgcontent = document.createElement('div');
    msgcontent.id = 'luyu_tip_msg_content';
    document.body.appendChild(msg);
    msg.appendChild(msgcontent);
    msg.style.filter = 'alpha(opacity=0)';
    msg.style.opacity = 0;
    msg.alpha = 0;
  } else {
    msg = document.getElementById('luyu_tip_msg');
    msgcontent = document.getElementById('luyu_tip_msg_content');
  }
  msgcontent.innerHTML = string;
  msg.style.display = 'block';
  var msgheight = msg.offsetHeight;
  var targetdiv = document.getElementById(target);
  targetdiv.focus();
  var targetheight = targetdiv.offsetHeight;
  var targetwidth = targetdiv.offsetWidth;
  var topposition = topPosition(targetdiv) - ((msgheight - targetheight) / 2);
  var leftposition = leftPosition(targetdiv) + targetwidth + MSGOFFSET;
  msg.style.top = topposition + 'px';
  msg.style.left = leftposition + 'px';
  clearInterval(msg.timer);
  msg.timer = setInterval("fadeMsg(1)", MSGTIMER);
  if(!autohide) {
    autohide = MSGHIDE;  
  }
  window.setTimeout("hideMsg()", (autohide * 1000));
}

// hide the form alert //
function hideMsg(msg) {
  var msg = document.getElementById('luyu_tip_msg');
  if(!msg.timer) {
    msg.timer = setInterval("fadeMsg(0)", MSGTIMER);
  }
}

// face the message box //
function fadeMsg(flag) {
  if(flag == null) {
    flag = 1;
  }
  var msg = document.getElementById('luyu_tip_msg');
  var value;
  if(flag == 1) {
    value = msg.alpha + MSGSPEED;
  } else {
    value = msg.alpha - MSGSPEED;
  }
  msg.alpha = value;
  msg.style.opacity = (value / 100);
  msg.style.filter = 'alpha(opacity=' + value + ')';
  if(value >= 99) {
    clearInterval(msg.timer);
    msg.timer = null;
  } else if(value <= 1) {
    msg.style.display = "none";
    clearInterval(msg.timer);
  }
}

// calculate the position of the element in relation to the left of the browser //
function leftPosition(target) {
  var left = 0;
  if(target.offsetParent) {
    while(1) {
      left += target.offsetLeft;
      if(!target.offsetParent) {
        break;
      }
      target = target.offsetParent;
    }
  } else if(target.x) {
    left += target.x;
  }
  return left;
}

// calculate the position of the element in relation to the top of the browser window //
function topPosition(target) {
  var top = 0;
  if(target.offsetParent) {
    while(1) {
      top += target.offsetTop;
      if(!target.offsetParent) {
        break;
      }
      target = target.offsetParent;
    }
  } else if(target.y) {
    top += target.y;
  }
  return top;
}

// preload the arrow //
if(document.images) {
  arrow = new Image(7,80); 
  arrow.src = "img/luyu_tip_msg_arrow.gif"; 
}

function GetRadioValue(obj){
     
    if(obj!=null){
        var i;
        for(i=0;i<obj.length;i++){
            if(obj[i].checked){
                return obj[i].value;            
            }
        }
    }
    return null;
}