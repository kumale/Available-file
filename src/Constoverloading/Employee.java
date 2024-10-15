package Constoverloading;

public class Employee {
private int id;
private String name;
private String degs;
private float salary;
private String address;
private boolean marrid;
private long phone;
public void setId(int i) {
	id=i;
}
public int getId() {
return id;
}
public void setname(String n) {
	name=n;
	
}
public String getname() {
	return name;
}
public void setdegs(String d) {
	degs=d;
}
public String getdegs() {
	return degs;
}
public void setsalary(double d) {
	salary=(float) d;
}
public float getsalary() {
	return salary;
}
public void setaddress(String a) {
	address =a;
}
public String getaddress() {
	return address;
	
}
public void setmarrid(boolean m) {
	marrid=m;
}
public boolean getmarrid() {
	return marrid;
}
public void setmarrid() {
	boolean m;
	marrid=m;
}
public void setphone(long p) {
	phone=p;
}
public long getphone() {
	return phone;
}
	

	
	
	
	
}

}
