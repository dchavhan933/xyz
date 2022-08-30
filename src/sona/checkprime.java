package sona;

public class checkprime {
public static void main(String[] args) {
	int i=11;
	int temp=0;
	for(int j=2;j<i;j++)
		if(i%j==0) {
			temp=temp+1;
		}
	if(temp==0) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
}
}
