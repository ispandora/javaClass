package class1021;

class SeparateVolume implements Landable{
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	SeparateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	public void checkOut(String borrower, String date){
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*"+bookTitle+" is Landed.");
		System.out.println("Borrower : "+borrower);
		System.out.println("Date : "+date+"\n");
		
	}
	public void checkIn(){
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*"+bookTitle+"is Return.");
	}
}
