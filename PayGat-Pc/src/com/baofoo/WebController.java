package com.baofoo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

import com.baofoo.util.SecurityUtil;
/**
 * PC支付网关接口
 * 本实例依赖包在WEB-IF/lib文件夹内，配置文件在System_Config/app.properties
 * 实例仅供学习宝付PC支付网关接口使用，仅供参考。商户可根据本实例写自已的代码
 * @author：宝付（大圣）
 * 
 */
public class WebController {
	
	//请求方法
	public String PcPayGat(HttpServletRequest request,HttpServletResponse response) throws IOException{		
		String PayID = request.getParameter("PayID");//支付渠道
		String OrderMoney = request.getParameter("OrderMoney");//订单金额
		
		log("支付金额："+OrderMoney);
		
		if (!OrderMoney.isEmpty()) 
		{	BigDecimal a;
			a = new BigDecimal(OrderMoney).multiply(BigDecimal.valueOf(100)); //使用分进行提交
			OrderMoney=String.valueOf(a.setScale(0));
		}else{
			OrderMoney = ("0");
		}
		
		log("支付金额（转换成分为单位）："+OrderMoney);
		
		
		if(PayID.isEmpty()){//PayID传空跳转宝付收银台，传功能ID跳转对应的银行		
			PayID="";
			log("链接类型：跳转宝付收银台");
		}else{
			log("链接类型：直链银行");
		}
		
		String TransID = "PAGATID"+System.currentTimeMillis();//商户订单号（不能重复）
		String TradeDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());//下单日期		
		String MemberID = BaofooAction.getConstants().get("member.id");//商户号
		String TerminalID = BaofooAction.getConstants().get("terminal.id");//终端号
		String ProductName = "商品名称";//商品名称
		String Amount = "1";//商品数量
		String Username = "用户名称";//支付用户名称
		String AdditionalInfo = "附加信息";//订单附加信息
		String PageUrl = BaofooAction.getConstants().get("page.url");//页面跳转地址
		String ReturnUrl = BaofooAction.getConstants().get("return.url");//服务器底层通知地址
		String NoticeType = BaofooAction.getConstants().get("notice.type");//通知类型	
		String Md5key = BaofooAction.getConstants().get("md5.key");//md5密钥（KEY）
		String MARK = "|";
		
		String md5 =new String(MemberID+MARK+PayID+MARK+TradeDate+MARK+TransID+MARK+OrderMoney+MARK+PageUrl+MARK+ReturnUrl+MARK+NoticeType+MARK+Md5key);//MD5签名格式
		log("请求（MD5）拼接字串："+ md5);//商户在正式环境不要输出此项以免泄漏密钥，只在测试时输出以检查验签失败问题
		
		String Signature = SecurityUtil.MD5(md5);//计算MD5值
		String payUrl="https://vgw.baofoo.com/payindex";//请求地址		
		String InterfaceVersion = "4.0";
		String KeyType = "1";//加密类型(固定值为1)
		
		
		String FormString = "<body onload=\"pay.submit()\">"+
				"正在提交请稍后。。。。。。。。"+
				"<form method=\"post\" name=\"pay\" id=\"pay\" action=\""+payUrl+"\">"+
				"<input name=\"MemberID\" type=\"hidden\" value=\""+MemberID+"\"/>"+
				"<input name=\"TerminalID\" type=\"hidden\" value=\""+TerminalID+"\"/>"+
				"<input name=\"InterfaceVersion\" type=\"hidden\" value= \""+InterfaceVersion+"\"/>"+
				"<input name=\"KeyType\" type=\"hidden\" value= \""+KeyType+"\"/>"+
				"<input name=\"PayID\" type=\"hidden\" value= \""+PayID+"\"/>"+	
				"<input name=\"TradeDate\" type=\"hidden\" value= \""+TradeDate+"\" />"+
				"<input name=\"TransID\" type=\"hidden\" value= \""+TransID+"\" />"+
				"<input name=\"OrderMoney\" type=\"hidden\" value= \""+OrderMoney+"\"/>"+
				"<input name=\"ProductName\" type=\"hidden\" value= \""+ProductName+"\"/>"+
				"<input name=\"Amount\" type=\"hidden\" value= \""+Amount+"\"/>"+
				"<input name=\"Username\" type=\"hidden\" value= \""+Username+"\"/>"+
				"<input name=\"AdditionalInfo\" type=\"hidden\" value= \""+AdditionalInfo+"\"/>"+
				"<input name=\"PageUrl\" type=\"hidden\" value= \""+PageUrl+"\"/>"+
				"<input name=\"ReturnUrl\" type=\"hidden\" value= \""+ReturnUrl+"\"/>"+
				"<input name=\"Signature\" type=\"hidden\" value=\""+Signature+"\"/>"+
				"<input name=\"NoticeType\" type=\"hidden\" value= \""+NoticeType+"\"/>"+
				"</form></body>";
		log("提交表单："+FormString);		

		return FormString;
	}
	
	
	
	public String ReturnUrl(HttpServletRequest request,HttpServletResponse response) throws IOException{	
		
		log("接收回调参数："+request.getParameterMap().toString());//Map对象为Map<String,Object>可以遍历打印出来，这里就省略了		
		
		String MemberID = BaofooAction.getConstants().get("member.id");//商户号
		String TerminalID = BaofooAction.getConstants().get("terminal.id");//商户终端号		
		
		String TransID = request.getParameter("TransID");//商户流水号
		String Result = request.getParameter("Result");//支付结果
		String ResultDesc = request.getParameter("ResultDesc");//支付结果描述
		String FactMoney = request.getParameter("FactMoney");//实际成功金额
		String AdditionalInfo = request.getParameter("AdditionalInfo");//订单附加消息	
		String SuccTime = request.getParameter("SuccTime");//支付完成时间
		String Md5Sign = request.getParameter("Md5Sign");//MD5签名宝付返回的
		String Md5key = BaofooAction.getConstants().get("md5.key");
		String MARK = "~|~";
		
		log("接收返回MD5值："+Md5Sign);
		String md5 = "MemberID=" + MemberID + MARK + "TerminalID=" + TerminalID + MARK + "TransID=" + TransID + MARK + "Result=" + Result + MARK + "ResultDesc=" + ResultDesc + MARK
				+ "FactMoney=" + FactMoney + MARK + "AdditionalInfo=" + AdditionalInfo + MARK + "SuccTime=" + SuccTime
				+ MARK + "Md5Sign=" + Md5key;
		log("本地MD5验签字串:" + md5);
		String WaitSign =SecurityUtil.MD5(md5);		
		log("本地MD5验签值:"+WaitSign);
		
		
		if(WaitSign.equals(Md5Sign)){//将本地的MD5值和接收的MD5值比较
			//校验通过开始处理订单		
			log("处理成功返回OK");
			return "OK";//全部正确了输出OK			
		}else{
			log("本地MD5验签失败！");
			return "Md5CheckFail";//MD5验签失败			

		}
	}

	private void log(String msg) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\t: " + msg);
	}

}
