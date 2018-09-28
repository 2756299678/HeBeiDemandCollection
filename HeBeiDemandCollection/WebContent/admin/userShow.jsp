<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>需求征集信息</title>
 
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/css/bootstrap.css">
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.validate.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jsyanzheng.js" ></script>
</head>
<body>
	<div class="container-fulid">
		<div class="col-md-12">
		<h1 align="center">用户信息</h1>
		</div>
		<div class="col-md-1"></div>
		<div class="col-md-10">
		<%-- <form name="checkForm" id="checkForm" action="${pageContext.request.contextPath }/needServlet?method=back" class="form-horizontal" method="post"> --%>
		        <table class="table table-bordered">
				<tbody>
					<tr>
						<td>*机构全称</td>
						<td> <label>${userBean.quancheng }</label></td>
						<td>归口管理部门</td>
						<td> <label>${userBean.guanli }</label></td>
					</tr>
					<tr>
						<td>*通讯地址</td>
						<td><label>${userBean.address }</label></td>
						<td>*所在地域</td>
						<td><label>${userBean.stress }</label></td>
					</tr>
					<tr>
						<td>网址</td>
						<td><label>${userBean.wangzhi }</label></td>
						<td>*电子邮箱</td>
						<td><label>${userBean.email }</label></td>
					</tr>
					<tr>
						<td>*法人代表</td>
						<td><label>${userBean.daibiao }</label></td>
						<td>邮政编码</td>
						<td><label>${userBean.youbian }</label></td>
					</tr>
					<tr >
						<td rowspan="2">联系人</td>
						<td rowspan="2"><label>${userBean.name }</label></td>
						<td>*电话</td>
						<td><label>${userBean.phone }</label></td>
					</tr>
					<tr>
					    <td>传真</td>
						<td><label>${userBean.chuanzhen }</label></td>
					</tr>					
				</tbody>
			</table>
			
			<!-- </form> -->
		   </div>
		<div class="col-md-1"></div>
		<div class="col-md-12"></div>
	</div>
	<div class="col-md-12"></div>
</body>
</html>