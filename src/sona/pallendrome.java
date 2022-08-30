package sona;

public class pallendrome {
	public static void main(String[] args) {
		int AN=515;
		int a=AN;
		int rev=0;
		while(a>0)
		{
			int rem=a%10;
			a=a/10;
			rev=rev*10+rem;
			
		}
		if(rev==AN)
		{
			System.out.println("pallendrome");
		}
		else
		{
			System.out.println("not pallendrome");
		}
	}

}
