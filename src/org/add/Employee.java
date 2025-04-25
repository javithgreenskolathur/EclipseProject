package org.add;

public class Employee {
	
	private Employee() {
		// TODO Auto-generated constructor stub
	}

//	instance to static  --> static wont allow the instance
	static Employee obj;

	private static Employee getObject() {
//		== - compare
//			null==null-t
//			null==null -t ==>1st
//			object==null-f =>2nd
		if (obj == null) {

			int id1 = System.identityHashCode(obj);
			System.out.println(id1);

//			a=10;
			obj = new Employee();

			int id2 = System.identityHashCode(obj);
			System.out.println(id2);

		}
		return obj;// object

	}


	private void add2() {
		System.out.println("Greens");
	}

	public static void main(String[] args) {
		getObject();

		Employee object = getObject();
		System.out.println(System.identityHashCode(object));
		
		getObject().add2();
		
	}

}