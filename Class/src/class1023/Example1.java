package class1023;

public class Example1 {

	public static void main(String[] args) {
		String data1 = "이순신;100;홍길동;80;강감찬;20";
		int pos1 = -1, pos2, cnt = 0;
		int tot = 0;
		
		while(true){
			pos2 = data1.indexOf(";",pos1+1);
			String a = " ";
			if (pos2 == -1){
				a = data1.substring(pos1+1);				
			}else{
				a = data1.substring(pos1+1, pos2);
			}
			if (cnt % 2 == 0){
				System.out.print("Name\t: ");
				
			}else {
				System.out.print("Score\t: ");

			}
			
			try{tot += Integer.parseInt(a);} catch (Exception e){
				
			}
			System.out.println(a);
			if(pos2 == -1) break;
			
			pos1 = pos2;
			cnt++;
		}
		System.out.println("==================");
		System.out.println("Total\t: "+tot);
	}

}
