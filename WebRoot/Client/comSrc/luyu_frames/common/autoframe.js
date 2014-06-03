 function frameloaded(){  
    var iframe = document.getElementById("autoframe");  
    iframe.height=360;
    try{  
        var bHeight = iframe.contentWindow.document.body.scrollHeight;  
        var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;  
        var height = Math.max(bHeight, dHeight);  
        iframe.height =  height;  
    }catch (ex){}  
}  
//设计定时器可让页面不停的为iframe刷新
//window.setInterval("reinitIframe()", 100);  