<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style type="text/css">
    	body{
    		margin: 0;
    		padding: 0;
    		font-size: 12px;
    		font-family: "微软雅黑",verdana,arial,helvetica,sans-serif
    	}
    	.leftMenu{
    		min-width: 220px;
    		width: 268px;
    		margin: 40px auto 0 auto;
    	}
    	.menu{
    		border:#bdd7f2 1px solid;
    		border-top: #0080c4 4px solid;
    		border-bottom: #0080c4 4px solid;
    		background:#f4f9ff repeat-y right;
    		margin-left:10px;
    	}
    	/* menu中的listtitle注意空格 */
    	.menu .ListTitle{
    		border-bottom: 1px #98c9ee solid;
    		display:block;
    		text-align: center;
    		height: 38px;
    		line-height: 38px;
    		cursor:pointer;
    		
    		+width：100%;
    	}
    	.ListTitlePanel{
    		position:relative;
    	}
    	.leftbgbt{
    		position:absolute;
    		background: no-repeat;
    		width: 11px;
    		height: 52px;
    		left:-11px;
    		top:-4px;
    	}
    	.leftbgbt2{
    		position:absolute;
    		background: no-repeat;
    		width: 11px;
    		height: 48px;
    		left:-11px;
    		top:-1px;
    	}
    	.menuList{
    		display:block;
    		height:auto;
    	}
    	/* menulist中的div注意空格 */
    	.menuList div{
    		height:28px;
    		line-height: 24px;
    		border-bottom: 1px #98c9ee dotted;
    	}
    	/* menulist中的div中的a标签 注意空格 */
    	.menuList div a{
    		display:block;
    		background: #fff;
    		line-height: 28px;
    		height:28px;
    		text-align: center;
    		color: #185697;
    		text-decoration: none;
    	}
    	/* menulist中的div中的a标签hover属性 注意空格 */
    	.menuList div a:hover{
    		color:#f30;
    		background:#0080c4;
    		color:#fff;
    	}
    </style>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.1.js"></script>
<body style="margin-top: -35px;">
<div class="leftMenu" >
	<div class="menu">
		<div class="menuParent">
			<div class="ListTitle" style="height: 34px; background-color: #44A2EF">
					<strong style="color: #FFFFFF;font-size: 20px;line-height: 34px;">系统菜单</strong>
					<div class="leftbgbt"> </div>
			</div>
			<div class="menuList">
			<div>
			
				<div> <a target="mainAction" href="${pageContext.request.contextPath }/login/zhuce.jsp">用户注册</a></div>

			</div>
		</div>
	</div>
</div>
<div style="text-align:left;">
</div>

</body>
</html>