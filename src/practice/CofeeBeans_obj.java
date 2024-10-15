package practice;

public class CofeeBeans_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CofeeBeans c1=new CofeeBeans();
		Sugar s1=new Sugar();
		Milk m1=new Milk();
		
		c1.Brand="Amul";
		c1.price=100;
		
		s1.taste="Yummy";
	
		
		m1.Pname="Gokul";
		m1.price=125;
		
		c1.show();
		s1.show();
		m1.show();
		
		

	}

}
