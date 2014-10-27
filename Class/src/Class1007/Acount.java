package Class1007;

public class Acount {
	String acountNo;
	String ownerName;
	int balance;
	Acount(String acountNo, String ownerName, int balance) throws Exception {
		if(balance < 0) 
			throw new Exception("can not creat object");
		this.acountNo = acountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	void deposit(int amount){
		balance += amount;
	}
	int withdraw (int amount) throws Exception {
		if(balance < amount)
			throw new Exception("Not Enough");
		balance -= amount;
		return balance;
	}
}
