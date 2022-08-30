package sona;

public class febonacciseries {
public static void main(String[] args) {
	int b=0;
	int a=1;
	int c=0;
	for(int i=1;i<=10;i++) {
	c=a+b;
	System.out.println(c);
   a=b;
   b=c;
	}
	
	
	
}
}


