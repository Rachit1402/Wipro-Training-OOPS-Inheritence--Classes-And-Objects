import java.util.*;
	class Patient{
		String patientName;
		double height;
		double weight;
		
		public Patient(String patientName, double height, double weight) {
			super();
			this.patientName = patientName;
			this.height = height;
			this.weight = weight;
		}
		public double CalculateBMI(){
			return (100*100*weight / (height*height));
			
			//100*100 so as to convert the height to meter from centimeter
		}
	}
public class Assignment3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		// TODO Auto-generated method stubScanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the patient's name: ");
		String patientName = scan.next();
		System.out.println("Enter the height(in cm): ");
		Double height = scan.nextDouble();
		System.out.println("Enter the weight: ");
		Double weight = scan.nextDouble();
		Patient patient = new Patient(patientName, height, weight);
		System.out.println(patient.CalculateBMI());
	}
}
