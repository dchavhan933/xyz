package sona;

public class reversestring {
public static void main(String[] args) {
	String a[]= {"java","concept", "of", "the", "day"};
	int b=a.length;
	for(int i=a.length-1;i<=0;i--)
	{
	for(int j=a[0].length()-1;j>=0;j--)
	{
		System.out.print(a[0].charAt(j));
	}
	for(int j=a[1].length()-1;j>=0;j--)
	{
		System.out.print(a[1].charAt(j));
	}
	System.out.println();
	}
}
}
