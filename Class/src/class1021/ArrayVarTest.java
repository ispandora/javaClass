package class1021;

public class ArrayVarTest {

	public static void main(String[] args) {
		int arr[]={1,2,3};
		printArray(arr);
		arr= null;
		printArray(arr);
		
	}
	static void printArray(int arr[]){
		for (int data : arr)
			System.out.println(data);
	}

}
