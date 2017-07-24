<%@page import="com.situ.ssm.entity.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'edite_student.jsp' starting page</title>
  </head>
  <body>
  <%
  	 Student student = (Student)request.getAttribute("student");
  %>
  	<%-- <form action="${requestScope.ContextPath }/updateStudent.do"> --%>
  	<form action="${pageContext.request.contextPath}/student/update.action" method=post>
  		<input type="hidden" name="id" value="${student.getId()}"/>
  		姓名:<input type="text" name="name" value="${student.getName()}"><br>
  		年龄:<input type="text" name="age" value="${student.getAge()}"><br>
  		性别:<input type="text" name="gender" value="${student.getGender()}"><br>
  		<button type="submit">确定修改</button>
  	</form>
  </body>
</html>
