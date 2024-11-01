import java.util.Scanner;

public class IT24610829Lab3Q1B{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice (Rs.): ");
		double Pr_P1kg = input.nextDouble();

		System.out.println("Enter the number of kilograms you want to buy(kg): ");
		double amount = input.nextDouble();

		double tot_pay;

		tot_pay = Pr_P1kg*amount;

		//beacuse [tot_pay-(tot_pay*0.1)]=tot_pay*0.9
		tot_pay = tot_pay*0.9;

		System.out.println("The total amout with 10% discount is: "+tot_pay);
	}
}