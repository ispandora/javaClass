package class1002;

public class ConstrExample {

	public static void main(String[] args) {
		SubscriberInfo obj1, obj2;
		obj1 = new SubscriberInfo("1","2","3");
		obj2 = new SubscriberInfo("11","22","33","44","55");
		
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);

	}
	static void printSubscriberInfo(SubscriberInfo obj){
		System.out.println("name : "+ obj.name);
		System.out.println("id : "+ obj.id);
		System.out.println("pass : "+ obj.password);
		System.out.println("phone : "+ obj.phoneNo);
		System.out.println("address : "+ obj.address);
		System.out.println();
	}

}
