package devang;

public class hcfandlcm_practice {
	public static void main(String[] args) {
		
	
	int a=164;
	int b=144;
	int max=Math.max(a,b);
	int lcm;
	 for(int i=1;i<=max;i++) 
		 if(a%i==0 && b%i==0) {
			 
			 lcm=(a*b)/i;
				 
			 {
			 System.out.println(lcm);
			 }
		 }
		 
	 }
}

