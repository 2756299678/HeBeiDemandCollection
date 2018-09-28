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
			<h3>网络审核</h3>
	</div>
	<div class="col-md-12">
		
			
			<form action="${pageContext.request.contextPath }/needServlet?method=SearchList" method="post">
				<div class="col-md-10">
				<table class="table table-bordered">
				<tbody>
					<tr>
						<td>需求名称</td>
						<td> <input type="text" class="form-control" name="XQMC" id="XQMC" placeholder="需求名称" ></td>
						<td>机构名称</td>
						<td> <input type="text" class="form-control" name="JGMC" id="JGMC"  placeholder="机构名称" ></td>
						<td>所在地域</td>
						<td> <input type="text" class="form-control" name="SZDY" id="SZDY"  placeholder="所在地域" ></td>
					</tr>
					<tr>
						<td>归口管理单位</td>
						<td> <input type="text" class="form-control" name="GKGL" id="GKGL" placeholder="归口管理单位" ></td>
						<td>机构属性</td>
						<td> <input type="text" class="form-control" name="JGSX" id="JGSX"  placeholder="机构属性" ></td>
						<td>科技活动</td>
						<td> <input type="text" class="form-control" name="KJHD" id="KJHD"  placeholder="科技活动" ></td>
					</tr>
				</tbody>
				</table>
				</div>
				<div class="col-md-2" style="margin-top: 30px;">
				<input class="form-control btn btn-info"type="submit" value="查询">
				</div>
			</form>
		</div>
		<div class="col-md-12" style="margin-top: 30px;">
			<table class="table table-striped">
				<tr>
					<td>序号</td>
					<td>技术需求名称</td>
					<td>提交日期</td>
					<td>需求状态</td>
				</tr>
				<c:forEach items="${messages}" var="item" varStatus="status">
					<tr>
						<td>${item.id}</td>
						<td><a href="${pageContext.request.contextPath }/needServlet?method=showshenhe&id=${item.id}">${item.XQMC}</a></td>
						<td>${item.create_date}</td>
						<c:if test="${item.status.equals('0')}">
					    	<td>未审核</td>    			
					    </c:if>
					    <c:if test="${item.status.equals('1')}">
					    	<td>已审核</td>    			
					    </c:if>
					    <c:if test="${item.status.equals('2')}">
					    	<td>被退回</td>   			
					    </c:if>
						</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	</div>
</body>
</html>