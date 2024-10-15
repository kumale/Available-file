
public class Factorial1 {
	public static void factorial(int n) {
		int num=1;
	    for(int i=1;i<=n;i++) {
	    	num=num*i;
	    	
	    }
	    System.out.println(num  + " is factorial");
	}

	public static void main(String[] args) {
		factorial(7);  
			}

}
