package Class1007;

public class AcountEXE {

	public static void main(String[] args) {
		Acount obj1 = null, obj2 = null;
		try {
			obj1 = new Acount("123456","inung",0);
			obj1.withdraw(2000);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			obj2 = new Acount("7655443","sookyung",100000);
			obj2.withdraw(2000);
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
