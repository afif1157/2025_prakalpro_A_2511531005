package pekan7_2511531005;

public class Akun {
	
	private String username;
	private String email;
	private String password;
	private int pinAngka;
	
	public Akun (String username, String email, String password, int pinAngka) {
		this.username=username;
		this.email=email;
		this.password=password;
		this.pinAngka=pinAngka;
	}
	public String getUsername(){
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public int getPin() {
		return pinAngka;
	}
	public boolean isPasswordValid(String password) {
		return password.length()>=8;
	}
	public boolean isEmailValid(String email) {
		return (email.indexOf("@"))!=-1&& email.indexOf(".")!=-1;
	}
	
}
