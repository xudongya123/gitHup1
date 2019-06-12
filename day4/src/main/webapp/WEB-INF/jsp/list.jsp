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
	
</script>
</head>
<body>
		<table>
			<tr>
				<td>编号</td>
				<td>名称</td>
				<td>班级</td>
				<td>操作
					<a href="toadd.do">添加</a>
				</td>
			</tr>
			<c:forEach items="${list}" var="stu">
				<tr>
					<td>${stu.sid}</td>
					<td>${stu.sname}</td>
					<td>${stu.cla.cname}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>