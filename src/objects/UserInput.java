package objects;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter name");
		String s=sc.nextLine();
		System.out.println("welcome:"+s);
		System.out.println("plz insert pin");
		int pin=sc.nextInt();
		System.out.println(pin);
		if(pin==9527)
		{
			System.out.println("plz enter amount");
			int amount=sc.nextInt();
			System.out.println(amount);
			System.out.println("plz collect ur cash");
		}
		else {
			System.out.println("plz enter correct pin");
		}
		
	}

}
