package project;

import java.util.Scanner;

public class Task {
	static int compareGoodsCode(Goods goods[]){
		Scanner keyBoard = new Scanner(System.in);
		boolean checkingLoop = true;
		String goodsCode, errMsg;
		int index, returnValue = -1;

		while(checkingLoop){
			try {
				goodsCode = keyBoard.next();
				index = compare(goods, goodsCode);
				if( index != -1){
					printGoodsDescription(goods, index);
					returnValue = index;
					checkingLoop = false;
				} else {
					returnValue = index;
				}
			}
			catch (Exception err){
				errMsg = err.getMessage();
				System.out.printf("%s", errMsg);
			}
		}
		keyBoard.close();
		return returnValue;
		
	}

	static int compare(Goods goods[], String goodsCode) throws Exception {
		int cnt;
		int returnValue = -1;
		for(cnt = 0; cnt < goods.length; cnt++){
			if(goodsCode.equals(goods[cnt].goodsCode))
				returnValue = cnt;
		}
		if( returnValue == -1)
			throw new Exception("입력된 코드가 없습니다. 다시 입력 바랍니다.");
		return returnValue;
	}
	static void printGoodsDescription(Goods goods[], int index){
		printLayout('=');
		System.out.printf("상품 코드 : %s   ", goods[index].goodsCode);
		System.out.printf("상  품  명   : %s\n\n", goods[index].goodsName);
		System.out.printf("제  조  사   :  %s   ", goods[index].goodsMaker);
		System.out.printf("상품 색상 : %s\n\n", goods[index].goodsColor);
		System.out.printf("상품 가격 : %d원    ", goods[index].goodsUnitPrice);
		System.out.printf("재  고  량   : %d개\n\n", goods[index].goodsStock);
		System.out.printf("상품 설명 : %s\n\n", goods[index].goodsDescription);
		printLayout('=');
	}
	static void printLayout(char border){
		int cnt;
		for(cnt = 0; cnt < 80; cnt++){
			System.out.printf("%c", border);
		}
		System.out.println();
	}
	static void printGoodsList(Goods goods[]){
		int cnt;
		printLayout('-');
		for(cnt = 0; cnt < goods.length; cnt++){
			System.out.printf("상품 코드 : %s   ", goods[cnt].goodsCode);
			System.out.printf("상  품  명 : %s\n\n", goods[cnt].goodsName);
		}
		printLayout('-');
	}

}
