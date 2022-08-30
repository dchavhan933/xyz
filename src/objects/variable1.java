package objects;

public class variable1 {
public void test() {
	int n =20;//local variable
System.out.println("n");
}
public static void demo() {
	System.out.println("my name is devang");
}
public static void main(String[] args) {
	pmpl obj = new pmpl();
	obj.test();//public method
	System.out.println(obj.b);
	obj.demo();
	System.out.println(obj.c);
	obj.sample();
	System.out.println("i am protected");
	variable1 abc= new variable1();
			abc.demo();
			abc.test();
			
			
			

}
}