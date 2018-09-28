<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>需求征集</title>
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
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/css/bootstrap.css">
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.validate.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/xuqiuValidate.js" ></script>


<script type="text/javascript">
$(function(){
	$("#jichu").click(function(){
		
		$("#xueke").css("display","block");
		$("#lingyu").css("display","none");
		$("#hangye").css("display","none");
	});
	$("#yingyong").click(function(){
		
		if($("#lingyu").css("display") == "none")//如果领域不显示，则学科不显示，领域显示，否则不边变
		{
			$("#xueke").css("display","none");
			$("#lingyu").css("display","block");
			$("#hangye").css("display","block");
		}
	});
	$("#shiyan").click(function(){
		if($("#lingyu").css("display") == "none")//如果领域不显示，则学科不显示，领域显示，否则不边变
		{
			$("#xueke").css("display","none");
			$("#lingyu").css("display","block");
			$("#hangye").css("display","block");
		}
	});
	$("#yanjiu").click(function(){
		if($("#lingyu").css("display") == "none")//如果领域不显示，则学科不显示，领域显示，否则不边变
		{
			$("#xueke").css("display","none");
			$("#lingyu").css("display","block");
			$("#hangye").css("display","block");
		}
	});
	$("#jishu").click(function(){
		if($("#lingyu").css("display") == "none")//如果领域不显示，则学科不显示，领域显示，否则不边变
		{
			$("#xueke").css("display","none");
			$("#lingyu").css("display","block");
			$("#hangye").css("display","block");
		}
	});
	$("#shengchan").click(function(){
		if($("#lingyu").css("display") == "none")//如果领域不显示，则学科不显示，领域显示，否则不边变
		{
			$("#xueke").css("display","none");
			$("#lingyu").css("display","block");
			$("#hangye").css("display","block");
		}
	});
})
</script>
</head>
<body>
	<div class="container-fulid">
		<div class="col-md-12">
		<h1 align="center">河北省重大需求征集</h1>
		</div>
		<div class="col-md-1"></div>
		<div class="col-md-10">
		<form name="checkForm" id="checkForm" action="${pageContext.request.contextPath }/needServlet?method=add" class="form-horizontal" method="post">
		        <table class="table table-bordered">
				<tbody>
					<tr>
						<td>*机构全称</td>
						<td> <input type="text" class="form-control" name="quancheng" id="quancheng" value="${userBean.quancheng}" placeholder="机构全称" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
						<td>归口管理部门</td>
						<td> <input type="text" class="form-control" name="guanli" id="guanli" value="${userBean.guanli }" placeholder="归口管理部门" onkeypress="if(event.keyCode==13) focusNextInput(this);" required></td>
					</tr>
					<tr>
						<td>*通讯地址</td>
						<td><input type="text" class="form-control" name="address" id="address" value="${userBean.address }"  placeholder="通讯地址" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
						<td>*所在地域</td>
						<td><input type="text" class="form-control" name="stress" id="stress" value="${userBean.stress }"  placeholder="所在地域" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
					</tr>
					<tr>
						<td>网址</td>
						<td><input type="text" class="form-control" name="wangzhi" id="wangzhi" value="${userBean.wangzhi }"   placeholder="网址" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
						<td>*电子邮箱</td>
						<td><input type="text" class="form-control" name="Email" id="Email" value="${userBean.email }"  placeholder="邮箱" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
					</tr>
					<tr>
						<td>*法人代表</td>
						<td><input type="text" class="form-control" name="daibiao" id="daibiao" value="${userBean.daibiao }"  placeholder="法人代表"   onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
						<td>邮政编码</td>
						<td><input type="text" class="form-control" name="youbian" id=youbian value="${userBean.youbian }"  placeholder="邮编" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
					</tr>
					<tr >
						<td rowspan="2">联系人</td>
						<td rowspan="2"><input type="text" class="form-control" name="name" id="name" value="${userBean.name }"  placeholder="联系人" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
						<td>*电话</td>
						<td><input type="text" class="form-control" name="phone" id="phone" value="${userBean.phone }"  placeholder="电话" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
					</tr>
					<tr>
					    <td>传真</td>
						<td><input type="text" class="form-control" name="chuanzhen" id="chuanzhen" value="${userBean.chuanzhen }"  placeholder="传真" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
					</tr>
					<tr>
						<td colspan="1">*机构属性</td>
						<td colspan="3">
							<label class="radio-inline">
						        <input type="radio" id="JGSX" name="JGSX"  value="企业" checked> 企业
						    </label>
						    <label class="radio-inline">
						        <input type="radio" id="JGSX" name="JGSX"  value="高等院校"> 高等院校
						    </label>
						    <label class="radio-inline">
						        <input type="radio" id="JGSX" name="JGSX" value="研究机构" > 研究机构
						    </label>
						    <label class="radio-inline">
						        <input type="radio" id="JGSX" name="JGSX"  value="其它"> 其它
						    </label>
						</td>
					</tr>
					<tr>
						<td colspan="4">*机构简介（主要包括基本情况、现有研究基础等，限200字以内）</td>
					</tr>
					<tr>
						<td colspan="4">
							<textarea name="JGJJ" id="JGJJ"class="form-control" rows="8" maxlength="200" autofocus></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="1">*技术需求名称</td>
						<td colspan="3">
						<input type="text" class="form-control" name="XQMC" id="XQMC" placeholder="技术需求名称" onkeypress="if(event.keyCode==13) focusNextInput(this);" required>
						</td>
					</tr>
					<tr>
						<td colspan="1">*需求时限</td>
						<td colspan="3">
						<div class="col-md-12">
							<div class="col-md-3">
								<select class="form-control" id="XUKSSJ" name="XUKSSJ"> 								
								    <option value="1970">1970年</option> 								
								</select> 							
								<script> 								
								for(var i = 1970;i < 2018 ; i++) 								
								{ 								
								    document.getElementById("XUKSSJ").innerHTML += '<option value="'+i+'">'+i+'年</option>'; 								
								} 
								</script>
							</div>
							<div class="col-md-2">
								年至
							</div>
							<div class="col-md-3">
								<select class="form-control" id="XQJSSJ" name="XQJSSJ"> 								
								    <option value="1970">1970年</option> 								
								</select> 
								<script> 								
								for(var i = 1970;i < 2018 ; i++) 								
								{ 								
								    document.getElementById("XQJSSJ").innerHTML += '<option value="'+i+'">'+i+'年</option>'; 								
								} 
								</script>
							</div>
							<div class="col-md-2">
								年
							</div>
						</div>
						</td>
					</tr>
					<tr>
						<td colspan="4">*技术需求概述 *1.主要问题（需要解决的重大技术问题，限500字以内）</td>
					</tr>
					<tr>
						<td colspan="4">
							<textarea name="ZYWT" id="ZYWT"class="form-control" rows="8" maxlength="500" onkeypress="if(event.keyCode==13) focusNextInput(this);" ></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="4">*2.技术关键（所需的关键技术、主要指标，限500字以内）</td>
					</tr>
					<tr>
						<td colspan="4">
							<textarea name="JSGJ" id="JSGJ"class="form-control" rows="8" maxlength="500" required></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="4">*3.预期目标（技术创新性、经济社会效益，限500字以内）</td>
					</tr>
					<tr>
						<td colspan="4">
							<textarea name="YQMB" id="YQMB"class="form-control" rows="8" maxlength="500" required></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="1">*关键字(1-5个)只能逐个输入</td>
						<td colspan="3">
						<div class="col-md-2">
							<input type="text" id="GJZ" name="GJZ" onkeypress="if(event.keyCode==13) focusNextInput(this);">
						</div>
						<div class="col-md-2">
							<input type="text" id="GJZ" name="GJZ" onkeypress="if(event.keyCode==13) focusNextInput(this);">
						</div>
						<div class="col-md-2" >
							<input type="text" id="GJZ" name="GJZ" onkeypress="if(event.keyCode==13) focusNextInput(this);">
						</div>
						<div class="col-md-2">
							<input type="text" id="GJZ" name="GJZ" onkeypress="if(event.keyCode==13) focusNextInput(this);">
						</div>
						<div class="col-md-2">
							<input type="text" id="GJZ" name="GJZ" onkeypress="if(event.keyCode==13) focusNextInput(this);">
						</div>
						</td>
					</tr>
					<tr>
					<td>拟投入资金总额</td>
					<td colspan="2"><input type="text" class="form-control" name="NTRZJZE" id="NTRZJZE" placeholder="计划总投资" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
					<td>万元</td>
					</tr>
					<tr>
						<td colspan="1">技术需求解决方式</td>
						<td colspan="3">
							<label class="radio-inline">
						        <input type="radio" id="JSXQJJFS" name="JSXQJJFS"  value="独立开发" checked> 独立研发
						    </label>
						    <label class="radio-inline">
						        <input type="radio" id="JSXQJJFS" name="JSXQJJFS"  value="委托研发"> 委托研发
						    </label>
						    <label class="radio-inline">
						        <input type="radio" id="JSXQJJFS" name="JSXQJJFS" value="合作研发" >合作研发
						    </label>
						    <label class="radio-inline">
						        <input type="radio" id="JSXQJJFS" name="JSXQJJFS"  value="其他"> 其他
						    </label>
						</td>
					</tr>
					<tr>
					<td>合作意向单位</td>
					<td colspan="3"><input type="text" class="form-control" name="HZYXDW" id="HZYXDW" placeholder="合作意向单位" onkeypress="if(event.keyCode==13) focusNextInput(this);"></td>
					</tr>
					<tr>
						<td>*科技活动类型</td>
						<td colspan="3">
						<label class="radio-inline">
						        <input type="radio" id="jichu" name="KJHDLX"  value="基础研究" checked> 基础研究
					    </label>
					    <label class="radio-inline">
					        <input type="radio" id="yingyong" name="KJHDLX"  value="应用研究"> 应用研究
					    </label>
					    <label class="radio-inline">
					        <input type="radio" id="shiyan" name="KJHDLX" value="试验发展" >试验发展
					    </label>
					    <label class="radio-inline">
					        <input type="radio" id="yanjiu" name="KJHDLX"  value="研究与试验发展成果应用"> 研究与试验发展成果应用
					    </label>
					    <label class="radio-inline">
					        <input type="radio" id="jishu" name="KJHDLX"  value="技术推广与科技服务"> 技术推广与科技服务
					    </label>
					    <label class="radio-inline">
					        <input type="radio" id="shengchan" name="KJHDLX"  value="生产性活动"> 生产性活动
					    </label>
						</td>
					</tr>
					</tbody>
					</table>
				    <table class="table table-bordered" id="xueke" style="display:block">
						<tbody>
						<tr>
							<td colspan="1">学科分类（限基础研究填写）</td>
							<td colspan="3"> 
								<select name="XKFL" id="XKFL">
								  <option value ="数学">数学</option>
								  <option value ="英语">英语</option>
								  <option value="政治">政治</option>
								  <option value="历史">历史</option>
								  <option value="语文">语文</option>
								</select>
							</td>
						</tr>
						</tbody>
					</table>
					
					<table class="table table-bordered"  style="display:none" id="lingyu">
					<tbody>
					<tr>
						<td colspan="1">*需求技术所属领域(非基础研究填写)</td>
						<td colspan="3">
						<div >
						 <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY" value="电子信息" >电子信息
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY" value="光电机一体化">光电机一体化
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="生物技术与制药">生物技术与制药
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="新材料及应用">新材料及应用
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="现代农业">现代农业
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="新能源与高效节能">新能源与高效节能
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="资源与环境">资源与环境
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="高技术服务业">高技术服务业
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="海洋">海洋
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="社会公共事业">社会公共事业
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="医疗卫生">医疗卫生
					    </label>
					    <label class="checkbox-inline">
					        <input type="checkbox" id="XQJSSSLY" name="XQJSSSLY"  value="其他">其他
					    </label>
					    </div>
						</td>
					</tr>			
					<tr >
						<td colspan="1">需求技术应用行业（非基础研究填写）</td>
						<td colspan="3"> 
								<select name="XQJSYYHY" id="XQJSYYHY">
								  <option value ="农业">农业</option>
								  <option value ="手工业">手工业</option>
								  <option value="工商业">工商业</option>
								  <option value="电子业">电子业</option>
								  
								</select>
						</td>				
					</tr>
				
				</tbody>
			</table>
			<input class="form-control btn btn-info"type="submit" value="提交">
			</form>
		   </div>
		<div class="col-md-1"></div>
		<div class="col-md-12"></div>
	</div>
	<div class="col-md-12">
	<c:if test="${param.status.equals('0')}">
				<div class="col-md-12">
			  	 <div class="alert alert-danger">提交成功</div>
			  	 </div>    			
			</c:if>
	</div>
</body>
</html>