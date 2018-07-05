import java.util.Random;
import java.util.Scanner;
 
public class DiceGame{
 
    public static void main(String[] args) {
	System.out.print("What is your name?\n> ");

	Scanner scan = new Scanner(System.in);

	String name = scan.next();

	System.out.println("Hello, "+name+"!");
	
        Random rand = new Random();
	System.out.println("Rolling the dice...");
	
        int d1 = rand.nextInt(6) % 6 + 1;
	int d2 = rand.nextInt(6) % 6 + 1;
        System.out.println("Die 1: "+d1);
	System.out.println("Die 2: "+d2);
	int sum = d1+d2;
	System.out.println("Total value: "+sum);

	if(sum > 7) System.out.println("You won!");
	else System.out.println("You lost");
	
    }
 
}
