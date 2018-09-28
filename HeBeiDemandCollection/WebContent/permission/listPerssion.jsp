<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示用户和角色</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/css/bootstrap.css">
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.validate.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/xuqiuValidate.js" ></script>
</head>
<body>
		<div class="col-md-12 page-header" align="left" style="margin-top:-10px">
			<h3>权限分配</h3>
		</div>
		<div class="col-md-4" style="margin-top:10px">
		<a class="btn btn-info" href="${pageContext.request.contextPath }/permission/addPermission.jsp">添加角色</a>
		</div>
		<div class="col-md-8"></div>
		<table class="col-md-12 table table-striped" style="margin-top:20px">
		
			<thead>
				<tr>
					<th>用户名</th>
					<th>角色权限</th>
					<th>修改用户角色</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${userbeans}" var="item" varStatus="status">
				<tr>
					<td><a href="${pageContext.request.contextPath }/needServlet?method=usershow&&username=${item.username}">${item.username}</a></td>
					<td><a href="${pageContext.request.contextPath }/permissionServlet?method=show&&username=${item.quanxian}">${item.quanxian}</a></td>
					<td><a href="${pageContext.request.contextPath }/userServlet?method=show&&username=${item.username}">角色修改</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
</body>
</html>