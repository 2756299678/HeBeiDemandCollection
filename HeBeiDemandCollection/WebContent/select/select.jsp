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
			<h3>分类查询</h3>
		</div>
		<form action="${pageContext.request.contextPath }/needServlet?method=selectfenlei" method="post">
			<div class="form-group col-md-12" id = "types">
				<label id="label1" class="col-sm-2 control-label" for="name" >查询条件：</label>
				<div class="col-sm-2">
					<select name="KJHDLX" class="form-control" onchange="chType(this)" id="type0">
						<option value = "-1">--请选择科技活动类型--</option>
						<c:forEach items="${allKJHDLX}" var="item">
							<option value="${item}">${item}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="col-md-2" style="margin-top: 30px;">
				<input class="form-control btn btn-info"type="submit" value="查询">
			</div>
		</form>
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