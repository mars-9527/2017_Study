<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>尊享版查询DEMO</title>
<style type="text/css">
<!--
.STYLE1 {
	font-family: "微软雅黑";
	font-size: x-large;
}
-->
</style>
</head>
<body>
<form action="CERQuery.action" method="post">
<table width="40%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="93" colspan="2" align="center"><span class="STYLE1">尊享版查询DEMO</span></td>
  </tr>
  <tr>
    <td width="50%" height="36" align="right">商户订单号：</td>
    <td width="50%"><input name="TransID" type="text" id="TransID" /></td>
  </tr>
  <tr>
    <td colspan="2" align="center"><label>
      <input type="submit" name="Submit" value="提交" />
    </label></td>
  </tr>
</table>
    </form>

</body>
</html>