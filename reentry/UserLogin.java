package reentry;

import java.util.Scanner;

interface Login{
	public void authentication(String user, String password);
}
public class UserLogin implements Login {
	public void authentication(String user, String password) {
		if(user.equals("Abirami")&& password.equals("Abik@2004")) {
			System.out.println("Login success");
		}
		else {
			System.out.println("Login failed");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=sc.nextLine();
		System.out.println("Enter the password");
		String pass=sc.nextLine();
		UserLogin a=new UserLogin();
		a.authentication(name, pass);
	}
}
