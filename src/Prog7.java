import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.printf("Enter the Number : ");
		num = input.nextInt();
		switch (num % 2)
		{
			case 0:
				System.out.printf("This is a Even Number");
				break;
 
			case 1:
				System.out.printf("This is a Odd Number");
				break;
		}

	}

}
