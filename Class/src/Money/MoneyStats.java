package Money;

import java.util.Scanner;

public class MoneyStats {
	int index;
	int menuItem;
	int detailItem;
	
	MoneyOut obj= new MoneyOut();
	void calc(MoneyBook MoneyBookArr[]){
		obj.computeTot(MoneyBookArr);
		obj.computeBreakDawn(MoneyBookArr);
		obj.computeAvgCase(MoneyBookArr);
	}
	
	void prnList(MoneyBook MoneyBookArr[]){
		int cnt;
		System.out.println("Spend Money List");
		System.out.println("==========================================");
		System.out.println("Index\tDate\t\tSpend\tCategory");
		System.out.println("------------------------------------------");
		
		for(cnt = 0; cnt < MoneyBookArr.length; cnt++){
			
			System.out.printf(cnt+"\t" );
			System.out.printf(MoneyBookArr[cnt].year +"."+MoneyBookArr[cnt].month + "." + MoneyBookArr[cnt].day+ "\t");
			System.out.printf(MoneyBookArr[cnt].money + "\t");
			System.out.printf(MoneyBookArr[cnt].breakDawn +"\n");
			
			
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Spend Total : "+obj.totSpend);
		
	}
	
	void prnSearch (MoneyBook MoneyBookArr[], int index){
		System.out.println("\nDetal");
		System.out.println("==========================================");
		System.out.println("Date\t\t:\t"+ MoneyBookArr[index].year+"-"+MoneyBookArr[index].month+"-"+MoneyBookArr[index].day);
		System.out.println("Category\t:\t"+ MoneyBookArr[index].breakDawn);
		System.out.println("Spend Money\t:\t"+ MoneyBookArr[index].money);
		System.out.println("Location\t:\t"+MoneyBookArr[index].location);
		System.out.println("------------------------------------------");
		System.out.println("Spend Total\t:\t"+obj.totSpend);
		
	}
	
	void prntest(MoneyBook MoneyBookArr[]){
		
		System.out.println("\nCatagory Detail");
		System.out.println("==========================================");
		System.out.println("Food\t\t:\t" + obj.statFood +"\t- "+ obj.cntFood+"("+obj.avgFood+"%)");
		System.out.println("Living\t\t:\t" + obj.statTransfer +"\t- "+ obj.cntTransfer+"("+obj.avgTransfer+"%)");
		System.out.println("Transfer\t:\t" + obj.statLiving +"\t- "+ obj.cntLiving+"("+obj.avgLiving+"%)");
		System.out.println("Etc\t\t:\t" + obj.statEtc +"\t- "+ obj.cntEtc+"("+obj.avgEtc+"%)");
		System.out.println("------------------------------------------");
		System.out.println("Spend Total\t:\t"+obj.totSpend+"\t- "+MoneyBookArr.length+"(100%)");
	}
	
	void scanInt() {
		Scanner sc = new Scanner(System.in);
		menuItem = sc.nextInt();
	};
	void detailItem(){
		Scanner sc = new Scanner(System.in);
		detailItem = sc.nextInt();
	}
	
	int prnMenu(){
		System.out.println("\n<Moneybook Main menu>");
		System.out.println("1.detail view\t2.Category view\t3.Cancle Spend");
		System.out.printf("Select Menu >");
		scanInt();
		return menuItem;
		
	}
	int detailMenu(){
		System.out.println("\nDetail View Menu");
		System.out.println("1.By Index number");
		System.out.println("2.By Year");
		System.out.println("3.by Month");
		System.out.printf("Select Menu >");
		detailItem();
		return detailItem;
	}
	int indexMenu(){
		System.out.printf("Enter index number >");
		detailItem();
		return detailItem;
	}
	
	
	

}
