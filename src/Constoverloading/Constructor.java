package Constoverloading;

public class Constructor {
public Constructor()
{
	System.out.println("Constructor Running");
}
public Constructor(int a)
{
	System.out.println("Constructor running"+a);
}
public static void main(String[] args) {
	Constructor cd=new Constructor();
	Constructor cd1=new Constructor(5);
}
}