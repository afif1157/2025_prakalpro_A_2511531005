package Pekan6_2511531005;

import java.util.Scanner;

public class doWhile1_2511531005 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		String pharase;
		do {
			System.out.println("input password : ");
			pharase = console.next();
		}while ( !pharase.equals("abcd"));

	}

}
