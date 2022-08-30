 package devang;

public class countthe_chracteroccurances {
public static void main(String[] args) {
	String str="devang  ravindra chavhan";
	int counttotal=str.length();
	int totalcount_afterremove=str.replace("n","").length();
	int count=counttotal-totalcount_afterremove;
	System.out.println("count max occurances="+count);
}
}
