package sona;

public class userdefine1{
	int a =50;
	static int b = 30;
	static public void sona(){
	System.out.println("i m static");
	}
	public void sonam(){
	System.out.println(" i am non static");
	}
	public static void main(String[]args){
	userdefine1.sona();
	System.out.println(userdefine1.b);
	userdefine1 abc =new userdefine1();
	abc.sonam();
	}
}
