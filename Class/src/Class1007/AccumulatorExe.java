package Class1007;

public class AccumulatorExe {

	public static void main(String[] args) {
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(30);
		obj2.accumulate(20);
		int grandTotal = Accumulator.getGrandTotal();
		System.out.println("obj1.total = "+ obj1.total);
		System.out.println("boj2.total = "+ obj2.total);
		System.out.println("total = "+ grandTotal);
		
	}

}
