package objects;

public class mainmethodovrloading {
public static void main(int a) {
	System.out.println(a);
}
public static void main(int a,int b) {
	System.out.println(a+b);	
}
public static void main(String s) {
	System.out.println(s);	
}
public static void main(String[] args) {
	main(5);
	main("devang");
	main(5,2);
	
} 
}