import java.util.Random;

public class SlotMachine {
	

	
	private double balance = 100;
	private double betSize;
	private double winAmount;
	String [] reel = {" ", " ", " "};
	String [] possibleSymbols = {"Q", "K", "BAR", "$", "❤", "7"};
	Random generator = new Random();
	
	public SlotMachine () {
		
	}
	
	
	
	public String[] spin(double betSize) {
		setBetSize(betSize);
		
		if (balance > betSize) {
			setBalance(getBalance() - getBetSize());
			
			for (int i = 0; i < reel.length; i++) {
	            int randomIndex = generator.nextInt(possibleSymbols.length);
	            reel[i] = possibleSymbols[randomIndex];
	            System.out.print("[" + " " + reel[i] + " " + "]");
			}		
		}		
		return reel;
	}
	
	
	public double checkWin(double betSize) {
		
		if (reel[0].equals("Q") && reel[1].equals("Q") && reel[2].equals("Q")) {
			winAmount = betSize * 5;
			balance += winAmount;
			System.out.println("\nYou won " + getWinAmount());
			
		} else if (reel[0].equals("K") && reel[1].equals("K") && reel[2].equals("K")) {
			winAmount = betSize * 10;
			balance += winAmount;
			System.out.println("\nYou won " + getWinAmount());
			
		} else if (reel[0].equals("BAR") && reel[1].equals("BAR") && reel[2].equals("BAR")) {
			winAmount = betSize * 25;
			balance += winAmount;
			System.out.println("\nYou won " + getWinAmount());
			
		} else if (reel[0].equals("$") && reel[1].equals("$") && reel[2].equals("$")) {
			winAmount = betSize * 100;
			balance += winAmount;
			System.out.println("\nYou won " + getWinAmount());
			
		} else if (reel[0].equals("❤") && reel[1].equals("❤") && reel[2].equals("❤")) {
			winAmount = betSize * 333;
			balance += winAmount;
			System.out.println("\nYou won " + getWinAmount());
			
		} else if (reel[0].equals("7") && reel[1].equals("7") && reel[2].equals("7")) {
			winAmount = betSize * 777;
			balance += winAmount;
			System.out.println("\nYou won " + getWinAmount());
			
		} else {
			winAmount = 0;
			System.out.println("\nYou did not win, sorry!");
		}
		
		return winAmount;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBetSize() {
		return betSize;
	}
	
	public void setBetSize(double betSize) {
		this.betSize = betSize;
	}
	
	public double getWinAmount() {
		return winAmount;
	}
	
	public void setWinAmount(double winAmount) {
		this.winAmount = winAmount;
	}
	
	
}
