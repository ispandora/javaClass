package Class1010;

public class InheritanceExample {

	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("00.11.11112","kim",10000,2000000);
		try {
			int amount = obj.withdraw(50000);
			System.out.println("인출: "+amount);
			System.out.println("잔액: "+obj.balance);
			System.out.println("마이너스한도 : "+obj.creditLine);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
