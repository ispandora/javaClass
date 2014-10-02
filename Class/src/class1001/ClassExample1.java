package class1001;

public class ClassExample1 {

	public static void main(String[] args) {
		GoodsStock obj;
		obj = new GoodsStock("A-100", -50);
	
		System.out.println("Product Code: " + obj.goodsCode);
		System.out.println("Qunatity: " + obj.stockNum);
		

	}

}
