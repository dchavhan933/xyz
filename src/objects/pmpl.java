package objects;

public class pmpl {         //public class object can be created throughout the project
	int b =20;              //default can be accessed within the package
	protected int c=40;
	private int d= 60;
	public void test() {
		System.out.println("public method");
	}
	void demo() {              //default can be accessed within the package
		System.out.println(" i am default access specifier");
	}
	protected void sample () {          //can be access within package ,but to access outside package need inheritance
		System.out.println("i am protected");
	}
	private void personal() {              // can be access only within the class
		System.out.println("i am private");
	}
	public static void main(String[] args) {
		pmpl obj = new pmpl();
		obj.personal();
		obj.sample();
		obj.test();
		obj.demo();
		System.out.println(obj.d);
		System.out.println(obj.c);
		System.out.println(obj.b);
	}

}
