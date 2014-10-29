package class1029;

import java.util.Scanner;

public class GoodsMgr {

	 static Scanner in = new Scanner(System.in);
	     public static void input(Goods goods){
	          
	          String code, name; 
	          int price, qnt;
	          System.out.println("상품코드:");
	          code = in.next();
	          goods.setCode(code);
	          System.out.println("상품명:");
	          name = in.next();
	          goods.setName(name);
	          System.out.println("단가:");
	          price = in.nextInt();
	          goods.setPrice(price);
	          System.out.println("재고:");
	          qnt = in.nextInt();
	          goods.setQnt(qnt);
	          
	     }
	     
	     public static void prn(Goods goods){
	          System.out.println("상품코드:"+goods.getCode());
	          System.out.println("상품명:"+goods.getName());
	          System.out.println("단가 :"+goods.getPrice());
	          System.out.println("재고 :"+goods.getQnt());
	     }
	     
	     public static void order(Goods goods){
	          System.out.println("판매수량");
	          int qnt = in.nextInt();
	          int qnt2 = goods.getQnt();
	          goods.setQnt(qnt2 - qnt);
	     }

	     public static void main(String[] args) {
	          Goods goods = new Goods();
	          input(goods);
	          order(goods);
	          prn(goods);
	     }

}
