<%@ page language="java"  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test/dologin.do" method="post">
<table>
	<tr>
		<td><label>用户名</label></td>
		<td><input type="text" name="username"
			style="width: 120;" /></td>
	</tr>
	<tr>
		<td><label>密&nbsp;码</label></td>
		<td><input type="password" name="password"
			style="width: 120;" /></td>
	</tr>
	<tr>
		<td><input type="submit" name="login" value="登录" /></td>
	</tr>
</table>
</form>
<a href="${pageContext.request.contextPath }/test/hello">HelloWorld</a>
</body>
</html>