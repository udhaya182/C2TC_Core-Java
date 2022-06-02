/**
 * 
 */

/**
 * @author udhayaranjani
 *
 */
public class Ex2 {
	char c;
	String s;
	public static void main (String args[]) {
		Ex2 Obj1 = new Ex2();
		Ex2 Obj2 = new Ex2();
        System.out.println("Default char:"+ Obj1.c);
        System.out.println("Default String:"+ Obj1.s);
        Obj1.c= 'd';
        Obj2.s = "hello";
        System.out.println("Updated char:"+ Obj1.c);
        System.out.println("Updated char:"+ Obj1.s);
        
	}
	

}
