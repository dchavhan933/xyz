package devang;

public class primenumber {
public static void main(String[]args) {
	int temp=0;
	for(int i=2;i<=100;i++)
	{
		for(int j=2; j<i;j++) {//10
			if (i%j==0) 
			{                                //remainder=0 not prime number
				temp= temp+1;
			}
		}
		if(temp==0) {
			System.out.println(i);
		}
		else
		{
			temp=0;
		}
	}
}
}
