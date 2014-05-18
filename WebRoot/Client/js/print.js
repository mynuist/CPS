/*
 * chwu1203
 * 2014/3/12
 */

var cur_index = 1;

$(document).ready(function() {
	$("#add_btn").bind("click", add_entry);
	$("#add_btn").bind("mousedown", function(){$("#add_btn").css({"background-color":"#BB3D00"});});
	$("#add_btn").bind("mouseup",   function(){$("#add_btn").css({"background-color":"#FF6600"});});
});


function add_entry(e) {
	var new_entry = constructor_str(cur_index);
	$(new_entry).appendTo($("#all_entry"));
	bind_all_event(cur_index);
	cur_index++;
}

function bind_all_event(id) {
	//Close
	$("#close_" + id).bind("click", {id: id}, entry_remove);
	
	//Part1
	//$("#upload_" + id).bind("click", {id: id}, upload_file);
	$("#upload_" + id).bind("mousedown", function(){$("#upload_" + id).css({"background-color":"#BB3D00"});});
	$("#upload_" + id).bind("mouseup",   function(){$("#upload_" + id).css({"background-color":"#FF6600"});});
	
	//Part2
	//Null
	
	//Part3
	$("#buy_" + id).bind("mousedown", function(){$("#buy_" + id).css({"background-color":"#BB3D00"});});
	$("#buy_" + id).bind("mouseup",   function(){$("#buy_" + id).css({"background-color":"#FF6600"});});
	
}

//Upload print file.
function upload_file(e) {
	//Null now.
}


//Remove the print entry.
function entry_remove(e) {
	id = e.data.id;
	$("#entry_"+id).fadeOut("500", function (){
		$("#entry_"+id).remove();
	});
}

function constructor_str(id) {
	var str = "";
    str+='<div class="entry" id="entry_'+ id +'">'
			+'<div class="part1">'
			+'	<div class="part1_1">'
			+'	<span class="font1 part1_1_1">打印类型：</span>	'
			+'	<select class="print_source_type" id="ptype_'+ id +'">'
			+'		<option selected="selected">----请选择----</option>	'
			+'		<option value="1">文档打印(A4纸)</option>'
  			+'	<option value="2">海报印刷</option>'
			+'	</select>'
			+'	</div>	'
			
			+'	<div class="part1_2">'
			+'		<input type="button" class="reupload font2" id="upload_'+ id +'" value="上传打印文件"></input>	'
			+'	</div>'
			+'	<div class="part1_3" >'
			+'			<div class="file_type" id="doc_ico_'+ id +'" style="background-image:url(./../img/word_ico.png);display:none"> </div>'
			+'			<div class="file_name" id="doc_name_'+ id +'" style="margin-left:80px">暂无文件信息</div>'
			+'	</div>'
			+'	<div class="part1_4">'
			+'		<div class="file_info">'
			+'				<div class="part1_4_1" >文档信息：</div>'
			+'				<div class="part1_4_2" id="doc_type_'+ id +'">格式：Word</div> '
			+'				<div class="part1_4_2" id="doc_size_'+ id +'">大小：23KB</div> '
			+'				<div class="part1_4_2" id="doc_pages_'+ id +'">页数：10页</div>'
			+'			</div>	'
			+'	</div>'
			+'</div>'
			+'<div class="line"></div>'
			+'<div class="part2">'
			+'	<div class="part2_1">打印设置:</div>'
			+'	<div class="printA4 font3">'
			+'		<div class="A4_1">'
			+'			 <span>份数:</span> '
			+'			 <input type="text" style="width:30px;text-align:center" value="1" id="doc_repeat_'+ id +'"></input>'
			+'			 <span class="font3">份</span> '
			+'			 <input type="checkbox" class="checkbox" checked="checked" id="pcolor_'+ id +'"> 彩色打印</input>'
			+'		</div>'
			+'		<div class="A4_2">'
			+'				<span>单/双面：</span>'
			+'				<select id="double_'+ id +'">'
			+'					<option>-----请选择-----</option>	'
			+'					<option selected="selected" value="1">单面打印</option>'
  			+'				<option value="2">双面打印</option>'
			+'				</select>'
			+'		</div>'
			+'		<div class="A4_3">'
			+'				<span>是否缩印：</span>'
			+'				<select id="small_'+ id +'">'
			+'					<option >-----请选择-----</option>	'
			+'					<option selected="selected" value="1">不缩印</option>'
  			+'				<option value="2">每张纸4页</option>'
  			+'				<option value="3">每张纸8页</option>'
			+'				</select>'
			+'		</div>'
			+'		<div class="A4_4">'
			+'				<span>打印方向：</span>'
			+'				<select id="dir_'+ id +'">'
			+'					<option >-----请选择-----</option>	'
			+'					<option selected="selected" value="1">纵向</option>'
  			+'				<option value="2">横向</option>'
			+'				</select>'
			+'		</div>'
			+'		<div class="A4_5">'
			+'				<div style="float:left;">'
			+'				<input type="checkbox" checked="checked" id="binding_'+ id +'"> 免费装订</input>'
			+'				<select id="bind_num_'+ id +'">'
			+'					<option >-请选择-</option>	'
			+'					<option selected="selected" value="1">2根钉</option>'
  			+'				<option value="2">3根钉</option>'
  			+'				<option value="3">1根钉</option>'
			+'				</select>'
			+'				</div>'
			+'				<div class="wenhao" title="查看装订方式"></div>'
			+'		</div>'
			+'		<div class="A4_6">'
			+'				<span>备注：</span>'
			+'		</div>'
			+'		<div class="A4_7" id="meto_'+ id +'">'
			+'			<textarea style="width:200px;height:60px;font-size:12px">内容</textarea>'
			+'		</div>'
			+'	</div>'
			+'</div>'
			+'<div class="line"></div>'
			+'<div class="part3">'
			+'<div class="part3_1">计费:</div>'
			+'<div class="close" id="close_'+ id +'" title="删除此条打印项目"></div>'
			+'<div class="part3_2">'
			+'	<div class="part3_2_all part3_2_1">'
			+'		<span>文档页数:</span>'
			+'		<span id="pages_'+ id +'">5</span>'
			+'		<span>页</span>'
			+'	</div>'
			+'	<div class="part3_2_all part3_2_2">'
			+'		<div style="float:left;">'
			+'		<span>打印张数:</span>'
			+'		<span id="prints_'+ id +'">5</span>'
			+'		<span>张</span>'
			+'		</div>'
			+'		<div id="detail_check_'+ id +'" style="font-size:12px;margin-left:130px;color:red;font-weight:bold;cursor:pointer;" title="什么是高墨耗？">(含有高墨耗页)</div>'
			+'	</div>'
			+'	<div class="part3_2_all part3_2_3">'
			+'		<div style="float:left;">'
			+'		<span>打印费用:</span>'
			+'		<span class="money" id="money_print_'+ id +'">50</span>'
			+'		<span>元</span>'
			+'		</div>'
			+'		<div class="wenhao" title="查看计费明细" style="margin-left:15px;float:left;"></div>'
			+'		<span class="info_into" id="detail_cal_'+ id +'" title="查看计费明细">如何计算>></span>'
			+'	</div>'
			+'</div>'
			+'<div class="part3_3">'
			+'	<div class="part3_3_all part3_3_1">'
			+'		<span>装饰:</span>'
			+'		<input type="button" class="buy_btn"  value="选购" id="buy_'+ id +'"></input>	'
			+'	</div>'
			+'	<div class="part3_3_all part3_3_2">'
			+'		<span>装饰清单:</span>'
			+'		<span id="des_list_'+ id +'">无</span>'
			+'	</div>'
			+'	<div class="part3_3_all part3_3_3">'
			+'		<div style="float:left;">'
			+'		<span>装饰费用:</span>'
			+'		<span class="money" id="money_des_'+ id +'">50</span>'
			+'		<span>元</span>'
			+'		</div>'
			+'	</div>'
			+'</div>'
			+'<div class="part3_4">'
			+'	<span>费用:</span>'
			+'	<span class="money" id="money_all_'+ id +'">50</span>'
			+'	<span>元</span>'
			+'	<span class="info_into" style="margin-left:80px" id="detail_money_'+ id +'" title="查看打印账单">详情>></span>'
			+'</div>'
			+'</div>'
			+'</div>';
			return str;
}