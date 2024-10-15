package Constoverloading;

public class Employeemain {
public static void main(String[]args) {
	Employee e1=new Employee();
	e1.setId(5);
	e1.setname("Aj");
	e1.setaddress("Pune");
	e1.setdegs("Emp");
	e1.setsalary(50000.00);
	e1.setMarrid(true);
	e1.setphone(9146948831); 
	
	System.out.println(e1.getId());
	System.out.println(e1.getname());
	System.out.println(e1.getaddress());
	System.out.println(e1.getDegs());
	System.out.println(e1.getSalary());
	System.out.println(e1.getMarrid());
	System.out.println(e1.getphone());


}
}
