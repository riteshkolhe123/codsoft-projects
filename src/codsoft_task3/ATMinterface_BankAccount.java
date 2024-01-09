package codsoft_task3;

import java.util.Scanner;

public class ATMinterface_BankAccount {
	private double balance;

	public ATMinterface_BankAccount(double intialBalance) {
		this.balance = intialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Money Deposited Successfully. New Available Balance is:" + balance);
			System.out.println("\n");
		} else {
			System.out.println("Entered Amount is Invalid For Deposit");
			System.out.println("\n");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Money Withdrawal Successful. New Available Balance is:" + balance);
			System.out.println("\n");

		} else {
			System.out.println("Invalid amount For Withdrawal, Account has insufficient funds");
			System.out.println("\n");
		}
	}
}

class ATM {
	private ATMinterface_BankAccount account;
	private Scanner sc;

	public ATM(ATMinterface_BankAccount account) {
		this.account = account;
		this.sc = new Scanner(System.in);
	}

	public void showMenu() {
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. WithDraw");
		System.out.println("4. Exit");
	}

	public void run() {
		int choice;
		do {
			showMenu();
			System.out.println("Enter Your Choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withDraw();
				break;
			case 4:
				System.out.println("Thank You For Using the ATM");
				break;
			default:
				System.out.println("Inavlid Choice . Please select the Valid option");
			}

		} while (choice != 4);
	}

	private void checkBalance() {
		System.out.println("The Available Balance Is : " + account.getBalance());
		System.out.println("\n");
	}

	private void deposit() {
		System.out.println("Enter The Amount you want To Deposit :");
		double amount = sc.nextDouble();
		System.out.println("\n");
		account.deposit(amount);
	}

	private void withDraw() {
		System.out.println("Enter The amount you want To WithDraw :");
		double amount = sc.nextDouble();
		System.out.println("\n");
		account.withdraw(amount);
	}

	public class ATM_Interface {
		public static void main(String args[]) {
			System.out.println("!!.. Welcome To ATM ..!!");
			System.out.println("\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Pin :");
			int enteredPin = sc.nextInt();

			ATMinterface_BankAccount userAccount = new ATMinterface_BankAccount(1000.0);
			ATM atm = new ATM(userAccount);
			atm.run();
		}
	}
}