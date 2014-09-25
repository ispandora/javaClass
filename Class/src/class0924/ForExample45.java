package class0924;

public class ForExample45 {

	public static void main(String[] args) {
		int tot = 0;
		for (int cnt = 0 ; cnt <= 10 ; cnt++){
			if(cnt%3 == 0){
				tot += cnt;
			}
		}
		System.out.println(tot);

	}

}
