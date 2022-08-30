package sona;

public class oddeven {
	public static void main(String[] args) {
		int []a = {2,3,4,5,6,7,8,9,10,11,13,15,16};
		int s=a.length;
		int even=0;
		int odd=0;
		for(int i=s-1;i>=0;i--) 
			if(i%2==0) {
				even++;
			}
			else 
			{
				odd++;
			}
				System.out.println("even:"+even);
				System.out.println("odd:"+odd);
			}
		}


