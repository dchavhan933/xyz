package objects;

public class CLASSC extends CLASSB{
	public void method5() {
		System.out.println("method5");
	}
	public static void main(String[] args) {
		CLASSC xyz= new CLASSC();
		xyz.method1();
		xyz.method2();
		xyz.method3();
		xyz.method4();
		xyz.method5();
		System.out.println(xyz.b);
		System.out.println(xyz.a);
	}

}
