package objects;

public class obj1 {
public void triangle()//method declaration
{for(int i=1;i<=5;i++)//
{
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
}
}

public void reverseTriangle() {
	for(int i=1;i<=5;i++) {
		System.out.print("*");
	}
	System.out.println();
}

public static void main(String[]args) 
{
	obj1 devang = new obj1();
	devang.triangle();
	devang.triangle();
	devang.triangle();

}
}