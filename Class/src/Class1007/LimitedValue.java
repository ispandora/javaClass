package Class1007;

public class LimitedValue {
	final static int UPPER_LIMIT = 10000;
	int value;
	void setValue(int value){
		if (value < UPPER_LIMIT)
			this.value = value;
		else
			this.value = UPPER_LIMIT;
	}

}
