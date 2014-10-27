package Money;

public class MoneyOut{
	
	int totSpend;
	int totStats;
	int stats;
	int statFood,statLiving,statTransfer,statEtc;
	int avgFood;
	int avgLiving,avgTransfer,avgEtc;
	int cntFood = 0, cntLiving = 0, cntTransfer = 0, cntEtc= 0;
	
	int computeTot(MoneyBook MoneyBookArr[]){
		int cnt;
		for (cnt = 0; cnt < MoneyBookArr.length; cnt++){
			totSpend += MoneyBookArr[cnt].money;
		}return totSpend;
		
	}
	
	void computeBreakDawn(MoneyBook MoneyBookArr[]){
		
		int i;
		for (i = 0; i < MoneyBookArr.length; i++){
			if(("food").equals(MoneyBookArr[i].breakDawn)){
				statFood += MoneyBookArr[i].money;
				cntFood++;
				
			}else if(("living").equals(MoneyBookArr[i].breakDawn)){
				statLiving += MoneyBookArr[i].money;
				cntLiving++;
				
			}else if(("transfer").equals(MoneyBookArr[i].breakDawn)){
				statTransfer += MoneyBookArr[i].money;
				cntTransfer++;
				
			}else {
				statEtc += MoneyBookArr[i].money;
				cntEtc++;
			}
		} 
		
	}
	
	void computeAvgCase(MoneyBook MoneyBookArr[]){
			
			avgFood = (int) ((double) statFood/totSpend*100);
			avgTransfer = (int) ((double) statTransfer/totSpend*100);
			avgLiving = (int) ((double) statLiving/totSpend*100);
			avgEtc = (int) ((double) statEtc/totSpend*100);
			
			
	}
	
	void searchYear (MoneyBook MoneyBookArr[]){
		for(int i = 0; i < MoneyBookArr.length; i++){
			
		}
	}
	

}
