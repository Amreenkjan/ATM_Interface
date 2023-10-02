
	import java.util.Scanner;

	 class Bankaccount {
		private double balance;
		
		public Bankaccount(double initialBalance) {
			this.balance=initialBalance;
		}
		public double getbalance() {
			return balance;
		}
		
		public void deposit(double amount) {
			if(amount>0) {
				balance+=amount;
				System.out.println("Deposit successful.new balance: "+balance);
			}else {
				System.out.println("Invalid amount for deposit.");
			}
		}
		
		public void withdraw(double amount) {
			if(amount>0 && amount<=balance) {
				balance-=amount;
				System.out.println("withdrawal successful. new balance: "+balance);
			}else {
				System.out.println("Insufficient funds or invalid amount for withdrawal.");
				}
			}
		}
	class ATM{
		private Bankaccount account;
		//private Scanner scanner;
		Scanner s=new Scanner(System.in);
		
		public ATM(Bankaccount b) {
			this.account=b;
			
		} 
		
		public void showmenu() {
			
			System.out.println("1. check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. withdraw");
			System.out.println("4. Exit");
		}
		 public void run() {
			 int choice;
			 do {
				 showmenu();
				 System.out.println("Enter your choice");
				 choice=s.nextInt();
				 switch(choice) {
				 case 1:
					 checkBalance();
					 break;
				 case 2:
					 deposit();
					 break;
				 case 3:
					 withdraw();
					 break;
				 case 4:
					 System.out.println("Thankyou for using the ATM");
					 break;
					default:
						System.out.println("Invalid choice. Please select a valid option");
				 }
			 }while(choice !=4);
		 }
	
	  private void checkBalance() {
		  System.out.println("your current balance is: " + account.getbalance());
		  }
	  private void deposit() {
		  System.out.println("Enterthe amount to deposit: ");
		  double amount=s.nextDouble();
		  account.deposit(amount);
		  }
	    private void withdraw() {
	    	System.out.println("Enter the amount to withdraw: ");
	    	double amount=s.nextDouble();
	    	account.withdraw(amount);
	    }
	    }
	      class ATM_Interface{
	    	 public static void main(String[]args) {
	    		 System.out.println("welcome to the ATM");
	    		 Scanner s=new Scanner(System.in);
	    		 System.out.print("Enter your four digit pin: ");
	    		 int enteredpin=s.nextInt();
	    		 
	    Bankaccount useraccount=new Bankaccount(1000.0);//intial balance
	    ATM atm=new ATM(useraccount);
	    atm.run();
	    }
	    }
	     



