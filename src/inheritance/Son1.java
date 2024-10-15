package inheritance;

public class Son1 extends Father1{
	public String job;
	public void show() {
		super.surname="Shastri";
		super.display();
	}
	public Son1() {
		super("Pandit");
	}

}
