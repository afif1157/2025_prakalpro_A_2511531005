package Pekan6_2511531005;

import java.util.*;
public class tugasPekan6_2511531005 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner input = new Scanner (System.in);
		
		int count = 0;
		boolean status = false;
		String pilihan = "ya";
		
		while(pilihan.equalsIgnoreCase("ya")) {
			int n1 = rand.nextInt(6)+1;
			int n2 = rand.nextInt(6)+1;
			count++;
			int hasil = n1+n2;
			System.out.println(n1+"+"+ n2+ "="+ hasil );
			if (hasil ==7) {
				status = true;
				break;
			}else {
				System.out.println("tebakan anda salah ");
				System.out.println("apakah mau lempar dadu (ya/tidak)?");
				pilihan=input.next();
			}
		}
		if (status) {
            System.out.println("Tebakan Anda Benar");
            System.out.println("Anda menang setelah " + count + " percobaan");
        } else {
            System.out.println("Anda gagal menang");
        }
	}

}
