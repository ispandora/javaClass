package class1001;

class GoodsStock {
	String goodsCode;
	int stockNum;

	GoodsStock(String code, int num){
		goodsCode = code;
		stockNum = num;
		if (num < 0){
			System.out.println("Error!" + goodsCode);
			stockNum = 0;
		} 
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}
	int subtracStock (int amount) {
		if (stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}
	
}
