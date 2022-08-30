package devang;

public class pallendromenumber {
public static void main(String[] args) {
	int AN= 515;//ACTUAL NUMBER
	int a= AN;
	int rev=0;
	while (a>0)
	{
		int remainder=a%10;
		a=a/10;
		rev = rev*10 +remainder;
	}
	if (rev == AN) {
		System.out.println("pallendrome");
	}
	else {
		System.out.println("not pallendrome");
	}
	
}
}
