import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) {
           sum=sum+i;
			}
		}
		
		System.out.println(sum);
	}
	

}
