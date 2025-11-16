package pekan7_2511531005;

import java.util.Scanner;

public class tugasAlproPekan7_2511531005 {

	public static void main(String[] args) {
	
		String username;
		String email;
		String password;
		int pin;
		
		Scanner input = new Scanner(System.in);
		System.out.println("===== REGISTRASI AKUN BARU =====");
		System.out.println("Masukkan Username : ");
		username= input.nextLine();
		System.out.println("Masukkan Email : ");
		email = input.nextLine();
		System.out.println("Masukkan Password : ");
		password = input.nextLine();
		System.out.println("Masukkan Pin(6 Angka) : ");
		pin = input.nextInt();
		
		Akun Akun = new  Akun (username, email,  password, pin ) ;
		
		boolean ValidasiEmail = Akun.isEmailValid(email);
		boolean ValidasiPassword = Akun.isPasswordValid(password);
		
		if (ValidasiEmail && ValidasiPassword) {
			System.out.println("----REGISTRASI BERHASIL----");
			System.out.println("Untuk Akun "+username+" berhasil dibuat");
			System.out.println();
			System.out.println("---Detail Akun---");
			System.out.println("Username(Lowercase) : "+Akun.getUsername().toLowerCase());
			System.out.println("Email(Uppercase) : "+Akun.getEmail().toUpperCase());
			System.out.println("ID Pengguna (Gabungan) : "+Akun.getUsername().concat(String.valueOf(Akun.getPin())));
			System.out.println();
			System.out.println("---Uji Tipe Data (Pin Anda : " +Akun.getPin()+")---");

			System.out.println("PIN (int)+10 : "+(Akun.getPin()+10));
			System.out.println("PIN (string)+\"10\" : " +String.valueOf(Akun.getPin())+"10");
		}else if (!ValidasiEmail && !ValidasiPassword){
			System.out.println("---REGISTRASI GAGAL---");
			System.out.println("Email "+Akun.getEmail()+"dan pasword "+Akun.getPassword()+"anda tidak valid (Email harus mengandung '@' dan '.' dan Password arus mengandung 8 karakter atau lebih) ");
			System.out.println("Silahkan coba lagi"); 
		}else if(!ValidasiEmail) {
				System.out.println("---REGISTRASI GAGAL---");
				System.out.println("Email anda "+Akun.getEmail()+"tidak valid(harus mengandung '@' dan '.' ");
				System.out.println("Silahkan coba lagi");
		}else if (!ValidasiPassword) {
				System.out.println("---REGISTRASI GAGAL---");
				System.out.println("Password anda "+Akun.getPassword()+" tidak valid(harus mengandung 8 karakter atau lebih)");
				System.out.println("Silahkan coba lagi");
			}
		}		
	}


