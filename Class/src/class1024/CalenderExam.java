package class1024;

import java.util.*;
import java.text.*;

public class CalenderExam {

	public static void main(String[] args) {
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		Date now = new Date();
		String str = dateFormat.format(now);
		System.out.println(str);
	
		
	}

}
