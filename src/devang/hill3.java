package devang;

public class hill3 {
	public static void main(String[]args) {
		for (int i=20;i>=1;i--) {
			for (int j=20;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++ )
			{
				System.out.print("$");
			}
			System.out.println();
		}
		
		
	}

}