import java.util.Scanner;

public class MainScreen {
	
	public static void main(String[] args)
	{
		System.out.println("Hello there!");
		System.out.println("Input Username!");
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		System.out.println("Input Password!");
		Scanner scan2 = new Scanner(System.in);
		String passwd = scan2.nextLine();
		
		//System.out.println("Username:" + username);
		//System.out.println("Password:" + passwd);
		
		if (username.equals("Darren") && passwd.equals("Liang"))
		{
			System.out.println("Welcome home boss!");
			System.out.println("Alright! Let's get started!");
		}
		else
		{
			System.out.println("Wrong Pass or User!");
		}
		
		
	}
	
	

}
