package Class1007;

public class PhysicalExe {

	public static void main(String[] args) {
		PhysicalInfo obj;
		obj = new PhysicalInfo("insung",10,123.1f,30f);
		printPhysicalInfo (obj);
		
	}
	static void printPhysicalInfo(PhysicalInfo obj){
		System.out.println("name : "+obj.name);
		System.out.println("age : "+ obj.age);
		System.out.println("height : "+obj.height);
		System.out.println("weight : "+obj.weight);
	}

}
