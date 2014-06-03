$(function(){
	$('#input-clearer').animate({opacity: 'hide' }, 'fast');

	$("#input-placeholder").click(function(){
			var input = $(this).prev();
			$(input).focus();
	});
	
	$("#username").focus(function(){
		$("#input-placeholder").css('color','#bbb');
	}).blur(function(){
		$("#input-placeholder").css('color','#666');
		if($(this).val().length == 0)
		{
			$("#input-placeholder").animate({opacity: 'show' }, 'fast');
		}
	});
	
	$('#username').keydown(function(event){
		if (event.which+'' == 8+'') { 
			if($(this).val().length==1)
			{
				$("#input-placeholder").animate({opacity: 'show' }, 'fast');
				$('#input-clearer').animate({opacity: 'hide' }, 'fast');
			}
		} 
		else
		{
			$("#input-placeholder").animate({opacity: 'hide' }, 'fast');
			$('#input-clearer').animate({opacity: 'show' }, 'fast');
		}
	});
	
	$('#input-clearer').click(function(){
		$('#username').val('');
		$("#input-placeholder").animate({opacity: 'show' }, 'fast');
		$('#username').focus();
		$('#input-clearer').animate({opacity: 'hide' }, 'fast');
	});
	
})
	
	

