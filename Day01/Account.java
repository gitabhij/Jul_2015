public class Account{
	private long accountNumber;
	private double balance;
	public Account(long accNum){
		accountNumber = accNum;
		balance = 1000;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount){
		if((balance-amount) > 1000)
			balance -= amount;
		else
			System.out.println("Minimum balance should be 1000.");
	}
}