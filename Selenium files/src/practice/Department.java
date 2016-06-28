package practice;

public class Department {
	
	// non static global variables
	public String dept_name;
	public int dept_ID;
	public int no_of_emp;
	
	// Static global variable
	public static String comp_name;
	
	public void  change_dept(){
		System.out.println("Department changed");
	}

	public void add_dept(){
		System.out.println("Department added");
	}
	public static void holiday(){
		
		System.out.println("National Holiday");
	}
}
