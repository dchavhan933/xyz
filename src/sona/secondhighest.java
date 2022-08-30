package sona;

public class secondhighest {
	public static void main(String[] args) {
     int temp;
     int[] a = {6,8,9,4,3,2,1};
for(int i=0;i<a.length;i++)
{
	for(int j=(i+1);j<a.length;j++) 
	{
		if(a[i]>a[j]) 
		{
			temp=a[i];//6
			a[i]=a[j];//6=4
			a[j]=temp;//4=0index
		}
		
	}
}
System.out.println("second smallest number is "+a[1]);
}
}