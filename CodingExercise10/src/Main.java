
public class Main {

	public static void main(String[] args) {

		printEqual(1,2,3);
	}

	public static void printEqual(int x, int y, int z) {
		if(( x < 0) ||( y < 0) ||(z < 0)) {
			System.out.println("invalid value");
		}
		else if((x == y) && (y == z) &&(z == x)) {
			System.out.println("all numbers are equal");
		}
		else if((x != y) && (y != z) &&(z != x)) {
			System.out.println("all numbers are different");
		} else {
		
		System.out.println("Neither all are equal or different");
		}
	}
	
}
