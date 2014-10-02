package class1001;

public class Student {
	
	String name;
	int score;
	char grade;
	
	
	Student (String n, int num){
		name = n;
		score = num;
		
		
		
		
	}
	void computeGrade(){
		if (score <= 100 ) {
			grade = 'A';
		}else if(score < 90) {
			grade = 'B';  
		}else if(score < 80) {
			grade = 'C';
		}else if(score < 70) {
			grade = 'D';
		}else if(score < 60) {
			grade = 'F';
		}else {
			grade = 'N';
		}
		
	}
	
	void prn(){
		System.out.println("name : "+name);
		System.out.println("score : "+score);
		System.out.println("grade : "+grade);
	}
	
		
}
