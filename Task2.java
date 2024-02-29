import java.util.Scanner;

class Task2{
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please type your name:");	
	
	String name = scan.nextLine();
	
	System.out.println("Nice to meet you " + name + " please type your age:");
	
	Scanner scan2 = new Scanner(System.in);
	
	String input2 = scan2.nextLine();
	
	int age = Integer.parseInt(input2);
	
	System.out.println("You are " + age + " years old!");
	
	int yearsToRetire = 67-age;
	
	System.out.println("You can retire in "+ yearsToRetire + " years.");
	
	
	}
}