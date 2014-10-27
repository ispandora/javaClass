package report01;

public class Report01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menuItem, qnt;
		String goodSelect=""; 
		
		Order obj = new Order();
		
		menuItem = obj.mainMenu();
		switch (menuItem) {
			case 1 : goodSelect = obj.goodsInfoPrn(); 
				break;
			case 2 :
			case 3 :
			default :
		}
		
		qnt = obj.goodsDetailPrn(goodSelect);

		try {
			obj.calc(qnt, obj.index);
			obj.calcPrn(obj.index);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
