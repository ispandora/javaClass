package class1021;

public class InterfaceExample {

	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("123-1231-13","love","author");
		AppCDInfo obj2 = new AppCDInfo("2001-12","Love Song");
		
		obj1.checkOut("insung", "2013-10=10");
		obj2.checkOut("sookyung", "2013-11-12");
		obj1.checkIn();
		obj2.checkIn();

	}

}
