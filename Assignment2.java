import java.util.*;
class Calculator{
	public static int powerInt(int num1, int num2)
	{
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, int num2)
	{
		return Math.pow(num1, num2);
	}
}
public class Assignment2 {
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		Calculator calc = new Calculator();
		System.out.println(Calculator.powerInt((int)num1, num2));
		System.out.println(Calculator.powerDouble(num1, num2));
	}
}
