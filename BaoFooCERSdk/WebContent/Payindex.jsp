<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>认证支付尊享版-SDK_DEMO</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 24px;
	font-weight: bold;
}
-->
</style>
</head>
<body style="margin:0">
<div style="margin:0 auto; width:500px;">
	<form method="post" action="SdkFrom.action">
		<br>
		 
		<table width="500" height="357" border="0" cellpadding="1" cellspacing="1" bgcolor="#33CCFF">
		  <tr>
		    <td height="84" colspan="2" align="center" bgcolor="#FFFFFF"><span class="STYLE1">认证支付尊享版-SDK-DEMO</span></td>
		  </tr>
		
		  <tr>
		    <td width="108" align="right" bgcolor="#FFFFFF">银行名称：</td>
		    <td width="392" bgcolor="#FFFFFF">
		    <select name="pay_code" id="pay_code">
				<option value="ICBC" selected="selected">中国工商银行</option>
				<option value="ABC">中国农业银行</option>
				<option value="CCB">中国建设银行</option>
				<option value="BOC">中国银行</option>
				<option value="BCOM">中国交通银行</option>
				<option value="CIB">兴业银行</option>
				<option value="CITIC">中信银行</option>
				<option value="CEB">中国光大银行</option>
				<option value="PAB">平安银行</option>
				<option value="PSBC">中国邮政储蓄银行</option>
				<option value="SHB">上海银行</option>
				<option value="SPDB">浦东发展银行</option>
		    </select>
			</td>
		  </tr>
		  <tr>
		    <td align="right" bgcolor="#FFFFFF">银行卡号：</td>
		    <td bgcolor="#FFFFFF"><input name="acc_no" type="text" id="acc_no" size="20" maxlength="20" /></td>
		  </tr>
		  <tr>
		    <td align="right" bgcolor="#FFFFFF">身份证号：</td>
		    <td bgcolor="#FFFFFF"><input name="id_card" type="text" id="id_card" size="18" maxlength="18" /></td>
		  </tr>
		    <tr>
		    <td align="right" bgcolor="#FFFFFF">姓名：</td>
		    <td bgcolor="#FFFFFF"><input name="id_holder" type="text" id="id_holder" size="10" maxlength="10" /></td>
		  </tr>
		    <tr>
		    <td align="right" bgcolor="#FFFFFF">手机号：</td>
		    <td bgcolor="#FFFFFF"><input name="mobile" type="text" id="mobile" size="11" maxlength="11" /></td>
		  </tr>
		  <tr>
		    <td align="right" bgcolor="#FFFFFF">交易金额：</td>
		    <td bgcolor="#FFFFFF"><input name="txn_amt" type="text" id="txn_amt" value="0.01" size="5" maxlength="5" />
		    （元）</td>
		  </tr>
		  <tr>
		    <td colspan="2" align="center" bgcolor="#FFFFFF"><input type="submit" name="Submit" value="提交" /></td>
		    </tr>
		
		</table>

	</form>
</div>
</body>
</html>