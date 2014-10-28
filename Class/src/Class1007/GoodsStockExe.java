package Class1007;

public class GoodsStockExe {

	public static void main(String[] args) throws StockShortageException {
		GoodsStock obj = new GoodsStock("A-1",5);
		obj.addStock(5);
		obj.subtractStock(11);
		

	}

}
