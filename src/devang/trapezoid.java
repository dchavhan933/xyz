package devang;

public class trapezoid {
public static void main (String[]args) {
	for (int i=1;i<=15;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=30;k>=i;k--) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
