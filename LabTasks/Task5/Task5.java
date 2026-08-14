import java.util.Scanner;
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg){
		super(msg);
}
}

class BAccount{
	private int accnumber;
	private double bal;
	private String name;
	public BAccount(int accnumber, double bal,String name){
		this.accnumber = accnumber;
		this.bal = bal;
		this.name = name;
	}
	public void deposit(double m){
		bal += m;
		}
	public void checkbal(){
		System.out.println(bal);
		}
	public void getdetails(){
		System.out.println("name : " +name);
		System.out.println("Account number : "+accnumber);
		System.out.println("Balance : " + bal);
		}
	public void widthdraw(double m) throws InsufficientBalanceException{
		if(m>bal){
			throw new InsufficientBalanceException("Insuficient Balance");
			}
		bal -= m;
}
}

public class Task5{
	public static void main(String[] args){
		BAccount b = new BAccount(2028989,789.5,"Pavan");
		b.deposit(290.8);
		b.checkbal();
		try{
			b.widthdraw(200.9);
			b.getdetails();
			b.widthdraw(2000.9);
			}
		catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
}
		b.getdetails();
}
}
	