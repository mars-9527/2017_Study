package com.baofoo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baofoo.util.HttpUtil;
import com.baofoo.util.JXMConvertUtil;
import com.baofoo.util.MapToXMLString;
import com.baofoo.util.SecurityUtil;
import com.baofoo.rsa.*;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import net.sf.json.JSONObject;
/*
 * 认证尊享版SDK-DEMO
 * 本实例依赖包在WEB-IF/lib文件夹内，证书在CER文件夹，配制文件在System_Config/app.properties
 * 实例仅供学习宝付认证支付尊享版-SDK接口使用，仅供参考。商户可根据本实例写自已的代码
 * @author：宝付（大圣）
 * 
 */
public class WebController {
	
	//SDK请求方法
	public String SdkFrom(HttpServletRequest request,HttpServletResponse response) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException{
		String  acc_no = request.getParameter("acc_no");//银行卡号
		String  pay_code = request.getParameter("pay_code");//银行编码
		String  id_holder = request.getParameter("id_holder");//姓名
		String  mobile = request.getParameter("mobile");//手机号
		String  id_card = request.getParameter("id_card");//身份证号	
		if(request.getParameter("txn_amt").isEmpty()){
			return "金额不能为空！";
		}
		BigDecimal  txn_amt_num = new BigDecimal(request.getParameter("txn_amt")).multiply(BigDecimal.valueOf(100));//金额转换成分		
		String  txn_amt = String.valueOf(txn_amt_num.setScale(0));//支付金额
		
		String  pfxpath = BaofooAction.getWebRoot()+"CER\\"+BaofooAction.getConstants().get("pfx.name");//商户私钥
		File pfxfile=new File(pfxpath);
		if(!pfxfile.exists()){
			System.out.println("私钥文件不存在！");
			return "私钥文件不存在！";
		}
		
		String trade_date=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());//交易日期
		String trans_id="TID"+System.currentTimeMillis();//商户订单号
		//=================================================
			String version = "4.0.0.0";//版本号
			String terminal_id = BaofooAction.getConstants().get("terminal.id");	//商户号
			String member_id = BaofooAction.getConstants().get("member.id");	//终端号
			String pfxpwd  = BaofooAction.getConstants().get("pfx.pwd");//商户私钥证书密码			
			String txn_type = "03311";
			String txn_sub_type ="02"; //交易子类
			String biz_type = "0000";

		//======================FORM===========================
			String input_charset = "1";
			String language = "1";
			
			String data_type=BaofooAction.getConstants().get("data.type"); //加密报文的数据类型（xml/json）
		//=====================================================
		String return_url = "http://10.0.60.26:8080/BaoFooCERSdk/returnurl.action";//商户改成自已的地址。返回方法在returnurl内请参考	
		String request_url = "http://tgw.baofoo.com/apipay/sdk";//请求地址
		
		Map<String,String> ArrayData = new HashMap<String,String>();

		 ArrayData.put("txn_sub_type", txn_sub_type);
		 ArrayData.put("biz_type", biz_type);
		 ArrayData.put("terminal_id", terminal_id);
		 ArrayData.put("member_id", member_id);
		 ArrayData.put("pay_code", pay_code);
		 ArrayData.put("acc_no", acc_no);
		 ArrayData.put("id_card_type", "01");
		 ArrayData.put("id_card", id_card);
		 ArrayData.put("id_holder", id_holder);
		 ArrayData.put("mobile", mobile);
		 ArrayData.put("trans_id", trans_id);
		 ArrayData.put("txn_amt", txn_amt);
		 ArrayData.put("trade_date", trade_date);
		 ArrayData.put("commodity_name", "商品名称");
		 ArrayData.put("commodity_amount", "1");//商品数量（默认为1）
		 ArrayData.put("user_name", "用户名称");
		 ArrayData.put("return_url", return_url);
		 ArrayData.put("additional_info", "附加信息");
		 ArrayData.put("req_reserved", "保留");
		 Map<Object,Object> ArrayData1 = new HashMap<Object,Object>();
		 		 
		 String XmlOrJson = "";
		 if(data_type.equals("xml")){
			 ArrayData1.putAll(ArrayData); 			 
			 XmlOrJson = MapToXMLString.converter(ArrayData1,"data_content");
		 }else{
			 JSONObject jsonObjectFromMap = JSONObject.fromObject(ArrayData);
			 XmlOrJson = jsonObjectFromMap.toString();
		 }
		 log("====请求明文:"+XmlOrJson);
		 String base64str = SecurityUtil.Base64Encode(XmlOrJson);
		 String data_content = RsaCodingUtil.encryptByPriPfxFile(base64str,pfxpath,pfxpwd);		 
		 
		 Map<String,String> Post= new HashMap<String,String>();
		 
		 Post.put("version",version);
		 Post.put("input_charset", input_charset);
		 Post.put("language", language);
		 Post.put("terminal_id", terminal_id);
		 Post.put("txn_type", txn_type);
		 Post.put("txn_sub_type", txn_sub_type);
		 Post.put("member_id", member_id);
		 Post.put("data_type", data_type);
		 Post.put("data_content", data_content);
		 
		 log("====请求表单:"+Post.toString());		 
		 String PostString  = HttpUtil.RequestForm(request_url, Post);		
		 log("====同步返回报文："+PostString);
		 if(PostString.isEmpty()){
			 return "返回空报文！";
		 }
		Map<String,Object> ArrayDataString = JXMConvertUtil.JsonConvertHashMap((Object)PostString);//将JSON转化为Map对象。
	
		if(!ArrayDataString.containsKey("retCode")){
    		log("解析参数[retCode]不存在");
    		return "解析参数[retCode]不存在";
    	}else{
        	String resp_code = ArrayDataString.get("retCode").toString();
    		//这里根据ArrayData 对象里的值去写本地服务器端数据
    		//商户自行写入自已的数据。。。。。。。。
    		
    		if(resp_code.equals("0000")){
    			return ArrayDataString.get("tradeNo").toString();//处理完成在页面输出OK（必须）
    		}    		
    	}
    	return "["+PostString+"]"+"出错";
	}

	//回调方法
	
	public String returnurl(HttpServletRequest request,HttpServletResponse response)throws IOException{
		String data_content = request.getParameter("data_content");//回调参数
		if(data_content.isEmpty()){//判断参数是否为空
			log("=====返回数据为空");
			return "返回数据为空";
		}
		log("=====返回数据:"+data_content);
		String  cerpath = BaofooAction.getWebRoot()+"CER\\"+BaofooAction.getConstants().get("cer.name");//宝付公钥
		String data_type=BaofooAction.getConstants().get("data.type"); //加密报文的数据类型（xml/json）
		
		File cerfile=new File(cerpath);
		if(!cerfile.exists()){//判断宝付公钥是否为空
			System.out.println("宝付公钥文件不存在！");
			log("=====公钥文件不存在！======");
			return "公钥文件不存在！";
		}
		
		 data_content = RsaCodingUtil.decryptByPubCerFile(data_content,cerpath);
		 if(data_content.isEmpty()){//判断解密是否正确。如果为空则宝付公钥不正确
				log("=====检查解密公钥是否正确！");
				return "检查解密公钥是否正确！";
		 }
		 data_content = SecurityUtil.Base64Decode(data_content);		 
		 log("=====返回数据解密结果:"+data_content);
		 
		if(data_type.equals("xml")){
			data_content = JXMConvertUtil.XmlConvertJson(data_content);		    
			log("=====返回结果转JSON:"+data_content);
		}
		
		Map<String,Object> ArrayData = JXMConvertUtil.JsonConvertHashMap(data_content);//将JSON转化为Map对象。
		if(!ArrayData.containsKey("resp_code")){
    		log("解析参数[resp_code]不存在");
    		return "NO";
    	}else{
        	String resp_code = ArrayData.get("resp_code").toString();
    		//这里根据ArrayData 对象里的值去写本地服务器端数据
    		//商户自行写入自已的数据。。。。。。。。
    		
    		if(resp_code.equals("0000")){
    			return "OK";//处理完成在页面输出OK（必须）
    		}    		
    	}
    	return "NO";
		
	}
	
	
	/**
	 * @查询接口
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	
	
	
	public String CERQuery(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String  TransID = request.getParameter("TransID");//商户订单号
		
		String  pfxpath = BaofooAction.getWebRoot()+"CER\\"+BaofooAction.getConstants().get("pfx.name");//商户私钥
		File pfxfile=new File(pfxpath);
		if(!pfxfile.exists()){
			System.out.println("私钥文件不存在！");
			return "私钥文件不存在！";
		}
		
		String  cerpath = BaofooAction.getWebRoot()+"CER\\"+BaofooAction.getConstants().get("cer.name");//宝付公钥
		File cerfile=new File(cerpath);
		if(!cerfile.exists()){//判断宝付公钥是否为空
			System.out.println("宝付公钥文件不存在！");
			log("=====公钥文件不存在！======");
			return "公钥文件不存在！";
		}

		String trans_id="TSN"+System.currentTimeMillis();//商户订单号
		//=================================================
			String version = "4.0.0.1";//版本号
			String terminal_id = BaofooAction.getConstants().get("terminal.id");	//商户号
			String member_id = BaofooAction.getConstants().get("member.id");	//终端号
			String pfxpwd  = BaofooAction.getConstants().get("pfx.pwd");//商户私钥证书密码
		//======================FORM===========================
			String input_charset = "1";
			String language = "1";
			String data_type=BaofooAction.getConstants().get("data.type"); //加密报文的数据类型（xml/json）
		//=====================================================
			String request_url = "http://tgw.baofoo.com/apipay/queryQuickOrder";//请求地址
		
		Map<String,String> ArrayData = new HashMap<String,String>();
		 ArrayData.put("orig_trans_id", TransID);
		 ArrayData.put("trans_serial_no", trans_id);
		 ArrayData.put("terminal_id", terminal_id);
		 ArrayData.put("member_id", member_id);
		 ArrayData.put("additional_info", "附加信息");
		 ArrayData.put("req_reserved", "保留");
		 
		 Map<Object,Object> ArrayData1 = new HashMap<Object,Object>();
		 		 
		 String XmlOrJson = "";
		 if(data_type.equals("xml")){
			 ArrayData1.putAll(ArrayData); 			 
			 XmlOrJson = MapToXMLString.converter(ArrayData1,"data_content");
		 }else{
			 JSONObject jsonObjectFromMap = JSONObject.fromObject(ArrayData);
			 XmlOrJson = jsonObjectFromMap.toString();
		 }
		 log("====请求明文:"+XmlOrJson);
		 String base64str = SecurityUtil.Base64Encode(XmlOrJson);
		 String data_content = RsaCodingUtil.encryptByPriPfxFile(base64str,pfxpath,pfxpwd);		 
		 
		 Map<String,String> Post= new HashMap<String,String>();
		 
		 Post.put("version",version);
		 Post.put("input_charset", input_charset);
		 Post.put("language", language);
		 Post.put("terminal_id", terminal_id);
		 Post.put("member_id", member_id);
		 Post.put("data_type", data_type);
		 Post.put("data_content", data_content);
		 
		 log("====请求表单:"+Post.toString());		 
		 String PostString  = HttpUtil.RequestForm(request_url, Post);

		 log("====同步返回报文："+PostString);		 
		 
		 PostString = RsaCodingUtil.decryptByPubCerFile(PostString,cerpath);
		 
		 if(PostString.isEmpty()){
			 return "返回空报文！";
		 }		 
		 PostString = SecurityUtil.Base64Decode(PostString);
		 log("=====返回查询数据解密结果:"+PostString);
		
		if(data_type.equals("xml")){
					PostString = JXMConvertUtil.XmlConvertJson(PostString);		    
					log("=====返回结果转JSON:"+PostString);
		}
			
		Map<String,Object> ArrayDataString = JXMConvertUtil.JsonConvertHashMap(PostString);//将JSON转化为Map对象。
		log("转换为MAP对象："+ArrayDataString);
		String retCode = ArrayDataString.get("resp_code").toString();
		
		//根据返回参数 商户记录自已的订单
		
		if(retCode.equals("0000")){
			return "返回状态："+ArrayDataString.get("resp_code").toString()+" , 返回消息："+ArrayDataString.get("resp_msg").toString()+" ,商户订单号："+ArrayDataString.get("orig_trans_id").toString()+",成功金额："+ArrayDataString.get("succ_amt").toString();
		}		 
		return ArrayDataString.get("resp_msg").toString();
	}
	
	
	
	
	private void log(String msg) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\t: " + msg);
	}

}
