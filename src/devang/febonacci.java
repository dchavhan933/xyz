package devang;

public class febonacci {
	public static void main(String[] args) {
		
	int a=0;//0,1,1,2,3,5,8,13
	int b=1;
    int c=0;
    for(int i=0;i<=10;i++) {
	c=a+b;//c=0+1=1
	System.out.println(c);
	a=b;
	b=c;
	}	
	}
}
