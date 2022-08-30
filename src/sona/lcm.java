package sona;

public class lcm {
public static void main(String[] args) {
	int a=24;
	int b=12;
	int lcm;
	int max= Math.max(a, b); 
	for(int i=2;i<=max;i++) 
		if(a%i==0 && b%i==0)
		{
	lcm=(a*b)/i;
	{
		System.out.println(lcm);
	}
}
}
}
