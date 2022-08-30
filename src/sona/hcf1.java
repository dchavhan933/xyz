package sona;

public class hcf1 {
public static void main(String[] args) {
	int a=12;
	int b=24;
	int max= Math.max(a, b); 
	for(int i=2;i<=max;i++) 
		if(a%i==0 && b%i==0 )
		{
			System.out.println("hcf:"+i);
			
	}
}
}
