package objects;

public class userdefined {
int a=55;
static int b = 56;
public void test(){	// non static method
System.out.println(" i am non static method");
}
	public static void demo(){
		System.out.print("i am static method");	
	}
	public static void main(String[]args) {
		userdefined.demo();// static element can be called with class name
		
		// userdefined.test();//non static need object
		
		System.out.println(userdefined.b);
		
		userdefined ob = new userdefined();
		ob.test();
		System.out.println(ob.a);
	}
}
