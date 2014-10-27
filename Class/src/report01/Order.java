package report01;

import java.util.Scanner;

public class Order {

	int menuItem;
	double disRate;
	int index; // 출력하고자 하는 상품의 index
	int disPrice;
	int totPrice;
	
	String goodSelect="";
	
	GoodsInfo goodsArr[] = {
			new  GoodsInfo("A-100", "냉장고", "빨강", 10000, "코끼리가 들어가는 초대형 냉장고","삼성", 100),
			new  GoodsInfo("B-100", "세탁기", "주황", 20000, "지구도 돌리는 씽씽 세탁기","엘지", 20),
			new  GoodsInfo("C-100", "컴퓨터", "노랑", 30000, "누구나 사용하는 쉬운 컴퓨터","주연테크", 3),
			new  GoodsInfo("D-100", "휴대폰", "초록", 40000, "너도나도 갖고 싶은 휴대폰","하이얼", 45),
			new  GoodsInfo("E-100", "식기세척기", "파랑", 50000, "기름기가 쫙... 식기세척", "삼성", 555),
			new  GoodsInfo("F-100", "모니터","남색", 60000, "자연색을 구현하는 고해상도 모니터", "엘지", 601),
			new  GoodsInfo("G-100", "LED TV", "보라", 70000, "평면보다 더 평면스러운 LED", "엘지", 70),
			new  GoodsInfo("H-100", "무선전화기", "흰색", 80000, "거리제한이 없는 무선신호","삼성", 8),
			new  GoodsInfo("I-100", "전기밥솥", "검정",90000, "맛이 너무나 좋은 밥솥", "하이얼", 19),
			new  GoodsInfo("J-100", "전자레인지", "회색", 100000, "아무거나 다 데운다","파나소닉", 110)
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
		System.out.print("상품을 선택하세요 : ");
		scanString();
		return goodSelect;
	}
	
	int goodsDetailPrn(String goodCode) {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("   상품코드            상품명      색상        가격                      상세설명                                       제조사       재고수량     ");
		for (int i = 0; i < goodsArr.length; i++)
			if (goodCode.equals(goodsArr[i].code)) {
					System.out.printf("%5s %10s %6s %10d %20s %10s %5d\n", goodsArr[i].code, goodsArr[i].name, goodsArr[i].color, 
							goodsArr[i].price, goodsArr[i].goodsInfo, goodsArr[i].maker, goodsArr[i].stock);
					index = i;
			}
		System.out.print("구매하고자하는 수량을 입력하세요 : ");
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
			throw new Exception("재고수량이 작습니다.");
		
		disPrice = (int) (goodsArr[index].price * (1 - disRate/100));
		totPrice = disPrice * qnt;
		goodsArr[index].stock -= qnt; 
	}
	
	void calcPrn(int index) {
		System.out.println("상품명 : " + goodsArr[index].name + ", 정상가 : " + goodsArr[index].price + 
				", 할인가 : " + disPrice + ", 총판매가 : " + totPrice + ", 재고수량 : " + goodsArr[index].stock);
	}
}
