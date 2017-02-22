<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.10.2.min.js"/>"></script>
<script type="text/javascript">
	$(function(){
		$(".deleteCss").click(function(){
			
			var title=$(this).parents("tr").children("td:eq(1)").text();
			title=$.trim(title);
			var flag=confirm("你确认要删除【"+title+"】么？");	
									
			if(flag){
				var action = $(this).attr("href");
				$("#deleteForm").attr("action",action).submit();			
			}	
			
				return false;
		});	
	}); 
	
</script>

</head>
<body>

	<c:if test="${requestScope.list == null }">
		it's nothing.....
	</c:if>
	<c:if test="${requestScope.list != null }">
		<table border="1" cellpadding="10" cellspacing="2" >
			<tr>
			<th colspan="8">员工列表</th>
			</tr>
			<tr align="center">
				<th>id</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>生日</th>
				<th>入职时间</th>
				<th>薪水</th>
				<th colspan="2">操作</th>
			</tr>
			<c:forEach items="${requestScope.list }" var="emp">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.name }</td>
					<td>${emp.age }</td>
					<td><fmt:formatDate value="${emp.birth}" pattern="yyyy-MM-dd HH:mm:ss" /> </td>
					<td><fmt:formatDate value="${emp.registerTime }" pattern="yyyy-MM-dd HH:mm:ss" /> </td>
					<td>${emp.salary }</td>
					<td><a href="${pageContext.request.contextPath}/empoyee/${emp.id }">编辑</a></td>
					<td><a class="deleteCss" href="${pageContext.request.contextPath}/empoyee/${emp.id }">删除</a></td>					
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<hr>
	增加新的记录:<a href="${pageContext.request.contextPath}/empoyee/">add</a>
	<form id="deleteForm" action="" method="post" >
		<input type="hidden" name="_method" value="DELETE">
	</form>

</body>
</html>