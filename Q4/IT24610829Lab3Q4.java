import java.util.Scanner;
public class IT24610829TLab3Q4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a five-digit number: ");
		int amount = input.nextInt();

		int dig1, dig2, dig3, dig4, dig5;
		dig1 = amount/10000;
		amount = amount%10000;

		dig2 = amount/1000;
		amount = amount%1000;

		dig3 = amount/100;
		amount = amount%100;

		dig4 = amount/10;
		amount = amount%10; 

		dig5 = amount;

		System.out.println(dig1+"\t"+dig2+"\t"+dig3+"\t"+dig4+"\t"+dig5);

	}
}