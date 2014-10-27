package Class1008;

class CheckingAmount extends Account{
	String cardNo;
	CheckingAmount(){
		super("","",0);
	}
	CheckingAmount(String accountNo,String ownerName,int balance,String cardNo){
		super(accountNo,ownerName,balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception {
	 if(!cardNo.equals(this.cardNo) || (balance < amount))
		throw new Exception("지불이 불가합니다.");
	return withdraw(amount);
	}
}
