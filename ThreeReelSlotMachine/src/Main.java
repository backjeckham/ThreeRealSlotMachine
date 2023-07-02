import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		SlotMachine slotMachine = new SlotMachine();
		Scanner scanner = new Scanner(System.in);
		String choice = "y";
		String userChoice;
		double betSize;
				
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("\nWelcome to my slot machine, your balance is : " + slotMachine.getBalance() + ", type spin to gamble or stop to exit.");
			userChoice = scanner.nextLine();
			
			if (userChoice.equalsIgnoreCase("spin")) {
				System.out.println("What amount would you like to bet?");
				betSize = Double.parseDouble(scanner.nextLine());
				slotMachine.spin(betSize);
				slotMachine.checkWin(betSize);
				
			} else if (userChoice.equalsIgnoreCase("stop")) {
				choice = "n";
			}
		}
		System.out.println("Bye!");
		scanner.close();		
	}
}
