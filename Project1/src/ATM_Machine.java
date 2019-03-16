import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		Account users[] = new Account[10];
		int menuOption; // stores menu option chosen by user;
		
		//Generating Users: i, $100
		for(int i = 0; i < users.length; i++) {
			users[i] = new Account(i, 100);
		}
		//Obtain user Id 
		Scanner in = new Scanner(System.in);
		int ID;
		while(true) {
			do {
				System.out.println("Enter an ID: ");
				ID = in.nextInt();
			} while(ID > 10 && ID < 0);
			
			//Displays Menu
			do {
				menuOption = menuDisplay();
				//print out balance
				if(menuOption == 1) {
					System.out.println("The balance is "+users[ID].getBalance());
				}
				//withdraw option
				else if(menuOption == 2) {
					System.out.println("Enter the amount to withdraw: ");
					double amount = in.nextDouble();
					
					if(amount > users[ID].getBalance())
						System.out.println("Insufficient amount to withdraw " + amount);
					else {
						System.out.println(amount+" has been withdrawn");
						//update balance and print new balance
						users[ID].setBalance(-amount);
						System.out.println(users[ID].getBalance()+" is the new balance");
					}	
				}
				//deposit option
				else if(menuOption == 3) {
					System.out.print("Enter amount to deposit into account: ");
					double amount = in.nextDouble();
					//update balance and print new balance
					users[ID].setBalance(amount);
					System.out.println(users[ID].getBalance()+" is the new balance");
				}
			} while(menuOption != 4);		
		}
		
	}
	
	//Returns a number representing the option chosen
	public static int menuDisplay() {
		System.out.println("Main Menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		
		int option;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an option: ");
		option = in.nextInt();
		if(option <= 4 && option >= 1)
			return option;
		else
			return 4;
		
		
	}

}
