package devang;

public class hcf {
	public static void main(String[] args) {
		int a=82;
		int b=162;
		for(int i=2;i<=b;i++) {
			//for(int j=1;j<= a;j++)
			if(a%i==0 && b%i==0)
			{
				System.out.println(i);
			}
			//144=1*2*2*2*2*3*3
			//200=1*2*2*2*5*5
		}//hcf=2*2*2=8
		
	}

}
