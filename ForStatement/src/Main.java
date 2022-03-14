
public class Main {

	public static void main(String[] args) {

	System.out.println(calculateInterest(10000.0, 2.0));
	
	for(double interestRate = 2; interestRate < 9; interestRate++ ) {
		System.out.println(10000*(interestRate/100));
	}
	
	for(double interestRate = 8; interestRate > 1; interestRate-- ) {
		System.out.println(10000*(interestRate/100));
	}
	

	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return(amount * (interestRate/100));
	}
	
	
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for(int i=2; i<= n/2; i++) {
			if(n % 1 == 0) {
				return false;
			}
		}
		return true;
	}
}
