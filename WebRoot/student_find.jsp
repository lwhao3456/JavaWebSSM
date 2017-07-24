<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'findstudent.jsp' starting page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css" />
    <script src="${pageContext.request.contextPath}/lib/jquery/jquery-1.11.1.js" type="text/javascript" charset="utf-8"></script>
	<script src="${pageContext.request.contextPath}/lib/bootstrap/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
	<script src="${pageContext.request.contextPath}/lib/datepicker/WdatePicker.js" type="text/javascript" charset="utf-8"></script>
  </head>
  <body>
   <div class="container" style="width:40%">
  	<form action="${pageContext.request.contextPath}/student/findByName.action" method="post">
  		<label>请输入要查询的学生姓名:</label><input type="text" name="name" class ="form-control" placeholder="姓名"><br>
  		<button type="submit" class="btn btn-primary">查询</button>
    </form>
  	<form action="${request.ContextPath()}/findStudentByAge.do">
  		<label>请输入要查询的学生年龄:</label><input type="text" name="age" placeholder="年龄"><br>
  		<button type="submit" class="btn btn-primary">查询</button>
  	</form>
  	<form action="${request.ContextPath() }/findstudentByGender.do">
  		<label>请输入要查询的学生性别:</label><input type="text" name="gender" placeholder="性别"><br>
  		<button type="submit" class="btn btn-primary">查询</button>
  	</form>
  	</div>
  </body>
</html>
