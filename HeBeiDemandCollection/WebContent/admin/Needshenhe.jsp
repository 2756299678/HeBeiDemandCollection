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
		<h1 align="center">河北省重大需求征集</h1>
		</div>
		<div class="col-md-1"></div>
		<div class="col-md-10">
		<%-- <form name="checkForm" id="checkForm" action="${pageContext.request.contextPath }/needServlet?method=back" class="form-horizontal" method="post"> --%>
		        <table class="table table-bordered">
				<tbody>
					<tr>
						<td>*机构全称</td>
						<td> <label>${needBean.quancheng }</label></td>
						<td>归口管理部门</td>
						<td> <label>${needBean.guanli }</label></td>
					</tr>
					<tr>
						<td>*通讯地址</td>
						<td><label>${needBean.address }</label></td>
						<td>*所在地域</td>
						<td><label>${needBean.stress }</label></td>
					</tr>
					<tr>
						<td>网址</td>
						<td><label>${needBean.wangzhi }</label></td>
						<td>*电子邮箱</td>
						<td><label>${needBean.email }</label></td>
					</tr>
					<tr>
						<td>*法人代表</td>
						<td><label>${needBean.daibiao }</label></td>
						<td>邮政编码</td>
						<td><label>${needBean.youbian }</label></td>
					</tr>
					<tr >
						<td rowspan="2">联系人</td>
						<td rowspan="2"><label>${needBean.name }</label></td>
						<td>*电话</td>
						<td><label>${needBean.phone }</label></td>
					</tr>
					<tr>
					    <td>传真</td>
						<td><label>${needBean.chuanzhen }</label></td>
					</tr>
					<tr>
						<td colspan="1">*机构属性</td>
						<td colspan="3">
							<label>${needBean.JGSX }</label>
						</td>
					</tr>
					<tr>
						<td colspan="4">*机构简介（主要包括基本情况、现有研究基础等，限500字以内）</td>
					</tr>
					<tr>
						<td colspan="4">
							<label>${needBean.JGJJ }</label>
						</td>
					</tr>
					<tr>
						<td colspan="1">*技术需求名称</td>
						<td colspan="3">
						<label>${needBean.XQMC }</label>
						</td>
					</tr>
					<tr>
						<td colspan="1">*需求时限</td>
						<td colspan="3">
						<div class="col-md-12">
							<div class="col-md-3">
							
							<label>${needBean.XUKSSJ }</label>
								
							</div>
							<div class="col-md-2">
								年至
							</div>
							<div class="col-md-3">
							<label>${needBean.XQJSSJ }</label>
							</div>
							<div class="col-md-2">
								年
							</div>
						</div>
						</td>
					</tr>
					<tr>
						<td colspan="4">*技术需求概述 *1.主要问题（需要解决的重大技术问题，限500字以内）</td>
					</tr>
					<tr>
						<td colspan="4">
						<label>${needBean.ZYWT }</label>
						</td>
					</tr>
					<tr>
						<td colspan="4">*2.技术关键（所需的关键技术、主要指标，限500字以内）</td>
					</tr>
					<tr>
						<td colspan="4">
						<label>${needBean.JSGJ }</label>
						</td>
					</tr>
					<tr>
						<td colspan="4">*3.预期目标（技术创新性、经济社会效益，限500字以内）</td>
					</tr>
					<tr>
						<td colspan="4">
						<label>${needBean.YQMB }</label>
							
						</td>
					</tr>
					<tr>
						<td colspan="1">*关键字(1-5个)只能逐个输入</td>
						<td colspan="3">
						<label>${needBean.GJZ }</label>
						</td>
					</tr>
					<tr>
					<td>拟投入资金总额</td>
					<td colspan="2">
					<label>${needBean.NTRZJZE }</label>
					</td>
					<td>万元</td>
					</tr>
					<tr>
						<td colspan="1">技术需求解决方式</td>
						<td colspan="3">
						<label>${needBean.JSXQJJFS }</label>
						</td>
					</tr>
					<tr>
					<td>合作意向单位</td>
					<td colspan="3">
						<label>${needBean.HZYXDW  }</label>
					</td>
					</tr>
					<tr>
						<td>*科技活动类型</td>
						<td colspan="3">
						<label>${needBean.KJHDLX }</label>
						</td>
					</tr>
					<tr>
						<td colspan="1">学科分类（限基础研究填写）</td>
						<td colspan="3">（参见学科分类）三级下拉文本框</td>
					</tr>
					<tr>
						<td colspan="1">*需求技术所属领域(非基础研究填写)</td>
						<td colspan="3">
						<label>${needBean.XQJSSSLY }</label>
						</td>
					</tr>
					<tr>
						<td colspan="1">需求技术应用行业（非基础研究填写）</td>
						<td colspan="3">（参见国民经济行业分类）三级下拉文本框</td>
					</tr>					
				</tbody>
			</table>
			<!-- </form> -->
			<form class="form-horizontal" action="${pageContext.request.contextPath }/needServlet?method=pingjia&id=${needBean.id}" method="post" role="form">
		 
				  <div class="form-group col-md-12">
				    <label for="name">形式审核意见</label>
				    <textarea class="form-control" rows="5" name="pingjia" id="pingjia" maxlength="100" value="${needBean.pingjia }"></textarea>
				  </div>
				  
			  <div class="form-group col-md-12">
				  <div class="col-md-4"></div>
				  <div class="col-md-2">
				  <button type="submit"  name="submit" value="1" class="btn btn-info">通过</button>
				  </div>
				  <div class="col-md-2">
				  <button type="submit"  name="submit" value="2" class="btn btn-default">退回</button>
				  </div>
				  <div class="col-md-4"></div>
			  </div>
			 <c:if test="${param.status.equals('0')}">
				<div class="col-md-12">
			  	 <div class="alert alert-danger">已评价</div>
			  	 </div>    			
			</c:if>
			</form>
			
		   </div>
		<div class="col-md-1"></div>
		<div class="col-md-12"></div>
	</div>
	<div class="col-md-12"></div>
</body>
</html>