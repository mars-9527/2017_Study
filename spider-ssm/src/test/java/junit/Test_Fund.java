package junit;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.helloan.entity.Fund;
import cn.helloan.service.FundService;
import cn.helloan.util.NetworkUtils;
import cn.helloan.util.StringUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:context/spring-root.xml"})//
public class Test_Fund {
	@Resource
	private FundService fundService;

	@Test
	public void testConn() {
		System.out.println(fundService);
	}
	
	@Test
	public void test_spiderFundDatas() {
		boolean end=false;
		int page=1;
		while (!end) {
			String url="https://fundapi.eastmoney.com/fundtradenew.aspx?ft=hb&sc=ljjz&st=desc&pi="+page+"&pn=100&cp=&ct=&cd=&ms=100&fr=&plevel=&fst=&ftype=&fr1=&fl=0&isab=";
			String result = NetworkUtils.sendGet(url);
			String pre="var rankData = ";
			String content = result.substring(pre.length(),result.length()-1);
			JSONObject json = JSONObject.fromObject(content);
			JSONArray jsonArray = (JSONArray) json.get("datas");
			for (Object object : jsonArray) {
				String entityStr=object.toString();
				String[] entityArray = entityStr.split("\\|");
				Fund fund=getFundByArray(entityArray);
				fundService.insert(fund);
			}
			int allPages = Integer.parseInt(json.get("allPages")+"");
			int pageIndex = Integer.parseInt(json.get("pageIndex")+"");
			if(pageIndex==allPages) end=true;
			page++;
			System.out.println("page:"+pageIndex+"已存储");
		}
	}
	

	@Test
	public void test_getFundDatas() {
		List<Fund> list = fundService.findAllList();
		for (Fund fund : list) {
			System.out.println(fund);
		}
	}
	
	private Fund getFundByArray(String[] entityArray) {
		Fund fund;
		try {
			fund=new Fund();
			fund.setFundNo(entityArray[0]);
			fund.setName(entityArray[1]);
			fund.setType(entityArray[2]);
			fund.setReleaseDate(new SimpleDateFormat("yyyy-MM-dd").parse(entityArray[3]));
			fund.setProfit(getBigDecimal(entityArray[4]));
			fund.setProfit7D(getBigDecimal(entityArray[5]));
			fund.setProfit14D(getBigDecimal(entityArray[6]));
			fund.setProfit28D(getBigDecimal(entityArray[7]));
			fund.setProfit35D(getBigDecimal(entityArray[8]));
			fund.setProfit1M(getBigDecimal(entityArray[17]));
			fund.setProfit3M(getBigDecimal(entityArray[18]));
			fund.setProfit6M(getBigDecimal(entityArray[19]));
			fund.setProfit1Y(getBigDecimal(entityArray[20]));
			fund.setProfitY(getBigDecimal(entityArray[21]));
			String chargeStr=entityArray[26];
			chargeStr=chargeStr.substring(0, chargeStr.length()-1);
			fund.setCharge(getBigDecimal(chargeStr));
			String miniBuyStr=entityArray[24];
			miniBuyStr=miniBuyStr.substring(0, miniBuyStr.length()-1);
			fund.setMiniBuy(getBigDecimal(miniBuyStr));
		}catch (ParseException e) {
			fund=null;
			e.printStackTrace();
		}catch (Exception e) {
			fund=null;
			e.printStackTrace();
		}
		return fund;
	}

	BigDecimal getBigDecimal(String str){
		return StringUtils.isNull(str) ? BigDecimal.ZERO : new BigDecimal(str);
	}

}
