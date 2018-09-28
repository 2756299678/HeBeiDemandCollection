# HeBeiDemandCollection
[功能描述]：
河北省重大技术需求是一款征集河北省各企业各高校的需求，进行筛选审核，
为河北省的重点扶持政策作出指导性意见。

[开发环境]：
系统：Windows
环境配置：Eclipes+Tomcat+mysql

[项目结构简介]：

src/main/java/com/Bean         存放实体类
src/main/java/com/Dao          对dao方法进行实现
src/main/java/com/Daoif        存放方法类的接口
src/main/java/com/Servlet      Servlet类
src/main/java/com/utils        工具类

[程序思路]：
系统采用MVC模式进行构建，
前端将数据传入Servlet,Servlet引用Dao层的方法，然后Dao层
引用实体类进行数据库的连接。
系统的重点是实现对信息的填报、审核、查询统计管理。
首先根据系统的需求开发出所有的功能，
然后根据审核员、填报员进行权限的管理。


[作者列表]：
Lighter


[历史版本]：
1.0版本（2017-10-9）

[联系方式]：
QQ:2756299678
