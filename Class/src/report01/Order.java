package report01;

import java.util.Scanner;

public class Order {

	int menuItem;
	double disRate;
	int index; // ����ϰ��� �ϴ� ��ǰ�� index
	int disPrice;
	int totPrice;
	
	String goodSelect="";
	
	GoodsInfo goodsArr[] = {
			new  GoodsInfo("A-100", "�����", "����", 10000, "�ڳ����� ���� �ʴ��� �����","�Ｚ", 100),
			new  GoodsInfo("B-100", "��Ź��", "��Ȳ", 20000, "������ ������ �ž� ��Ź��","����", 20),
			new  GoodsInfo("C-100", "��ǻ��", "���", 30000, "������ ����ϴ� ���� ��ǻ��","�ֿ���ũ", 3),
			new  GoodsInfo("D-100", "�޴���", "�ʷ�", 40000, "�ʵ����� ���� ���� �޴���","���̾�", 45),
			new  GoodsInfo("E-100", "�ı⼼ô��", "�Ķ�", 50000, "�⸧�Ⱑ ��... �ı⼼ô", "�Ｚ", 555),
			new  GoodsInfo("F-100", "�����","����", 60000, "�ڿ����� �����ϴ� ���ػ� �����", "����", 601),
			new  GoodsInfo("G-100", "LED TV", "����", 70000, "��麸�� �� ��齺���� LED", "����", 70),
			new  GoodsInfo("H-100", "������ȭ��", "���", 80000, "�Ÿ������� ���� ������ȣ","�Ｚ", 8),
			new  GoodsInfo("I-100", "������", "����",90000, "���� �ʹ��� ���� ���", "���̾�", 19),
			new  GoodsInfo("J-100", "���ڷ�����", "ȸ��", 100000, "�ƹ��ų� �� �����","�ĳ��Ҵ�", 110)
	};
	
	public Order () {
		
	}

	void scanInt() {
		Scanner sc = new Scanner(System.in);
		menuItem = sc.nextInt();
	}

	void scanString() {
		Scanner sc = new Scanner(System.in);
		goodSelect = sc.next();
	}

	int mainMenu() {
		System.out.println("1. Spend List");
		System.out.println("2. Cancle Spend");
		System.out.print("Select Menu : ");
		scanInt();
		return menuItem;
	}
	
	String goodsInfoPrn() {
		System.out.println("----------------------");
		for (int i = 0; i < goodsArr.length; i++)
			System.out.println(goodsArr[i].code + "   " + goodsArr[i].name);
		System.out.print("��ǰ�� �����ϼ��� : ");
		scanString();
		return goodSelect;
	}
	
	int goodsDetailPrn(String goodCode) {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("   ��ǰ�ڵ�            ��ǰ��      ����        ����                      �󼼼���                                       ������       ������     ");
		for (int i = 0; i < goodsArr.length; i++)
			if (goodCode.equals(goodsArr[i].code)) {
					System.out.printf("%5s %10s %6s %10d %20s %10s %5d\n", goodsArr[i].code, goodsArr[i].name, goodsArr[i].color, 
							goodsArr[i].price, goodsArr[i].goodsInfo, goodsArr[i].maker, goodsArr[i].stock);
					index = i;
			}
		System.out.print("�����ϰ����ϴ� ������ �Է��ϼ��� : ");
		scanInt();
		return menuItem;
	}
	
	void calc(int qnt, int index) throws Exception {
		if (qnt >= 20) 
			disRate = 5;
		else if (qnt >= 10)
			disRate = 3;
		else
			disRate = 0;
		
		if (qnt > goodsArr[index].stock)
			throw new Exception("�������� �۽��ϴ�.");
		
		disPrice = (int) (goodsArr[index].price * (1 - disRate/100));
		totPrice = disPrice * qnt;
		goodsArr[index].stock -= qnt; 
	}
	
	void calcPrn(int index) {
		System.out.println("��ǰ�� : " + goodsArr[index].name + ", ���� : " + goodsArr[index].price + 
				", ���ΰ� : " + disPrice + ", ���ǸŰ� : " + totPrice + ", ������ : " + goodsArr[index].stock);
	}
}
