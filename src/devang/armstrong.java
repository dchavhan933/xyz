package devang;

public class armstrong {
public static void main(String[] args) {
	int arm=371;
	int a=arm;
	int sum=0;
	while(a>0){
	int remainder=a%10;
	a=a/10;
	sum=sum+remainder*remainder*remainder;
	}
	if(sum==arm) {
		System.out.println("armstrong number");
	}
	else {
		System.out.println("not armstrong");
	}
}
}
