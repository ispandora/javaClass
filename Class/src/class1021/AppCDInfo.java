package class1021;

class AppCDInfo extends CDInfo implements Landable{
	String borrower;
	String checkOutDate;
	byte state;
	AppCDInfo(String registerNo, String title){
		super(registerNo, title);
	}
	public void checkOut(String borrower, String date){
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*"+title+" CD is Landed.");
		System.out.println("Borrower : "+borrower);
		System.out.println("Date : "+date+"\n");
	}
	public void checkIn(){
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*"+title+" CD is Return.");
	}
}
