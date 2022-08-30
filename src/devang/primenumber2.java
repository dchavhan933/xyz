package devang;

public class primenumber2 {
	 static public void main(String[]args) {
		int num=2;
		int temp=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) 
			{
				temp=temp+1;
			}
		}
		if (temp==0) 
		{
			System.out.println("given number is prime number");
		}
		else
		{
			System.out.println("given number is not prime number");
		}
	}
}
