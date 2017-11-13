import java.util.Scanner;

public class Average {
	
	public static double averageNumber(double x, double y) {
		
		return (x + y) / (2);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		System.out.println("The average of the two numbers is: " + averageNumber(x,y));
	}

}