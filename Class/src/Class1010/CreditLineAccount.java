package Class1010;

public class CreditLineAccount extends Account{
	int creditLine;
	CreditLineAccount(String accountNo,String ownerName,int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	int withdraw(int amount)throws Exception {
		if ((balance + creditLine) < amount)
			throw new Exception("no money");
		balance -= amount;
		return amount;
	}

}
