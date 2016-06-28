package exceptionHandling;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Beginning");
		
		try{
		int div =10/0;
		
		System.out.println(div);
		
		System.out.println("Ending");
		
		}catch(Exception e){
			
			System.out.println("Error occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
						
		}
		

	}

}
