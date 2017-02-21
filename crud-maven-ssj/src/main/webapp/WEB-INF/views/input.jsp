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
	 
    <form:form action="${pageContext.request.contextPath}/blog/save" method="post"  modelAttribute="blog">
		标题&nbsp;&nbsp;&nbsp;&nbsp;:<form:input path="title"/><br>
		网址&nbsp;&nbsp;&nbsp;&nbsp;:<form:input path="url"/><br>
		描述&nbsp;&nbsp;&nbsp;&nbsp;:<form:input path="describ"/><br>
		关键字&nbsp;&nbsp;&nbsp;:<form:input path="keyWords"/><br>
		创建人&nbsp;&nbsp;&nbsp;:<form:select path="createdUser.id" items="${requestScope.users }" 
		itemValue="id"  itemLabel="name"></form:select><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="submit">
	</form:form>


	
	

</body>
</html>