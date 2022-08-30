package objects;

public class nonprimitive4 {
public static void main(String[] args) {
	String a[]= {"devang","sonam","chavhan","dev"};
	for(int j=0;j<a.length;j++) {
		String v=a[j];//when j=0(devang),
		//int c= value.length();
		for (int i=v.length()-1;i>=0;i--) {//gnaved
			System.out.print(v.charAt(i));
		}
		System.out.println();
}
}
}