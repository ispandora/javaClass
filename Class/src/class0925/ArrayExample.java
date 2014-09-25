package class0925;

public class ArrayExample {

	public static void main(String[] args) {
		int tot=0;
		int arr [] = {2,4,6,8,10,12,14,16,18,20};
		for (int i = arr[2] ; i <=arr[6] ; i=i+2){
			System.out.print(i + " ");
			tot = tot + i;
		}
	
		System.out.println(tot);
	}

}
