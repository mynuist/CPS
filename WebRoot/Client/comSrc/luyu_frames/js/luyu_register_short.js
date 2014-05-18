$(function(){

	$("#luyu_register_short_pwd_input").keydown(function(event){
	
		var len = $(this).val().length;
	
		$(".luyu_register_short_pwd_index_tab_sel").attr('class','luyu_register_short_pwd_index_tab');
		if( len>=0 && len < 6)
		{
			$("#index_1").attr('class','luyu_register_short_pwd_index_tab_sel');
		}
		else if( len>=6 && len < 12)
		{
			$("#index_2").attr('class','luyu_register_short_pwd_index_tab_sel');
		}
		else if( len>=12)
		{
			$("#index_3").attr('class','luyu_register_short_pwd_index_tab_sel');
		}
	});
	
});

function validate( form )
{
	var uid = $("#username").val();
	var pwd = $("#luyu_register_short_pwd_input").val();
	var pwd_c = $("#password_confirm").val();
	var cde = $("#verify_code").val();
	if(uid.length < 5){
		alert('用户名长度应>=5位!');
		return false;
	}
	
	if(pwd.length < 5){
		alert('密码长度过短!');
		return false;
	}
	if(pwd != pwd_c)
	{
		alert('两次密码输入不一致!');
		return false;
	}
	if(cde.length == 0){
		alert('请输入验证码!');
		return false;
	}
}