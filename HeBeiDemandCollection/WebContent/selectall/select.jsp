<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>分类查询</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
 <link rel="stylesheet" href="../static/bootstrap-3.3.5-dist/css/bootstrap.css">
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap-3.3.5-dist/js/bootstrap.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.validate.js" ></script>
 <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/myValidate.js" ></script>
</head>
<script type="text/javascript">
		function chType(obj){
			
			$(obj).parent().nextAll().remove();
			var KJHDLX = obj.value;
			if(!(KJHDLX=="-1")){
				//alert("XXXX");
				//ajax请求
				$.post("../needServlet",{
					method : "getType",
					KJHDLX :KJHDLX
				},
				function(data){
					console.log(data);
					
					if(data != null && data.length>0){
						var content = "<div class='col-sm-2'>"+
						"<select name='FL' class='form-control' onchange='' id='type0'>"+
						"<option value='-1'>--请选择分类--</option>";
						for(var type in data){
							content +="<option value='"+data[type].name+"'>"+data[type].name+"</option>"						}
					}
					content +="</select></div>";
		
					if(data[type]!=undefined)
					{
						$("#types").append(content);	
					}		
				},"json");
			}
			chProperty(obj);
		}
		function text(){
			alert("XXXX");
		}
</script>
<body>
<div class="container-fulid">
		<div class="col-md-12 page-header" align="left" style="margin-top:-10px">
			<h3>树形查询</h3>
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
</body>
</html>