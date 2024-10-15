
public class areaofTriangle {
	public static float areaofTriangle(float num1,float num2) {
		float area=(float)(0.5*num1*num2);
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base=12.2f;
		float height=23.5f;
		float area=areaofTriangle(base,height);
		System.out.println(area);

	}

}
