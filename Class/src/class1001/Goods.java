package class1001;

public class Goods {
	String goodsName;
	int price;
	int qnt;
	int totPrice;
	
	Goods(String a, int b, int c){
		goodsName = a;
		price= b;
		qnt = c;		
	}
	
	void proc(){
		totPrice = price * qnt;
	}
	
	void prn(){
		System.out.println("Product : " + goodsName);
		System.out.println("Price : "+ price + " won");
		System.out.println("Qualtity : "+ qnt + " ea");
		System.out.println("Total Price : " + totPrice + " won");	
	}

}
