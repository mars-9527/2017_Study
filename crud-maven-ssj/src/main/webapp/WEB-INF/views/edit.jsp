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

<h3>编辑记录</h3>
	 
    <form:form action="${pageContext.request.contextPath}/blog/update" method="post"  modelAttribute="blog">
    	<input type="hidden"  name="_method" value="PUT">
		<form:hidden path="id"/>
		标题&nbsp;&nbsp;:<form:input path="title"/><br>
		网址&nbsp;&nbsp;:<form:input path="url"/><br>
		描述&nbsp;&nbsp;:<form:input path="describ"/><br>
		关键字:&nbsp;<form:input path="keyWords"/><br>
		创建人&nbsp;:<form:select path="createdUser.id" items="${requestScope.users }" 
		itemValue="id"  itemLabel="name"></form:select><br>
		创建日期：<form:input path="createdTime"/><br>
		修改人&nbsp;:<form:select path="modifiedUser.id" items="${requestScope.users }" 
		itemValue="id"  itemLabel="name"></form:select><br>
		&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="submit">
	</form:form>


	
	

</body>
</html>