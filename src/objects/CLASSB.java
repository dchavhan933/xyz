package objects;

public class CLASSB extends CLASSA{
	public void method4() {
		System.out.println("method4");
	}
	public static void main(String[] args) {
		CLASSB abc= new CLASSB();
		abc.method1();
		abc.method2();
		abc.method3();
		abc.method4();
		System.out.println(abc.b);
		System.out.println(abc.a);
	}

}
