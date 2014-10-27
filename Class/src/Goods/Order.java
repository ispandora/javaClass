package Goods;


import java.util.Scanner;

//String code, String name, String color, int price, String info, String maker, int goodsNum
class Order {
	
	int qnt, totPrice;
	String code;
	GoodsInfo GoodsList[]={
			new GoodsInfo("A-100","싼냉장고","White",10000,"거져가져가는가격의냉장고","사성",20),
			new GoodsInfo("B-100","비싼냉장고","black",1000000,"거품있는 가격의 냉장고","사성",10),
			new GoodsInfo("C-100","더러운세탁기","똥색",1000,"빨래하고 싶지 않은 세탁기","알지",20),
			new GoodsInfo("D-100","오래된세탁기","White",5000,"세탁구와 탈수구가 따로 있는 오래된 세탁기","금성",20),
			new GoodsInfo("E-100","드럼세탁기","red",50000,"흑곰도 하얗게 세탁해주는 드럼세탁기","사성",30),
			new GoodsInfo("F-100","밥퍼밥솥","red",5000,"밥퍼 하세요~ ","오성",5),
			new GoodsInfo("G-100","슈퍼컴퓨터","Black",100000,"3D게임 10개가 한번에 돌아가도 끄떡 없는 컴퓨터","알지",10),
			new GoodsInfo("H-100","노트북","White",50000,"나도사고싶다","사성",10),
			new GoodsInfo("I-100","최신형핸드폰","White",1000000,"노예가 되고 싶으십니까?","CKT",20)
	};

	
	void prnList(){
			System.out.println("상품코드 / 상품이름 / 상품색상 / 상품가격 / 상품정보 / 메이커 / 재고수량");
		for(int i = 0; i<GoodsList.length; i++){
			System.out.println(GoodsList[i].code+"/"+GoodsList[i].name+"/"+GoodsList[i].color+"/"+GoodsList[i].price+"/"+GoodsList[i].info+"/"+GoodsList[i].maker+"/"+GoodsList[i].goodsNum);
		}

		System.out.println("----------------------------------------------------------------------");
		
		
		
		Scanner key=new Scanner(System.in);
		System.out.print("상품코드를 입력하시오");
		code=key.next();
		
		
		for(int i = 0; i<GoodsList.length; i++){
		if(code.equals(GoodsList[i].code)){
			System.out.println("메이커 : "+GoodsList[i].maker+" /상품설명 :"+GoodsList[i].info+" /상품재고 : "+GoodsList[i].goodsNum);
					
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.print("구매 수량을 입력하시오");
		qnt=key.nextInt();
		
		if(qnt>=20){
			totPrice=(int)(GoodsList[i].price*0.95)*qnt;
		}else if(qnt>=10){
			totPrice=(int)(GoodsList[i].price*0.97)*qnt;
		}else{
			totPrice=GoodsList[i].price*qnt;
		}
		
		if(GoodsList[i].goodsNum<qnt){
			System.out.println("판매불가:상품재고부족");
			}else{
				
				System.out.println("총금액 : "+totPrice+" /상품재고 :"+this.GoodsList[i].goodsNum+"-"+qnt+"="+(GoodsList[i].goodsNum-=qnt)+"개");
			}
			}
		
		
	}
}
	}

