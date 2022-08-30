package devang;

import java.util.Arrays;

public class sorting_of_Array {
public static void main(String[] args) {
	int a[]= {9,8,3,2,1,6,7,4,10,5};
	int dev;
	int b=a.length;
	for(int i=0;i<b-1;i++) {
		for(int j=0;j<b-1;j++) 
		{
			if(a[j]<a[j+1]) 
			{
			dev=a[j];
			a[j]=a[j+1];
			a[j+1]=dev;
				
			}
	}
}
	System.out.println("arrays after sorting="+Arrays.toString(a));
}
}