package Class1007;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	int amount;
	GoodsStock (String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	void addStock(int amount){
		stockNum += amount;
	}
	int subtractStock (int amount) throws StockShortageException {
		if(stockNum < amount)
			throw new StockShortageException("Not Enough!!");
		stockNum -= amount;
		return amount;
	}

}
