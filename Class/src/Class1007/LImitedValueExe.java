package Class1007;

public class LImitedValueExe {

	public static void main(String[] args) {
		LimitedValue v = new LimitedValue();
		v.setValue(1000);
		System.out.println("v.value = "+v.value);
		System.out.println("limited value = "+ LimitedValue.UPPER_LIMIT);

	}

}
