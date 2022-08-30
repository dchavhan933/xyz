package objects;

public class nonprimitive1 {
	public static void main(String[] args) {
		String a ="velocity";//0,1,2,3,4,5,6,7
				String b ="devang";
				char c= a.charAt(0);
				System.out.println(c);
				boolean d = b.contains("deva");
						System.out.println(d);
						boolean e = a.equals(b);
						System.out.println(e);
						boolean f =a.equalsIgnoreCase(b);
						System.out.println(f);
						String u =a.toUpperCase();
						System.out.println(u);
						String v =a.toLowerCase();
						System.out.println(v);
						System.out.println(b);// string is immutable
						String w=b.concat("sonam");
						System.out.println(w);
						String x =a.substring(5);
						System.out.println(x);
						String y =a.replace('c','C');
						System.out.println(y);
						String z =a.substring(0,4);
						System.out.println(z);
						//String ss =a.valueOf(c)
						//String z =a.toCharArray();
						//System.out.println(ss);		
	}

}
