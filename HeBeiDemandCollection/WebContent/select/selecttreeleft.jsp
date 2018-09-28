<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>树形菜单</title>
<link rel="stylesheet" type="text/css" href="../tree/dtree.css">
<script type="text/javascript" src="dtree.js"></script>
</head>
<body>
 <div class="dtree">
 <p><a href="javascript: d.openAll();">展开</a> | <a href="javascript: d.closeAll();">收缩</a></p>
 <script type="text/javascript">
  
  d = new dTree('d');
  d.add(0,-1,'欢迎登录');
  d.add(1,0,'项目第一部分');
  d.add(2,1,'信息添加','index.jsp','','selectAction');
  d.add(3,1,'信息查询','index.jsp','','selectAction');
  d.add(4,1,'信息调度','index.jsp','','selectAction');
  d.add(5,1,'信息图表','index.jsp','','selectAction');
  d.add(6,0,'项目第二部分');
  d.add(7,6,'信息添加','index.jsp');
  d.add(8,6,'信息查询','index.jsp');
  d.add(9,6,'信息查询');
  d.add(10,6,'信息查询');
  d.add(11,0,'项目第三部分');
  d.add(12,11,'信息添加','index.jsp');
  d.add(13,11,'信息查询','index.jsp');
  d.add(14,11,'信息查询','index.jsp');
  d.add(15,11,'信息查询');
  d.add(16,0,'物品库存管理');
  d.add(17,16,'入库管理');
  d.add(18,17,'入库登记','index.jsp');
  d.add(19,17,'入库查询','index.jsp');
  d.add(20,16,'出库管理');
  d.add(21,20,'出库登记','index.jsp');
  d.add(22,20,'出库查询','index.jsp');
  d.add(23,0,'系统应用管理');
  d.add(24,23,'部门管理','index.jsp');
  d.add(25,23,'角色管理','index.jsp');
  d.add(26,23,'用户管理');
  d.add(27,26,'用户添加','index.jsp');
  d.add(28,26,'用户查询','index.jsp');
  d.add(29,23,'操作日志');
  d.add(30,0,'系统使用帮助');
  d.add(31,30,'使用说明');
  d.add(32,30,'系统主页');
  d.add(33,0,'安全退出系统','index.jsp','','_parent');
  document.write(d);  
 </script>
 </div>
</body>
</html>