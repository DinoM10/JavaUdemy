
public class Main {

	public static void main(String[] args) {
		System.out.println(area(-5));
		System.out.println(area(5.0,4.0));
	}
	
	public static double area(double radius) {
		if(radius < 0)  {
			System.out.println("Invalid value");
			return -1.0;
		}
		double rjesenje = (radius * radius * Math.PI);
		return rjesenje;
		
		
	}
	public static double area(double x, double y) {
	if((x < 0)||(y < 0)) {
		System.out.println("Invalid value");
		return -1.0;
     	
		}
	double rjesenje =(x*y);
	return rjesenje;
}
}