import java.util.Scanner;
import java.lang.*;
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int i=1,sum;
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		double j,k;int total;
		j=Math.floor(num1/num2);
		System.out.println(j);
		k=Math.floor(num3/num4);
		System.out.println(k);
		total=(int) (j+k);
		System.out.println(total);
		
	}

}
