<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/resources/css/list.css" rel="stylesheet" type="text/css" />
<!-- <style type="text/css">
	body,table{
	font-size:12px;
	}
	table{
		table-layout:fixed;
		empty-cells:show; 
		border-collapse: collapse;
		margin:0 auto;
	}
	td{
		height:20px;
	}
	h1,h2,h3{
		font-size:12px;
		margin:0;
		padding:0;
	}
	
	.title { background: #FFF; border: 1px solid #9DB3C5; padding: 1px; width:90%;margin:20px auto; }
	.title h1 { line-height: 31px; text-align:center;  background: #2F589C url(th_bg2.gif); background-repeat: repeat-x; background-position: 0 0; color: #FFF; }
	.title th, .title td { border: 1px solid #CAD9EA; padding: 5px; }
		
</style> -->
<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.10.2.min.js"/>"></script>
<script type="text/javascript">
	$(function(){
		$("tr:even").css("background","#e8f3fd");
		/* $("tr:odd").css("background","#f5fafe;"); */
		
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
	<div id="title">
		<h1>CSS与表格的结合示例</h1>
	</div>
	<c:if test="${requestScope.list == null }">
		it's nothing.....
	</c:if>
	<c:if test="${requestScope.list != null }">
		<table id="table" border="1" cellpadding="10" cellspacing="2" style="width: 90%;" >
			<thead>
				<tr>
					<td align="center" colspan="8">员工列表</td>
				</tr>
				<tr align="center">
					<th width="5%">id</th>
					<th width="5%">姓名</th>
					<th width="5%">年龄</th>
					<th width="20%">生日</th>
					<th width="20%">入职时间</th>
					<th width="10%">薪水</th>
					<th width="10%" colspan="2">操作</th>
				</tr>
			</thead>
			<tbody>
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
			</tbody>
		</table>
	</c:if>
	
	<hr>
	增加新的记录:<a href="${pageContext.request.contextPath}/empoyee/">add</a>
	<form id="deleteForm" action="" method="post" >
		<input type="hidden" name="_method" value="DELETE">
	</form>

</body>
</html>