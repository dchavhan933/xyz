package objects;

public class overloading {
void show (int a){
	System.out.println(a);
}
	void show(int...a) 
	{
	System.out.println("a*");
	}
	public static void main(String[]args) {
		overloading t= new overloading();
		t.show(1,2,3,4,6,5,9,8,7);
		
	}
}