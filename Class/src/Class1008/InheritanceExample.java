package Class1008;

public class InheritanceExample {

	public static void main(String[] args) {
		CheckingAmount obj = new CheckingAmount();
		obj.accountNo = "111-222-23123123";
		obj.ownerName = "yoon";
		obj.cardNo = "123123-123123-123123";
		obj.deposit(100000);
		try {
			int paidAmount = obj.pay("123123-123123-123123", 47000);
			System.out.println("paied : "+paidAmount);
			System.out.println("balance : " + obj.balance);
		} catch (Exception e){
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
	}

}
