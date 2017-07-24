<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>add_student.html</title>
	
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css" />
    <script src="${pageContext.request.contextPath}/lib/jquery/jquery-1.11.1.js" type="text/javascript" charset="utf-8"></script>
	<script src="${pageContext.request.contextPath}/lib/bootstrap/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
	<script src="${pageContext.request.contextPath}/lib/datepicker/WdatePicker.js" type="text/javascript" charset="utf-8"></script>
  <script type="text/javascript">
  	$function(){
  		$("#name").blur(function(){
  			var name = $(this).val();
  			$.post{
  				"${pageContext.request.contextPath}/student?method=checkName",
  				{"name":name},
  				function(data){
  				if(data.isExit){
  					$("#nameInfo").html("×该用户名已存在");
  					$("#nameInfo").css("color","red");
  				}else{
  					$("#nameInfo").html("√该用户名可以使用");
  					$("#nameInfo").css("color","green");
  				}
  				}
  			}"json"
  		})
  	}
  </script>
  
  </head>
  
  <body>
     <div class="container" style="width:40%">
     	<h2>添加学生信息</h2>
	  	<form action="${pageContext.request.contextPath}/student/add.action" method="post" >
		  <div class="form-group">
		    <label for="name">姓名</label>
		    <input type="text" class="form-control" id="name" name="name" placeholder="Name">
		  </div>
		  <div>
		  <label for="name">密码</label>
		    <input type="text" class="form-control" id="password" name="password" placeholder="Password">
		  </div>
		  <div class="form-group">
		    <label for="age">年龄</label>
		    <input type="text" class="form-control" id="age" name="age" placeholder="Age">
		  </div>
		   <div class="form-group">
		    <label for="gender">性别</label>
		    <input type="text" class="form-control" id="gender" name="gender" placeholder="Gender">
		  </div>
		  <div>
		  	<label for="birthday">出生日期</label>
		  	<input type="text" class="form-control" id="birthday" name="birthday" value="${student.birthday }" readonly="readonly"
		  	onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd'})">
		  </div>
		  <button type="submit" class="btn btn-primary">添加学生</button>
		</form>
     </div>
  </body>
</html>
