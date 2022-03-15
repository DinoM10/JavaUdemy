
public class Main {

	public static void main(String[] args) {

		String numberAsString = "2018";
		System.out.println("numberAsString =" + numberAsString);

		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
		
		numberAsString +=1;
		number += 1;
		System.out.println("Number as string " + numberAsString);
		System.out.println("Number " + number);
	}

	
	
}
