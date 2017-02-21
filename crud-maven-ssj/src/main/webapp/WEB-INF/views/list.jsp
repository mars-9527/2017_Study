<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.min.js"></script>
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
<h3 align="center">博客记录查询</h3>	
	<c:if test="${requestScope.list == null }">
		it's nothing.....
	</c:if>
	<c:if test="${requestScope.list != null }">
		<table border="1" cellpadding="10" cellspacing="2" >
			<tr align="center">
				<th>id</th>
				<th>标题</th>
				<th>url</th>
				<th>描述</th>
				<th>关键字</th>
				<th>创建人</th>
				<th>创建时间</th>
				<th>修改人</th>
				<th>最后修改时间</th>
				<th colspan="2">操作</th>
			</tr>
			<c:forEach items="${requestScope.list }" var="blog">
				<tr>
					<td>${blog.id }</td>
					<td>${blog.title }</td>
					<td>${blog.url }</td>
					<td>${blog.describ}</td>
					<td>${blog.keyWords }</td>
					<td>${blog.createdUser.name }</td>
					<td>${blog.createdTime }</td>
					<td>${blog.modifiedUser.name }</td>
					<td>${blog.modifiedTime }</td>
					<td><a href="${pageContext.request.contextPath}/blog/${blog.id}">编辑</a></td>
					<td><a class="deleteCss" href="${pageContext.request.contextPath}/blog/${blog.id }">删除</a></td>					
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<hr>
	增加新的记录:<a href="${pageContext.request.contextPath}/blog/">add</a>
	<form id="deleteForm" action="" method="post" >
		<input type="hidden" name="_method" value="DELETE">
	</form>

</body>
</html>