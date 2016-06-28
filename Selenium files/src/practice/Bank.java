package practice;

public class Bank {
	
	String name;
	int accbal;
	Members mem;
	
	public int totalInc(int interest){
		accbal = accbal+ interest;
		return accbal;
	}
	
	public Members getbalance(){
		return mem;
	}

}
