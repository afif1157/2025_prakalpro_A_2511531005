package pekan7_2511531005;

import java.util.Scanner;

public class PangggilMahasiswa2_2511531005 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("nim : ");
		String x = input.nextLine();
		System.out.println("nama :");
		String y = input.nextLine();
		Mahasiswa_2511531005 a = new Mahasiswa_2511531005();
		a.setNim2(x);
		a.setNama(y);
		if (x.startsWith("25")) {
			System.out.println(y+ " anda angkatan 2025");
			
		}
		if ( x.contains("1153")) {
			System.out.println("anda mahasiswa informataika");
		}
		a.Cetak2();
		input.close();

	}
	}


