package project;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods[] = { new Goods("a-1014","마징가","Yellow","마징가는 지구를 지키는 영웅입니다. ","아카데미",12000,250),
						  new Goods("a-1015","짱가","Green","짜~~~ 짜앙가, 엄청난 기운...! ","아카데미",15000,20),
						  new Goods("a-1016","그레이트 마징가","Blue","그레이트 마징가와 마징가의 차이점은 ?", "손오공",13000,32),
						  new Goods("b-2011","원더우먼","Black","날으는 날으는 원더우면, 원더우먼...! 그 다음 가사 생각 안 나네 ! ","손오공",2500,36),
						  new Goods("b-2012","슈퍼맨","White", "빛의 속도로 날아가는 슈퍼맨! 시속 30만 킬로미터...! 넌 도대체 뭐 하는 인간이니? 부킹 사절", "우산속 나이트",5000,12),
						  new Goods("b-2013", "스파이더맨","Aqua","거미줄로 모든 여성들을 사로 잡아라. 오늘 부킹 안 되었다고 낙담하지 마라. 스파이더맨을 찾아주세요","일번지 나이트", 5500,25)
		};
	
		Task.printGoodsList(goods);
		Task.compareGoodsCode(goods);
		
	}

}
