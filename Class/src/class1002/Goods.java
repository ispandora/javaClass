package class1002;

public class Goods {
	
	String goodsName;
	int price;
	int qnt = 1;
	int totPrice;
	double disCnt;
	
	Goods(String goodsName,int price){
		this.goodsName = goodsName;
		this.price = price;
		
	}
	Goods(String goodsName,int price,int qnt){
		this(goodsName, price);
		this.qnt = qnt;
	}
	Goods(String goodsName,int price, int qnt, double disCnt){
		this(goodsName, price, qnt);
		this.disCnt = disCnt;	
	}
	
	void getTotprice(){
		totPrice = (int) ((price * qnt)*(1.0-disCnt/100));
	}
	void pnt(){
		System.out.println("Product : " + goodsName);
		System.out.println("Price : " + price);
		System.out.println("Qunatity : " + qnt);
		System.out.println("Discount : " + disCnt);
		System.out.println("Total price : " + totPrice);
		System.out.println();
	}
	

}
