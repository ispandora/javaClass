package class1029;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GoodsMgr2 {
	ArrayList<Goods> goodsList = new ArrayList<Goods>();
	Scanner in = new Scanner(System.in);
	void input(){
		Goods goods = new Goods();
		System.out.println("Product Code : ");
		String code = in.next();
		goods.setCode(code);
		System.out.println("Product Name : ");
		String name = in.next();
		goods.setName(name);
		System.out.println("Price : ");
		int price = in.nextInt();
		goods.setPrice(price);
		System.out.println("Quantity : ");
		int qnt = in.nextInt();
		goods.setQnt(qnt);
		
		goodsList.add(goods);
	}
	
	void prnAll(){
		Iterator<Goods> it = goodsList.iterator();
		while(it.hasNext()){
			Goods goods = it.next();
			System.out.println("-------------------------------------");
			System.out.println("Product Code\t: "+goods.getCode());
			System.out.println("Product Name\t: "+goods.getName());
			System.out.println("Product price\t: "+goods.getPrice());
			System.out.println("Product Quantity: "+goods.getQnt());
		}
			
	}
	
	void prn(String code){
		Iterator<Goods> it = goodsList.iterator();
		while(it.hasNext()){
			Goods goods = it.next();
			System.out.println("====================================");
			if (code.equals(goods.getCode())){
				System.out.println("Product Name\t: "+goods.getName());
				System.out.println("Product Quantity: "+goods.getQnt());
			}else{
				System.out.println("error!");
			}
			
		}
		
	}
	void order(String code, int orderQnt){
		Iterator<Goods> it = goodsList.iterator();
		while(it.hasNext()){
			Goods goods = it.next();
			if(code.equals(goods.getCode())){
				int qnt = goods.getQnt();
				int qnt2 = qnt - orderQnt;
				goods.setQnt(qnt2);
			}else{
				System.out.println("we don't have a product");
			}
		}
		
	}
}
