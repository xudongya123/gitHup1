<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link  rel="stylesheet"    href="<%=request.getContextPath() %>/css/index3.css"  type="text/css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
	 $(function(){
		 
		 $.post(
				'clalist.do',
				function(obj){
					for ( var i in obj) {
						$("[name='cla.cid']").append("<option value='"+obj[i].cid+"'>"+obj[i].cname+"</option>");
					}
				}
		 ),"json"
		 
	 })
</script>
</head>
<body>
		<form action="add.do" method="post">
			学生名称<input type="text" name="sname"/><br>
			学生班级<select name="cla.cid">
				<option>请选择</option>
			</select><br>
			<input type="submit" value="添加"/>
		</form>
</body>
</html>