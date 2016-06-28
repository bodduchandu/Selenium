package inheritance;

public class MakeHonda extends Bike{
	
	public void tyreType(){
		
		System.out.println("Tubeless");
	}

	// method over riding only possible while inheritance - @ Overridden
	public void startBike(){
		System.out.println("Self start the bike");
	}
}
