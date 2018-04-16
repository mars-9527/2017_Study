package cn.helloan.entity;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fund{
	
	 private int id;
	 private String fundNo;
	 private String  fundName;
	 private String type;//
	 private Date releaseDate;
	 private BigDecimal profit;//万份收益
	 private BigDecimal profit7D;//7日年化
	 private BigDecimal profit14D;
	 private BigDecimal profit28D;
	 private BigDecimal profit35D;
	 private BigDecimal profit1M;//近1月年化
	 private BigDecimal profit3M;
	 private BigDecimal profit6M;
	 private BigDecimal profit1Y;
	 private BigDecimal profitY;
	 private BigDecimal charge;//手续费
	 private BigDecimal miniBuy;//起购金额
	 
	public Fund() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFundNo() {
		return fundNo;
	}
	public void setFundNo(String fundNo) {
		this.fundNo = fundNo;
	}
	public String getName() {
		return fundName;
	}
	public void setName(String name) {
		this.fundName = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public BigDecimal getProfit() {
		return profit;
	}
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
	public BigDecimal getProfit7D() {
		return profit7D;
	}
	public void setProfit7D(BigDecimal profit7d) {
		profit7D = profit7d;
	}
	public BigDecimal getProfit14D() {
		return profit14D;
	}
	public void setProfit14D(BigDecimal profit14d) {
		profit14D = profit14d;
	}
	public BigDecimal getProfit28D() {
		return profit28D;
	}
	public void setProfit28D(BigDecimal profit28d) {
		profit28D = profit28d;
	}
	public BigDecimal getProfit35D() {
		return profit35D;
	}
	public void setProfit35D(BigDecimal profit35d) {
		profit35D = profit35d;
	}
	public BigDecimal getProfit1M() {
		return profit1M;
	}
	public void setProfit1M(BigDecimal profit1m) {
		profit1M = profit1m;
	}
	public BigDecimal getProfit3M() {
		return profit3M;
	}
	public void setProfit3M(BigDecimal profit3m) {
		profit3M = profit3m;
	}
	public BigDecimal getProfit6M() {
		return profit6M;
	}
	public void setProfit6M(BigDecimal profit6m) {
		profit6M = profit6m;
	}
	public BigDecimal getProfit1Y() {
		return profit1Y;
	}
	public void setProfit1Y(BigDecimal profit1y) {
		profit1Y = profit1y;
	}
	public BigDecimal getProfitY() {
		return profitY;
	}
	public void setProfitY(BigDecimal profitY) {
		this.profitY = profitY;
	}
	public BigDecimal getCharge() {
		return charge;
	}
	public void setCharge(BigDecimal charge) {
		this.charge = charge;
	}
	public BigDecimal getMiniBuy() {
		return miniBuy;
	}
	public void setMiniBuy(BigDecimal miniBuy) {
		this.miniBuy = miniBuy;
	}
	@Override
	public String toString() {
		return "Fund [id=" + id + ", fundNo=" + fundNo + ", fundName=" + fundName + ", type=" + type + ", releaseDate="
				+ new SimpleDateFormat("yyyy-MM-dd").format(releaseDate) + ", profit=" + profit + ", profit7D=" + profit7D + ", profit14D=" + profit14D
				+ ", profit28D=" + profit28D + ", profit35D=" + profit35D + ", profit1M=" + profit1M + ", profit3M="
				+ profit3M + ", profit6M=" + profit6M + ", profit1Y=" + profit1Y + ", profitY=" + profitY + ", charge="
				+ charge + ", miniBuy=" + miniBuy + "]";
	}
	
	
}
