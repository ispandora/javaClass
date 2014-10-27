package Goods;

public class GoodsList extends GoodsInfo{
	GoodsInfo GoodsListArr[] = {
		new GoodsInfo("code0", "name", "color", 123123, "info", "maker", 123),
		new GoodsInfo("code1", "name", "color", 123123, "info", "maker", 123),
		new GoodsInfo("code2", "name", "color", 123123, "info", "maker", 123),
		new GoodsInfo("code3", "name", "color", 123123, "info", "maker", 123),
		new GoodsInfo("code4", "name", "color", 123123, "info", "maker", 123)
};

GoodsList(String code, String name, String color, int price, String info, String maker, int goodsNum){
	super(code, name, color, price,info, maker,goodsNum);
}

void prnList(){
	for(int i = 0; i<GoodsListArr.length; i++){
		System.out.println(GoodsListArr[i].code + GoodsListArr[i].name);
	}
	
}

}
