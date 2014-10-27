package Class1010;

public class movie {
	int ticketPrice = 9000;
	int kidDiscnt = -2000;
	int numOfPeople;
	int totPrice;
	
	movie(int ticketPrice,int kidDiscnt,int numOfPeople,int totPrice){
		this.ticketPrice = ticketPrice;
		this.kidDiscnt = kidDiscnt;
		this.totPrice = totPrice;
	}
	void computePrice (){
		totPrice = ticketPrice * numOfPeople;
		System.out.println("Total Price : "+ totPrice);
	}
}
