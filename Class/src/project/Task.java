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
			throw new Exception("�Էµ� �ڵ尡 �����ϴ�. �ٽ� �Է� �ٶ��ϴ�.");
		return returnValue;
	}
	static void printGoodsDescription(Goods goods[], int index){
		printLayout('=');
		System.out.printf("��ǰ �ڵ� : %s   ", goods[index].goodsCode);
		System.out.printf("��  ǰ  ��   : %s\n\n", goods[index].goodsName);
		System.out.printf("��  ��  ��   :  %s   ", goods[index].goodsMaker);
		System.out.printf("��ǰ ���� : %s\n\n", goods[index].goodsColor);
		System.out.printf("��ǰ ���� : %d��    ", goods[index].goodsUnitPrice);
		System.out.printf("��  ��  ��   : %d��\n\n", goods[index].goodsStock);
		System.out.printf("��ǰ ���� : %s\n\n", goods[index].goodsDescription);
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
			System.out.printf("��ǰ �ڵ� : %s   ", goods[cnt].goodsCode);
			System.out.printf("��  ǰ  �� : %s\n\n", goods[cnt].goodsName);
		}
		printLayout('-');
	}

}
