package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Beginning");
		try{
		int i [] = new int [4];
		i[3] = 100;
		System.out.println("Inside try block");
		System.out.println("DB connection close");
		
		}
		catch(Throwable t){
			
			System.out.println("Error occured");
			
		}
		finally{
			System.out.println("DB connection closed");
		}
		
		
	}

}
