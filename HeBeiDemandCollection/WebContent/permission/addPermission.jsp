<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加角色</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/css/bootstrap.css">
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.validate.js" ></script>
</head>
<script type="text/javascript">
$.validator.addMethod("usernp", function(value, element) {   
	var usernameReg = /^[a-zA-Z0-9_][a-zA-Z0-9_]{2,9}$/;
	return this.optional(element) || (usernameReg.test(value));
}, "请正确填写您的用户名/密码");
$(function(){
	$("#checkForm").validate({
		rules:{
			username:{
			  	required : true,
				usernp:true
			}
		},
		messages:{
			username:{
				required : "角色名为空",
				usernp:"角色名格式不正确，3-10位数字/字母/下划线"
			}
		}
	});
});
</script>
<body>

	<div class="container-fulid" style="margin-top:20px">
			
			<div class="col-md-1"></div>
			<div class="col-md-10">
			<form name="checkForm" id="checkForm" action="${pageContext.request.contextPath }/permissionServlet?method=add" class="form-horizontal" method="post">
			       
			       	<div class="col-md-2" align="right">
			        	<h4>角色名称：</h4>
			        </div>
			        <div class="col-md-10">
			        	<input class="form-control" type="text" name="username" id="username" value="${permission.username }">
			        </div>
			        
			        <table class="col-md-12 table table-striped" style="margin-top:20px">
					<thead>
						<tr>
							<th>编号</th>
							<th>权限内容</th>
							<th>是否赋予</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>权限分配</td>
							<td>
								<input type="checkbox" id="QXFP" name="QXFP" value="1"  ${permission.QXFP == '1' ? 'checked': '' }>
							</td>
						</tr>
						<tr>
							<td>2</td>
							<td>需求征集</td>
							<td>
								<input type="checkbox" id="XQZJ" name="XQZJ" value="1" ${permission.XQZJ == '1' ? 'checked': '' }>
							</td>
						</tr>
						<tr>
							<td>3</td>
							<td>浏览需求</td>
							<td>
								<input type="checkbox" id="LLXQ" name="LLXQ" value="1" ${permission.LLXQ == '1' ? 'checked': '' }>
							</td>
						</tr>
						<tr>
							<td>4</td>
							<td>用户信息</td>
							<td>
								<input type="checkbox" id="YHXX" name="YHXX" value="1" ${permission.YHXX == '1' ? 'checked': '' }>
							</td>
						</tr>
						<tr>
							<td>5</td>
							<td>修改密码</td>
							<td>
								<input type="checkbox" id="XGMM" name="XGMM" value="1" ${permission.XGMM == '1' ? 'checked': '' }>
							</td>
						</tr>
						<tr>
							<td>6</td>
							<td>网络审核</td>
							<td>
								<input type="checkbox" id="WLSH" name="WLSH" value="1" ${permission.WLSH == '1' ? 'checked': '' }>
							</td>
						</tr>
						<tr>
							<td>7</td>
							<td>密码重置</td>
							<td>
								<input type="checkbox" id="MMCZ" name="MMCZ" value="1" ${permission.MMCZ == '1' ? 'checked': '' }>
							</td>
						</tr>
						<tr>
							<td>8</td>
							<td>统计查询</td>
							<td>
								<input type="checkbox" id="TJCX" name="TJCX" value="1" ${permission.TJCX == '1' ? 'checked': '' }>
							</td>
						</tr>
					</tbody>
					</table>
					<div class="col-md-1"></div>
					<div class="col-md-6">
					<input class="form-control  btn btn-info"type="submit" value="确认添加" >
					</div>
					<div class="col-md-5"></div>
					<div class="col-md-1"></div>
					<div class="col-md-6">
					<c:if test="${param.status.equals('0')}">
					    <div class="alert alert-danger">角色名存在</div>    			
					</c:if>
					<c:if test="${param.status.equals('1')}">
					    <div class="alert alert-danger">角色添加成功</div>    			
					</c:if>
					<c:if test="${param.status.equals('2')}">
					    <div class="alert alert-danger">角色添加失败</div>    			
					</c:if>
					</div>
					<div class="col-md-5"></div>
			</form>
			<div class="col-md-12" style="margin-top:20px"></div>
			</div>
	</div>

</body>
</html>