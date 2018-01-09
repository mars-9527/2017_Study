<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增记录</title>
</head>
<body>

<h3>新增记录</h3>
	 
    <form:form action="${pageContext.request.contextPath}/empoyee/save" method="post"  modelAttribute="employee">
		姓名&nbsp;&nbsp;:<form:input path="name"/><br>
		年龄&nbsp;&nbsp;:<form:input path="age"/><br>
		生日&nbsp;&nbsp;:<form:input path="birth"/><br>
		入职时间:<form:input path="registerTime"/><br>
		薪水&nbsp;&nbsp;:<form:input path="salary"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="submit">
	</form:form>


	
	

</body>
</html>