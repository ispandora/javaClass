package Class1010;

public class InheritaceExample1 {

	public static void main(String[] args) {
		BonusPointAccount obj = new BonusPointAccount("222-111-232","kim",0,0);
		obj.deposit(1000000);
		System.out.println("Balance: "+obj.balance);
		System.out.println("BonusPoint : "+obj.bonusPoint);
		
	}

}
