package pekan3;
import java.util.Scanner;
public class hitungvolume {

	public static void main(String[] args) {
		int a; // alas segitiga
		int ts; //tinggi segitiga
		int tp; // tinggi prisma
		int hasil;
		int pembagi = 2; 
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("input alas segitiga :");
		a = keyboard.nextInt();
		System.out.println("input tinggi segitiga :");
		ts = keyboard.nextInt();
		System.out.println("input tinggi prisma : ");
		tp = keyboard.nextInt();
		keyboard.close();
		
		hasil = (a*ts)/pembagi*tp; // rumus prisma = alas * tinggi segitiga / 2 * tinggi prisma
		
		System.out.println("hasil = " + hasil);
	}

}
