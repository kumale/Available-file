import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(i=1;i<=num;i++) {
			if(i%2==0) {
				//System.out.println("Number is divisible by 2");
				sum=sum+i;
			}		
				
			}
			System.out.println(sum);
		}

	}


