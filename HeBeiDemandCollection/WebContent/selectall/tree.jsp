<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
//String path = request.getContextPath();
//String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">  
    <title>���β˵�</title>
 
 <link rel="stylesheet" type="text/css" href="tree/dtree.css">
 <script type="text/javascript" src="tree/dtree.js"></script>
  </head>
  <body>
 <div class="dtree">
 <p><a href="javascript: d.openAll();">չ��</a> | <a href="javascript: d.closeAll();">����</a></p>
 <script type="text/javascript">
  
  d = new dTree('d');
  d.add(0,-1,'��ӭ��¼');
  d.add(1,0,'��Ŀ��һ����');
  d.add(2,1,'��Ϣ���','index.jsp');
  d.add(3,1,'��Ϣ��ѯ','index.jsp');
  d.add(4,1,'��Ϣ����','index.jsp');
  d.add(5,1,'��Ϣͼ��','index.jsp');
  d.add(6,0,'��Ŀ�ڶ�����');
  d.add(7,6,'��Ϣ���','index.jsp');
  d.add(8,6,'��Ϣ��ѯ','index.jsp');
  d.add(9,6,'��Ϣ��ѯ');
  d.add(10,6,'��Ϣ��ѯ');
  d.add(11,0,'��Ŀ��������');
  d.add(12,11,'��Ϣ���','index.jsp');
  d.add(13,11,'��Ϣ��ѯ','index.jsp');
  d.add(14,11,'��Ϣ��ѯ','index.jsp');
  d.add(15,11,'��Ϣ��ѯ');
  d.add(16,0,'��Ʒ������');
  d.add(17,16,'������');
  d.add(18,17,'���Ǽ�','index.jsp');
  d.add(19,17,'����ѯ','index.jsp');
  d.add(20,16,'�������');
  d.add(21,20,'����Ǽ�','index.jsp');
  d.add(22,20,'�����ѯ','index.jsp');
  d.add(23,0,'ϵͳӦ�ù���');
  d.add(24,23,'���Ź���','index.jsp');
  d.add(25,23,'��ɫ����','index.jsp');
  d.add(26,23,'�û�����');
  d.add(27,26,'�û����','index.jsp');
  d.add(28,26,'�û���ѯ','index.jsp');
  d.add(29,23,'������־');
  d.add(30,0,'ϵͳʹ�ð���');
  d.add(31,30,'ʹ��˵��');
  d.add(32,30,'ϵͳ��ҳ');
  d.add(33,0,'��ȫ�˳�ϵͳ','index.jsp','','_parent');
  document.write(d);  
 </script>
 </div>
  </body>
</html>