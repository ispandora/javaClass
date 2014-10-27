package Class1010;

public class TicketAge extends Ticket{
	int adultNum;
	int kidNum;
	
	TicketAge(int totNum,int kidNum){
		super(totNum);
		this.kidNum = kidNum;
	}
	void compute(){
		adultNum = totNum - kidNum;
		totPrice = adultNum * ticketPrice + kidNum * (ticketPrice - 2000);
	}
	void prn(){
		System.out.println("인원:"+totNum +"Adult :"+adultNum +"kid :"+kidNum+ "총금액:"+totPrice);
	}
}
