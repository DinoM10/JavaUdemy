
public class Main {

	public static void main(String[] args) {
		
		
		BankAccount bobsAccount = new BankAccount(45454,5375, "Bob", "bob@gmail.com", 65);
		System.out.println(bobsAccount.getPhoneNumber());
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(50.0);
		
		
	}
}
