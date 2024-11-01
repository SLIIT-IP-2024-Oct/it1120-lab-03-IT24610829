import java.util.Scanner;

public class IT24610829Lab3Q3{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the Rupee amout: ");
		int amount= input.nextInt();

		int remain,No_5000,No_1000,No_500,No_200,No_100,No_50,No_20,No_10,No_5,No_2,No_1;

		No_5000 = amount/5000;
		amount = amount%5000;
		System.out.println("5000 Notes - "+No_5000);

		No_1000 = amount/1000;
		amount = amount%1000;
		System.out.println("1000 Notes - "+No_1000);

		No_500 = amount/500;
		amount = amount%500;
		System.out.println("500 Notes - "+No_500);

		No_200 = amount/200;
		amount = amount%200;
		System.out.println("200 Notes - "+No_200);

		No_100 = amount/100;
		amount = amount%5000;
		System.out.println("100 Notes - "+No_100);

		No_50 = amount/50;
		amount = amount%5000;
		System.out.println("50 Notes - "+No_50);

		No_20 = amount/20;
		amount = amount%5000;
		System.out.println("20 Notes - "+No_20);

		No_10 = amount/10;
		amount = amount%5000;
		System.out.println("10 Coins - "+No_10);

		No_5 = amount/5;
		amount = amount%5000;
		System.out.println("5 Coins - "+No_5);

		No_2 = amount/2;
		amount = amount%5000;
		System.out.println("2 Coins - "+No_2);

		No_1 = amount/1;
		amount = amount%1;
		System.out.println("1 Coins - "+No_1);
		
		}
}