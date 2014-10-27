package Money;

public class MoneyExe {

	public static void main(String[] args) {
		MoneyStats obj = new MoneyStats();
		
		MoneyBook MoneyBookArr[] = { 
				new MoneyBook(2013,5,3,"food",4000,"seoul, Korea"),
				new MoneyBook(2013,5,3,"living",10000,"seoul, Korean"),
				new MoneyBook(2014,10,3,"etc",44000,"seoul, Korean"),
				new MoneyBook(2014,10,11,"transfer",1000,"seoul, Korean"),
				new MoneyBook(2014,10,23,"food",8000,"seoul, Korean"),
				new MoneyBook(2014,10,18,"living",2000,"seoul, Korean"),
				new MoneyBook(2014,11,1,"etc",11000,"seoul, Korean"),
				new MoneyBook(2014,11,5,"food",3400,"seoul, Korean"),
				new MoneyBook(2014,11,15,"transfer",23000,"london, Unite Kingdom"),
				new MoneyBook(2014,12,7,"food",12000,"new york, Unite state america"),
				new MoneyBook(2014,12,18,"living",3000,"bangkok, thai")
};
		obj.calc(MoneyBookArr);
		obj.prnList(MoneyBookArr);
		obj.prnMenu();
		switch(obj.menuItem) {
			case 1 : obj.detailMenu();
					obj.indexMenu();
					obj.prnSearch(MoneyBookArr, obj.detailItem);
					
			case 2 : obj.prntest(MoneyBookArr);
				
			case 3 : 
			default : System.out.println("Error!! invald menu number");
		}
		
		
	}

}
