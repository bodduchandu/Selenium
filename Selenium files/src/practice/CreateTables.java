package practice;

public class CreateTables {
	
	public static void printTables( int a){
		 
		for(int i=1;i<=10;i++){
			int x = a*i;
			System.out.println(a +"*"+ i +"="+ x);
		}
		
	}

	public static void main(String[] args) {
		
		printTables(2);
	}

}
