<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
 <link rel="stylesheet" href="../static/bootstrap-3.3.5-dist/css/bootstrap.css">
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.validate.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/myValidate.js" ></script>
</head>
<body>
<div class="row-fulid" style="margin-top: 50px;">
    		<div class="col-md-4"></div>
    		<div class="col-md-4">
			<form  id="checkForm" class="form-horizontal" action="${pageContext.request.contextPath }/userServlet?method=change&username=${userBean.username}&loginpassword=${userBean.password}" method="post">
			<div class="form-group">
				<label class="col-md-4 control-label">旧密码：</label>
				<div class="col-md-8">
				<input class=" form-control"type="text"  name="oldpassword" id="oldpassword" >
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">新密码：</label>
				<div class="col-md-8">
				<input class=" form-control" type="password" name="password" id="password">
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-4 control-label">确认密码：</label>
				<div class="col-md-8">
				<input class=" form-control"type="password" name="password2" id="password2" >
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-1"></div>
				<div class="col-md-11">
				<input class=" form-control btn btn-info"type="submit" value="提交" >
				</div>
			</div>
			</form>
			<c:if test="${param.status.equals('0')}">
			    <div class="alert alert-danger">修改失败</div>    			
			</c:if>
			<c:if test="${param.status.equals('1')}">
			    <div class="alert alert-danger">修改成功</div>    			
			</c:if>
			</div>
			<div class="col-md-4"></div>
			</div>
</body>
</html>