import java.util.Scanner;

public class IT24610829Lab3Q2{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the monthly salary: ");
		double mon_sal= input.nextDouble();

		System.out.println("Enter the number of OT hours:");
		double OT_h= input.nextDouble();

		System.out.println("Enter the OT hourly rate: ");
		double OT_rate = input.nextDouble();

		double OT_amout = OT_h * OT_rate ;

		double tot_sal = mon_sal + OT_amout;

		System.out.println("The total salary including OT is: "+tot_sal);

		}
}