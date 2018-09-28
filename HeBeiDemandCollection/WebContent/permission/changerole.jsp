<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户角色</title>
 
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/css/bootstrap.css">
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.validate.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jsyanzheng.js" ></script>
</head>
<body>
	<div class="container-fulid" style="margin-top:20px">
		<div class="col-md-1"></div>
		<div class="col-md-10">
			<form name="checkForm" id="checkForm" action="${pageContext.request.contextPath }/permissionServlet?method=changeuser&&username=${userBean.username }" class="form-horizontal" method="post"> 
	    		<div class="col-md-2" align="right">
		        	<h4>用户名：</h4>
		        </div>
		        <div class="col-md-10">
		        	<h4>${userBean.username }</h4>
		        </div>
			    <div class="col-md-2" align="right">
			    	<h4>选择角色:</h4>
			    </div>
			    <div class="col-md-2">
			    	<input class="form-control" type="text" name="quanxian" id="quanxian" value="${permission.username }">
			    </div>
			    <div class="col-md-2">
			    	<input class="form-control  btn btn-info"type="submit" value="确认修改" >
			    </div>  
			    <div class="col-md-4">
			    </div>  
			</form>
		   </div>
		<div class="col-md-1"></div>
		<div class="col-md-12"></div>
	</div>
	<div class="col-md-12"></div>
</body>
</html>