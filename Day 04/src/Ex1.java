/**
 * 
 */

/**
 * @author udhayaranjani
 *
 */
public class Ex1 {
	int x;
	double y;
	float z;
	
}

class Test{
	public static void main(String[]args) {
		Ex1 obj = new Ex1();
	    System.out.println("Deafault int:" + obj.x);
	    System.out.println("Deafault double:" + obj.y);
	    System.out.println("Deafault float:" + obj.z);
		obj.x = 40;
		obj.y= 50.00;
		obj.z = 60;
		System.out.println("Updated int:" + obj.x);
		System.out.println("Updated double:" + obj.y);
		System.out.println("Updated float:" + obj.z);
	}
}
