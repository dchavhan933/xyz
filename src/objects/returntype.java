package objects;

public class returntype {
public void test() {
	int c=10+30;
	System.out.println(c);
}
public int addition() {
	int d=40+30;
	System.out.println(d);
	return d;
}
	public static returntype demo() {
		returntype abc=new returntype();
		abc.test();
		return abc;
}
	public static void main(String[] args) {
		returntype obj=returntype.demo();
		obj.addition();
	
}
}