package inheritance;

public class TestBike {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.color = "Black";
		b.startBike();
		
		MakeHonda mh =new MakeHonda();
		mh.color = "Red";
		mh.startBike();
		mh.tyreType();
		
		Bike b1 = new MakeHonda();
		b1.startBike();
		b1.stopBike();
	}

}
