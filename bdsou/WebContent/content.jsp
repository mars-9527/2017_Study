<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${requestScope.key } - 网盘快搜</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<form action="doSearch" method="post"">
					<input align="middle" name="key" class="q" id="kw" value="${requestScope.key }"
						autocomplete="off" baiduSug="1" x-webkit-speech />
						<input id="btn" class="btn" align="middle" value="网盘快搜" type="submit" />
				</form>
			</td>
		</tr>
		<tr>
			<td>
					<div id="contentinfo">
					<small>关于 <h1>${requestScope.key }</h1> 的网盘资源:</small>
					</div>
			</td>
		</tr>
	</table>
	<div id="main">
		<c:if test="${requestScope.list.size()>0 }">
		<c:forEach items="${requestScope.list }" var="record">
			<div>			
				<h2><a	href="${record.url}" target="_blank" rel="nofollow">${record.title}</a></h2>
				<div class="des">
					${record.content}
				</div>
			</div>
		</c:forEach>
			
		</c:if>
		<c:if test="${requestScope.list.size()<=0}">
				<br><br><br>
				<h2 style="font-size: xx-large;">少年，换一个关键字试试吧(´･ω･`)</h2>
		</c:if>
	</div>

</body>
</html>