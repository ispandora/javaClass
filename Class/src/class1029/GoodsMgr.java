package class1029;

import java.util.Scanner;

public class GoodsMgr {

	 static Scanner in = new Scanner(System.in);
	     public static void input(Goods goods){
	          
	          String code, name; 
	          int price, qnt;
	          System.out.println("��ǰ�ڵ�:");
	          code = in.next();
	          goods.setCode(code);
	          System.out.println("��ǰ��:");
	          name = in.next();
	          goods.setName(name);
	          System.out.println("�ܰ�:");
	          price = in.nextInt();
	          goods.setPrice(price);
	          System.out.println("���:");
	          qnt = in.nextInt();
	          goods.setQnt(qnt);
	          
	     }
	     
	     public static void prn(Goods goods){
	          System.out.println("��ǰ�ڵ�:"+goods.getCode());
	          System.out.println("��ǰ��:"+goods.getName());
	          System.out.println("�ܰ� :"+goods.getPrice());
	          System.out.println("��� :"+goods.getQnt());
	     }
	     
	     public static void order(Goods goods){
	          System.out.println("�Ǹż���");
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
