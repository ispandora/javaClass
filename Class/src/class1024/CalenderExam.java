package class1024;

import java.util.*;
import java.text.*;

public class CalenderExam {

	public static void main(String[] args) {
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		Date now = new Date();
		String str = dateFormat.format(now);
		System.out.println(str);
	
		
	}

}
