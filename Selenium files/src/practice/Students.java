package practice;

public class Students {
	
	String name;
	int age;
	int roll;
	
	
	public Students(){
		System.out.println("Adding studets records");
		
	}
	public Students(String nm, int age, int roll){
		this.name = nm;
		this.age = age;
		this.roll = roll;
	}
	public static void main(String[] args) {

		Students stu = new Students("Chandu",28,04);
		
		System.out.println("The student name is: "+stu.name);
		System.out.println("The student age is: "+stu.age);
		System.out.println("The student roll is: "+stu.roll);
		
	}

}
