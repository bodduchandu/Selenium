package practice;

public class FinalBank {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.accbal = 10000;
		b.name = "Chandu";
		b.totalInc(5000);
		System.out.println("The total balance is: "+b.accbal);
		
		Members m =  new Members();
		m.add = "2925 Keller Springs RD";
		m.name = "Saibersys";
		
		// this is one way to acces one class object with second class object
		b.mem = m;
		
		System.out.println("The address is : "+b.mem.add);
		System.out.println("The name is : "+b.mem.name);
		
		
		// this is another way to access the object of 1st with 2nd
		Bank b1 = new Bank();
		b1.mem = m;
		b1.mem.add = "Kent State University";
		b1.mem.name = "Chaitu";
		
		System.out.println("The address is : "+b1.mem.add);
		System.out.println("The name is : "+b1.mem.name);
		
		b1.getbalance();
		
		Members m1 = b1.getbalance();
		m1.deposit();
		m1.withdrawl();
		b1.getbalance().deposit();
		b1.getbalance().withdrawl(); 
		
		

	}

}
