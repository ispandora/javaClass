package Class1008;

public class InheritanceExample1 {

	public static void main(String[] args) {
		CheckingAmount obj = new CheckingAmount("111-222-23123123","insung",0,"123123-123123-123123");
		obj.deposit(100000);
		try{
			int paidAmount = obj.pay("123123-123123-123123", 47000);
			System.out.println("paid : "+paidAmount);
			System.out.println("balance : "+obj.balance);
			
		} 
		catch (Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}
