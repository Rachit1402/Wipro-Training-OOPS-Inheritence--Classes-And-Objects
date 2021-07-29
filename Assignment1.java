import java.util.*;
class Box{
	private double height;
	private double width;
	private double depth;
	
	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public double getVolume()
	{
		return height*width*depth;
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height: ");
		double height = scan.nextDouble();
		System.out.println("Enter the width: ");
		double width = scan.nextDouble();
		System.out.println("Enter the depth: ");
		double depth = scan.nextDouble();
		Box box = new Box(height,width,depth);
		System.out.println(box.getVolume());}
}