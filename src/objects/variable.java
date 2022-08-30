package objects;

public class variable {
	int a=55;
	static int b = 56;
	public void test(){	// non static method
	System.out.println(a);
	System.out.println(b);
	}
	public static void demo(){
		System.out.print(b);	
	}
	public static void main(String[]args) {
		variable obj = new variable();
		System.out.println(obj.a);
		obj.test();
		System.out.println(b);
	}
}
