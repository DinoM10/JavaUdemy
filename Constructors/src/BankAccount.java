
public class BankAccount {

	private int accountNumber;
	private int balance;
	private String costumerName;
	private String email;
	private int phoneNumber;
	
	
	public BankAccount() {
		
		System.out.println("empty");
		}
	
	public BankAccount(int accountNumber,int balance, String costumerName, String email, int phoneNumber ) {
		System.out.println("Account constructor with parameters called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.costumerName = costumerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount +"made. New balance is " + this.balance);
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(balance - withdrawalAmount <= 0) {
			
			System.out.println("Only " + this.balance + " available.");
		} else {
			balance -= withdrawalAmount;
			System.out.println("Withdrawal of" + withdrawalAmount+ "processed. Remaining balance +"+ this.balance);
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
		
	}
		
	public String getCostumerName() {
		return costumerName;
	}
	public void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail (String email) {
		this.email = email;
		
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber (int phoneNumber) {
		this.phoneNumber = phoneNumber;
		
	}
	}



