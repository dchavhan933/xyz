package abstractandinterface;

public interface deva {
	int a=20;// public,static,final by default
	public void test();             //incomplete method
	public static void dev()        //we can't write complete method inside interface
	{
		System.out.println("hello");  //post java8 we can write complete method inside interface
		System.out.println(a);           // variable are default static
		                                 //a=60;//by default final
	}
	public static void main(String[] args) {
		                                 //deva xyz=new deva();// constructor not present in interface
		
	}

}
