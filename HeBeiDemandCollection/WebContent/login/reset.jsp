<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>需求展示</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/css/bootstrap.css" />
<!--导入jquery.js-->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>	
<!--导入bootstrap.js-->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script> 
</head>
<body>
	<div class="row-fulid" style="margin-top: 5px;">
	<div class="col-md-12 page-header" align="left" style="margin-top:-10px">
			<h3>密码重置</h3>
	</div>
	<div class="col-md-12">
	<table class="table table-bordered">
		<tr>
			<td>用户名</td>
			<td>机构全称</td>
			<td>通讯地址</td>
			<td>所在地域</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${userbeans}" var="item" varStatus="status">
			<tr>
				<td><a href="${pageContext.request.contextPath }/needServlet?method=usershow&&username=${item.username}">${item.username}</a></td>
				<td>${item.quancheng}</td>
				<td>${item.address}</td>
				<td>${item.stress}</td>
				<td><a href="${pageContext.request.contextPath }/userServlet?method=reset&username=${item.username}">密码重置</a></td>
				</tr>
		</c:forEach>
	</table>
	<c:if test="${param.status.equals('0')}">
		<div class="col-md-12">
	  	 <div class="alert alert-danger">已重置</div>
	  	 </div>    			
	</c:if>
	<c:if test="${param.status.equals('1')}">
		<div class="col-md-12">
	  	 <div class="alert alert-danger">重置失败</div>
	  	 </div>    			
	</c:if>
	</div>
	</div>
</body>
</html>