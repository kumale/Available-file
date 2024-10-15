package inheritance;

public class Father1 {
	public String surname;
	public void display() {
		System.out.println("Parent method");
	}
    public Father1() {
    	System.out.println("Parent non -par");
    }
    public Father1(String str) {
    	System.out.println("Parent para cc");
    	surname=str;
    }
}
