package objects;

public class overide2 extends overide {
	public static void dev() {
		System.out.println("sonam");
	}
	public void rrr() {
		System.out.println("method2");
  }
		public static void main(String[]args) {
			overide abc=new overide();
			abc.rrr();
			overide2.dev();
			overide.dev();
			
		
	}

}