package class0924;

public class ForExample43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot = 0;
		for (int cnt = 0; cnt <= 10; cnt++){
			if (cnt%2 == 0) {
				tot = tot + cnt;
			}
		}
		System.out.println(tot);
	}

}
