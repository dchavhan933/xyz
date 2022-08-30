package objects;

public class constructor {
public int b = 20;// global variable access within package also through out project
int x;
String c;
  constructor(){
System.out.println("zero argument");
}
 public constructor(int a){
	System.out.println(a);
}
 constructor(int x, String c){
	System.out.println(x+c);
	//this.x=x;
	//this.c=c;
}
constructor(String a){	
}
public void test() {
	System.out.println("hello all");
}
static void dev() {
	System.out.println("devang");
}
public static void main(String[] args) {
	constructor obj5= new constructor();
	obj5.test();
	System.out.println(obj5.b);
	obj5.test();
	constructor obj8= new constructor(8,"dd");
}
}

