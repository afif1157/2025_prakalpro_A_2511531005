package pekan2;
import java.util.Scanner;
public class tugasAlproPekan2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// input dari pengguna
		System.out.println("Masukkan NIM:");
		String nim = scanner.nextLine();
		
		System.out.println("Masukkan Nama:");
		String nama = scanner.nextLine();
		
		System.out.println("Masukkan Umur: ");
		int umur = scanner.nextInt();
		
		System.out.println("Masukkan IPK: ");
        double ipk = scanner.nextDouble();
		
		// konversi umur menjadi String
		String umurStr = String.valueOf(umur);
		String ipkStr = String.valueOf(ipk);
		
		// konversi NIM menjadi Long, lalu tambahkan dengan umur 
		long nimlong = Long.parseLong(nim);
		long hasilPenjumlahan = nimlong + umur ;
		
		// cetak hasil
		System.out.println("\n=== Data Mahasiswa ===");
		System.out.println("NIM	:"+ nim );
		System.out.println("Nama	:"+ nama);
		System.out.println("Umur 	:"+ umur);
		System.out.println("IPK 	:" + ipk);
		System.out.println();
		System.out.println("Umur (string) 	:"+ umurStr);
		System.out.println("NIM + Umur 	:" + hasilPenjumlahan);
		
		

	}

}
