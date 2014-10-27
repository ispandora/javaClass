package class1021;

class TestExample {
	public static void main(String args[]){
		Landable arr[] = {
				new AppCDInfo("2005-12","Redhat Fedora"),
				new SeparateVolume("238A023","Live id Pain","Howard Roms")
		};
		checkOutAll(arr, "sookyung","20031211");
		
	}
	static void checkOutAll(Landable arr[],String borrower, String date){
		for(Landable obj: arr) {
			obj.checkOut(borrower, date);
			System.out.println("Borrower : " + borrower); 
			System.out.println("Date : "+ date);
		}
	}
}
