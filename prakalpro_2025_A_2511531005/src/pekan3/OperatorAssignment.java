package pekan3;

import java.util.Scanner;

public class OperatorAssignment {

	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("input angka-1:");
		A1 = keyboard.nextInt();
		System.out.println("input angka-2:");
		A2 = keyboard.nextInt();
		System.out.println("assignment penambahan ");
		A1 += A2 ;
		System.out.println("penambahan : "+ A1);
		System.out.println("assignment pengurangan ");
		A1 -= A2 ;
		System.out.println("pengurangan : "+ A1);
		System.out.println("assignment perkalian ");
		A1 *= A2 ;
		System.out.println("perkalian : "+ A1);
		System.out.println("assignment hasil bagi ");
		A1 /= A2 ;
		System.out.println("hasil bagi : "+ A1);
		System.out.println("assignment sisa bagi ");
		A1 %= A2 ;
		System.out.println("sisa bagi : "+ A1);
		
		
		
		
		
		
	}

}
