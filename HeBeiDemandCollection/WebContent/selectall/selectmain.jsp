<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户管理界面</title>
	<!-- 导入bootstrap. css-->
	<link rel="stylesheet" href="../static/bootstrap-3.3.5-dist/css/bootstrap.css" />
	<!--导入jquery.js-->
	   <script type="text/javascript" src="../static/js/jquery-1.12.1.js" ></script>	
	<!--导入bootstrap.js-->
	<script type="text/javascript" src="../static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
</head>
<!-- 没有body -->
	<frameset frameborder="no" rows="*" >
   		<frameset cols="285px,*" rows="*">
   			<frame src="${pageContext.request.contextPath }/selectall/left1.jsp">
   			
			<frame src="${pageContext.request.contextPath }/selectall/select.jsp" name="main"/>
			
   		</frameset>
   	</frameset>

</html>