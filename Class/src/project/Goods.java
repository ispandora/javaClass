package project;

public class Goods {
	String goodsCode;
	String goodsName;				
	String goodsColor;
	String goodsDescription;
	String goodsMaker;
	int    goodsUnitPrice;
	int    goodsStock;
	Goods(String goodsCode, String goodsName){
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
	}
	Goods(String goodsCode, String goodsName, String goodsColor, String goodsDescription, String goodsMaker, int goodsUnitPrice, int goodsStock){
		this(goodsCode, goodsName);
		this.goodsColor = goodsColor;
		this.goodsDescription = goodsDescription;
		this.goodsMaker = goodsMaker;
		this.goodsUnitPrice = goodsUnitPrice;
		this.goodsStock = goodsStock;
	}

}
