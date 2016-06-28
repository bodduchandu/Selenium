package practice;

public class Company {

	public static void main(String[] args) {
		
		Department d =  new Department();
		Department.comp_name = "Tata";
		Department.holiday();
		d.dept_ID = 10;
		d.dept_name = "sales";
		d.no_of_emp = 1000;
		
		d.add_dept();
		d.change_dept();
		
		System.out.println("Department ID is  : "+ d.dept_ID);
		System.out.println("Department ID is  : "+ d.no_of_emp);
		System.out.println("Department ID is  : "+ d.dept_name);
		

	}

}
