package devang;

public class vowels {
	public static void main(String[] args) {
		String s="velocity is good class";
	 int count=0;
      int len=s.length();
     for(int i=0;i<=len-1;i++) {
    	 char ch=s.charAt(i);
    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    		 count++;
    	 }
     }
	System.out.println("vowels:"+count);
	}

}
