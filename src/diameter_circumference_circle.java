
public class diameter_circumference_circle {
	public static void diameter(float radius) {
		float diameter= 2*radius;
		System.out.println(diameter);
	}
	

	public static void circumference(float radius) {
		float circumference=3.14*radius;
		System.out.println(circumference);
		// TODO Auto-generated method stub

	}
public static void areaofcircle(float radius) {
	float areaofcircle=3.14*radius*radius;
	System.out.println(areaofcircle);
}
public static void main(String[] args) {
	diameter(3);
	circumference(9);
	areaofcircle(4);
}

}
