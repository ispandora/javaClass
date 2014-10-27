package Class1010;

public class Ticket {
	int ticketPrice;
	int totNum;
	int totPrice;
	
	Ticket(int totNum) {
		this.totNum = totNum;
		ticketPrice = 9000;
	}
	void cpmpute(){
		totPrice = ticketPrice * totNum;
	}
	
	void prn() {
		System.out.println("인원:"+totNum + " 총금액:"+totPrice);	
	}
}
