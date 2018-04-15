package cn.helloan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Fund{
	
	 private int id;
	 private String  name;
	 private String type;
	 private Date releaseDate;
	 private BigDecimal profit;//万份收益
	 private BigDecimal profit7D;
	 private BigDecimal profit14D;
	 private BigDecimal profit28D;
	 private BigDecimal profit35D;
	 private BigDecimal profit1M;
	 private BigDecimal profit3M;
	 private BigDecimal profit6M;
	 private BigDecimal profit1Y;
	 private BigDecimal profitY;
	 private int int1;
	 private int int2;
	 private BigDecimal charge;//手续费
	 private BigDecimal miniBuy;//手续费
	 
	public Fund() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getInt1() {
		return int1;
	}
	public void setInt1(int int1) {
		this.int1 = int1;
	}
	public int getInt2() {
		return int2;
	}
	public void setInt2(int int2) {
		this.int2 = int2;
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
}
