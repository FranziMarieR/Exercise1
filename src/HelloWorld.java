import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello ASE2017 - How are you now? :)");
		
		Scanner read = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        HelloUser.userName = read.next();
        read.close();
        
        HelloUser.greetUser();

	}
}
