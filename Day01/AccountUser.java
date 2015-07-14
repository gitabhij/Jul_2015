public class AccountUser{
	public static void main(String[] args) {
		Account acc = new Account(213123213);
		acc.deposit(1000);
		System.out.println("Balance: " + acc.getBalance());
		acc.withdraw(4000);
		System.out.println("Balance: " + acc.getBalance());
	}
}