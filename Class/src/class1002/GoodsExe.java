package class1002;

public class GoodsExe {

	public static void main(String[] args) {
		Goods obj1, obj2, obj3;
		
		obj1 = new Goods("iPhone",3000);
		obj2 = new Goods("Galuxy",4000,3);
		obj3 = new Goods("LG G2",2500,2,20);
		
	obj1.getTotprice();
	obj2.getTotprice();
	obj3.getTotprice();
	
	obj1.pnt();
	obj2.pnt();
	obj3.pnt();

	}

}
