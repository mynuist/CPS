/* 
 * chwu1203
 * 2014/3/1
 */

$(document).ready(function(){
	pic_change_init();
	text_init();
	focus_change_init();
	
});

var sample_str1 = "  用户名/邮箱";
var sample_str2 = "  验证码";

function pic_change_init() {
	//For name.
	$(".user-name").hover(
  	function () {
    	$(".user-name").css({'background-image':'url(./images/user2.png)'});
  	},
  	function () {
     	$(".user-name").css({'background-image':'url(./images/user1.png)'});
  	});
  //For pas.
  $(".user-pas").hover(
  	function () {
    	$(".user-pas").css({'background-image':'url(./images/pas2.png)'});
  	},
  	function () {
     	$(".user-pas").css({'background-image':'url(./images/pas1.png)'});
  	});
   //For sub button.
  $("#login").hover(
  	function () {
    	$("#login").css({'background-image':'url(./images/login2.png)'});
  	},
  	function () {
     	$("#login").css({'background-image':'url(./images/login1.png)'});
  	});
  
  $("#login").bind("mousedown", function() {$("#login").css({'background-image':'url(./images/login1.png)'});});
  $("#login").bind("mouseup", function() {$("#login").css({'background-image':'url(./images/login2.png)'});});
}

function text_init() {
	$("#user_name").val(sample_str1).css({'color':'#ccc'});
	$("#user_code").val(sample_str2).css({'color':'#ccc'});

}

function focus_change_init() {
	$("#user_name").focus(function(){
		if($.trim($("#user_name").val()) === $.trim(sample_str1)){
			$("#user_name").val("").css({'color':'#000'});
    }
  });
  $("#user_name").blur(function(){
  	if($.trim($("#user_name").val()) === ""){
			$("#user_name").val(sample_str1).css({'color':'#ccc'});
    }
  });
  
  $("#user_code").focus(function(){
		if($.trim($("#user_code").val()) === $.trim(sample_str2)){
			$("#user_code").val("").css({'color':'#000'});
    }
  });
  $("#user_code").blur(function(){
  	if($.trim($("#user_code").val()) === ""){
			$("#user_code").val(sample_str2).css({'color':'#ccc'});
    }
  });
 
  //alert($(".login-body a").length);
   /*$(".login-body a").hower(
  	function () {
    	$(this).css({'text-decoration:':"underline"});
  	},
  	function () {
  		$(this).css({'text-decoration:':"none"});
  	});
  */
}