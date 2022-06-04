/**
 * 
 */

/**
 * @author udhayaranjani
 *
 */
public class ObjectReference{
	String name;
	public static void main (String[]args) {
		ObjectReference obj1 = new ObjectReference();
		obj1.name = "MSD";
		ObjectReference obj2 = obj1;
		obj1 = null;
		System.out.println(obj2.name);
		
		/* new ObjectReference(); // Object is created 
		 *ObjectReference obj3; // reference is created separately 
		 *obj3.name = "MSD";
		 *System.out.println(obj3.name);
		 *Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	     *The local variable obj3 may not have been initialized
	     *The local variable obj3 may not have been initialized
	     *at ObjectReference.main(ObjectReference.java:19)
		 */
		
		/* System.out.println(obj1.name); Exception in thread "main" java.lang.NullPointerException: 
		 * Cannot read field "name" because "obj1" is null
		 * at ObjectReference.main(ObjectReference.java:26)
		 */
		
		
		
		
	}
}