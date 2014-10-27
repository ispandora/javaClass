package Class1007;

public class ExceptionExample7 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[0];
			System.out.println("total "+getTotal(arr));
			System.out.println("avg "+getAverage(arr));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	static double getAverage(int arr[]) throws Exception {
		if(arr.length == 0)
			throw new Exception("empty array");
		return getTotal (arr) /arr.length;
	}
	static int getTotal(int arr[]) throws Exception {
		if (arr.length == 0)
			throw new Exception("Empty Array");
		int total = 0;
		for (int num:arr)
			total += num;
		return total;
	}

}
