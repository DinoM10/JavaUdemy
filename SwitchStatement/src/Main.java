
public class Main {

	public static void main(String[] args) {
			
		int switchValue = 3;
		
		switch(switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		
		case 2:
			System.out.println("Value was 2");
			break;
		case 3:case4:case5:
			System.out.println("was a 3, 4 ot 5");
			break;
		
		default:
			System.out.println("Was not 1 or 2");
		}
		char charValue = 'A';
		
		switch(charValue) {
		case 'A':
			System.out.println("A");
			break;
		
		case 'B':
			System.out.println("B");
			break;
		case 'C':case'D':case'E':
			System.out.println("C , D, E");
			break;
		
		default:
			System.out.println("Not found");
		}
		
		String month = "January";
		switch(month){
		case "January":
			System.out.println("January");
			break;
		case "June":
			System.out.println("June");
			break;
			default:
			System.out.println("Not sure");
		}
	}

}
