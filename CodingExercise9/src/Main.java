
public class Main {

	public static void main(String[] args) {
		printYearsAndDays(5612662L);
	}

	public static void printYearsAndDays(long minutes) {
		if(minutes < 0) {
			System.out.println("Invalid value");
		}
		
		long hours = minutes / 60;
		long days = hours /24;

		long years = days/365;
		
		long remainingDays =days % 365;

		System.out.println(years +" godina i "+ remainingDays +" dana");
	}
}
