<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var result=$.extend({},{name:"Tom",age:21},{name:"Jerry",sex:"Boy"})
		
	});
</script>
</head>
<body>
	<h3><a href="${pageContext.request.contextPath}/blog/query">查询blog</a></h3>
	<!-- 直接重定向到列表页面 -->
	<jsp:forward page="/blog/query" ></jsp:forward>
</body>
</html>