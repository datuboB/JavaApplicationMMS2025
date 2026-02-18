import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("please enter your full name : ");
		String fullName = scan.nextLine();
		
		System.out.printf("Enter your address: ");
		String address = scan.nextLine();
		
		System.out.print("enter your age: ");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.printf("Hello %s ,How are you today?",fullName);
		System.out.printf("nice meeting you , you are living in %n",address);
		System.out.printf("%s you are %d years old",fullName,age);
		
	}
}