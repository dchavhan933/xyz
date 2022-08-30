package devang;

public class reverser_string_eachword {
	public static void main(String[] args) {
		String str="Java Concept Of The Day";
		String [] spl=str.split(" ");
		String reversestring="";
	
		for(String w:spl) {
			String reversewords="";
			for(int i=w.length()-1;i>=0;i--) {
				reversewords=reversewords+w.charAt(i);
			}
			reversestring=reversestring+reversewords+" ";
		}
          System.out.println(reversestring);
}
}