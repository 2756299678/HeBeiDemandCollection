<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript"> 
	//jQuery实现在一个输入框按回车键后光标跳到下一个输入框
	function focusNextInput(thisInput)
	{ 
		var inputs = document.getElementsByTagName("input"); 
		for(var i = 0;i<inputs.length;i++){ 
			// 如果是最后一个，则焦点回到第一个 
			if(i==(inputs.length-1)){ 
				inputs[0].focus(); break; 
			}else if(thisInput == inputs[i]){ 
				inputs[i+1].focus(); break; 
			} 
		} 
	} 
	window.onload=function()  
	{  
	 var myform=document.getElementById("checkForm");  
	 myform.onkeypress=function(ev)  
	 {  
	  var ev=window.event||ev;  
	  if(ev.keyCode==13||ev.which==13)  
	  {  
		return false;  
	   }  
	 }  
	}  
</script> 
<link rel="stylesheet" type="text/css" href="../static/css/main.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/css/bootstrap.css">
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.validate.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/myValidate.js" ></script>
</head>
<body>

<div align="center" class="col-md-12">
<table id="__01" width="1366"  border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td width="50%">
        <img src="images/index_01.jpg" width="683" height="70" alt=""></td>
	    <td background="images/index_02.jpg" width="10%"></td>
	    <td colspan="2"width="40%">
		    <img src="images/index_03.jpg" width="167" height="70" alt=""></td>
	  </tr>
   
    <tr>
      <td>
        <img src="images/&#x5206;&#x9694;&#x7b26;.gif" width="683" height="1" alt=""></td>
	    <td>
		    <img src="images/&#x5206;&#x9694;&#x7b26;.gif" width="516" height="1" alt=""></td>
	    <td>
		    <img src="images/&#x5206;&#x9694;&#x7b26;.gif" width="165" height="1" alt=""></td>
	    <td>
		    <img src="images/&#x5206;&#x9694;&#x7b26;.gif" width="2" height="1" alt=""></td>
	  </tr>
  </table>
</div>
<div class="mainBar col-md-12">
	<div>
		今天是
		<script>
                                            var weekDayLabels = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
                                            var now = new Date();
                                            var year = now.getFullYear();
                                            var month = now.getMonth() + 1;
                                            var day = now.getDate()
                                            var currentime = year + "年" + month + "月" + day + "日 " + weekDayLabels[now.getDay()]
                                            document.write(currentime)
                                       
                                            </script>          </div>
</div>
<div class="row-fulid col-md-8" style="margin-top: 20px;">
			<div class="col-md-12 ">
				<div class="col-md-3"></div>
				<div class="col-md-4">
				<h1 align="left">用户注册</h1>
				</div>
				<div class="col-md-5"></div>
			</div>
    		<div class="col-md-2"></div>
    		<div class="col-md-6">
		<form  role="form"  id="checkForm" class="form-horizontal" action="${pageContext.request.contextPath }/userServlet?method=regist" method="post">
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>用户名：</label>
				<div class="col-md-8">
				<input class=" form-control"  type="text" name="username" id="username" onkeypress="if(event.keyCode==13) focusNextInput(this);">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>密码：</label>
				<div class="col-md-8">
				<input class=" form-control" type="password" name="password" id="password" onkeypress="if(event.keyCode==13) focusNextInput(this);">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>重复密码：</label>
				<div class="col-md-8">
				<input class=" form-control"type="password" name="password2" id="password2" onkeypress="if(event.keyCode==13) focusNextInput(this);" >
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>机构全称：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="quancheng" id="quancheng" onkeypress="if(event.keyCode==13) focusNextInput(this);" >
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label">归口管理部门：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="guanli" id="guanli" onkeypress="if(event.keyCode==13) focusNextInput(this);">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>通讯地址：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="address" id="address" onkeypress="if(event.keyCode==13) focusNextInput(this);">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>所在地区：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="stress" id="stress" onkeypress="if(event.keyCode==13) focusNextInput(this);">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">网址：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="wangzhi" id="wangzhi" onkeypress="if(event.keyCode==13) focusNextInput(this);">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>E-mail：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="Email" id="Email" onkeypress="if(event.keyCode==13) focusNextInput(this);" >
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>法人代表：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="daibiao" id="daibiao" onkeypress="if(event.keyCode==13) focusNextInput(this);" >
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">邮政编码：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="youbian" id="youbian" onkeypress="if(event.keyCode==13) focusNextInput(this);" >
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">传真：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="chuanzhen" id="chuanzhen" onkeypress="if(event.keyCode==13) focusNextInput(this);" >
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>联系人：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="name" id="name" onkeypress="if(event.keyCode==13) focusNextInput(this);">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label"><font color="red">*</font>手机：</label>
				<div class="col-md-8">
				<input class=" form-control" type="text" name="phone" id="phone" onkeypress="if(event.keyCode==13) focusNextInput(this);" >
				</div>
			</div>
			<div class="form-group">
			<div class="col-md-9 col-md-offset-3">
				<input class="form-control btn btn-info" type="submit" value="注册">
			</div>
		</div>
		</form>
		</div>
		<div class="col-md-4"></div>
</div>
    <c:if test="${param.status.equals('5')}">
    <script language="javascript"> //JavaScript脚本标注
	alert("用户名已存在");//在页面上弹出
	</script>     			
</c:if>
</body>
</html>