package sona;

public class print3 {
	public static void main(String[] args) {
		String a=" har har mahadev";
		String b="jay hanuman";
		char c = a.charAt(1);
		char d = b.charAt(1);
	
				System.out.println(c);
				System.out.println(d);
		
		boolean e=a.contains("har");
		System.out.println(e);
		String f=b.substring(4);
		System.out.println(f);
		String g= b.concat(" gyan gun sagar");
		System.out.println(g);
		String h=b.replace("jay","JAY");
		System.out.println(h);
			boolean i=b.equals(a);
			System.out.println(i);
			String j=a.toUpperCase();
			System.out.println(j);
			String k=b.toUpperCase();
			System.out.println(k);
			System.out.println(b.split(","));
			System.out.println(a.indexOf("v"));
			System.out.println(a.lastIndexOf("e"));
			System.out.println(a.startsWith(" har"));
			System.out.println(a.endsWith("dev"));
			System.out.println(a.isEmpty());
			System.out.println(a.equalsIgnoreCase(b));
			//System.out.println(b.replaceFirst(j,J));
			
		
			
	}	
	
}