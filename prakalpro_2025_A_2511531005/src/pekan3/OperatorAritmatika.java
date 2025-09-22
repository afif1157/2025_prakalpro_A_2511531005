package pekan3;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int  hasil;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.println("input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("operator penjumkahan");
		hasil = A1 + A2 ;
		System.out.println("hasil = " + hasil );
		System.out.println("operator pengurangan");
		hasil = A1 - A2 ;
		System.out.println("hasil = " + hasil );
		System.out.println("operator perkalian");
		hasil = A1 * A2 ;
		System.out.println("hasil = " + hasil );
		System.out.println("operator hasil bagi");
		hasil = A1 / A2 ;
		System.out.println("hasil = " + hasil );
		System.out.println("operator sisa bagi");
		hasil = A1 % A2 ;
		System.out.println("hasil = " + hasil );

	}

}
