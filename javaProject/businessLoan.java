package javaProject;

import java.util.Scanner;

public class businessLoan {
	
	public static Scanner sc = new Scanner (System.in);
	public static String name[] = new String [50];
	public static String acc_num [] = new String [50];
	public static String phone_num [] = new String [50];
	public static int age [] = new int [50];
	public static int amount [] = new int [50];
	public static int tenure [] = new int [50];
	public static int choice, i = 0, total = 0, x;
	public static double interest = 0.045;
	public static double monthlyPayment [] = new double [50];
	public static double totalPayment [] = new double [50];
	
	public static void displayMenu () {
		System.out.println("THIS IS FOR BUSINESS LOAN SERVICE ONLY");
		System.out.println("1. Information of Loan");
        System.out.println("2. Type of application method");
        System.out.println("3. Information about application method");
        System.out.println("4. The interest rate");
        System.out.println("5. Input information");
        System.out.println("6. View Record");
        System.out.println("7. Exit");
		System.out.println("PLEASE CHOOSE ONE OF THE ABOVE OPTIONS:");
		choice = sc.nextInt();
	}
	
	public static void Information() {
		System.out.println("----------------------------------------------------------");
		System.out.println("This is information about Loan ");
		System.out.println("----------------------------------------------------------");
		System.out.println("Eligibility:");
		System.out.println("-Below RM25 million annual sales turnover");
		System.out.println("-Below RM5 million outstanding loan/financing with GEMpak");
		System.out.println("-Malaysian-owned registered company");
		System.out.println("-More than 1 year in operation");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("");
		System.out.println("Enter 00 to back to main menu :");
		int next = sc.nextInt();
		System.out.println("");
	}
	
	public static void TypeApplication(){ 
	    	System.out.println("There are 2 types of application method: ");
			System.out.println("1.  By online application");
			System.out.println("2.  By branch application");
	       
			System.out.println("");
			System.out.println("Enter 00 to back to main menu :");
			int next = sc.nextInt();
			System.out.println("");
	    }

	public static void ApplicationInformation()
	    {
	    	System.out.println("Not sure which application method suits you better? Here are the key differences to help you decide:");
			System.out.println("");
			System.out.println("1.  Online Application");
			System.out.println("    a) Financing amount: RM10,000 – RM250,000");
			System.out.println("    b) Financing tenure: Up to 5 years");
			System.out.println("    c) Business operation period: Minimum 1 year");
			
			System.out.println("");
			System.out.println("2.  Branch Application");
			System.out.println("    a) Financing amount: RM50,001– RM1,500,000");
			System.out.println("    b) Financing tenure: Up to 7 years");
			System.out.println("    c) Business operation period: Minimum 3 year");  
			
			System.out.println("");
			System.out.println("Enter 00 to back to main menu :");
			int next = sc.nextInt();
			System.out.println("");
	    }

	public static void Interest() {
	       System.out.println("The interest rate is 4.5%"); 
	       
	       System.out.println("");
	       System.out.println("Enter 00 to back to main menu :");
	       int next = sc.nextInt();
	       System.out.println("");
	    }
	    
	public static void Input() {
		char choiceAdd;
		
		do {
		System.out.println("Enter your name: ");
		name[i] = sc.next()+sc.nextLine();
		System.out.println("Enter your number phone: ");
		phone_num[i] = sc.next()+sc.nextLine();
		System.out.println("Enter your account number: ");
		acc_num[i] = sc.next()+sc.nextLine();
		 
		System.out.println("Enter business operation period (in months): ");
		int period = sc.nextInt();
		
		System.out.println("Enter your annual revenue: ");
		int revenue = sc.nextInt();
		
		if ((period >= 12) && (revenue <= 25000000)) {
		System.out.println("Enter the amount of loan: ");
		amount[i] = sc.nextInt();
		System.out.println("Enter financing tenure: ");
		tenure[i] = sc.nextInt();
		}else
			System.out.println("Sorry, you did not qualified to make a business loan");
		
		CalculatePayment(i);
		
		System.out.println("Enter 1 to proceed to monthly payment calculation");
		int next = sc.nextInt();
		System.out.printf("Monthly payment is RM %.2f%n" , monthlyPayment[i]);
		System.out.printf("Total payment is RM %.2f%n" , totalPayment[i]);
		System.out.println("RECORD HAS BEEN ADDED SUCCESSFULLY!!\n");
		System.out.println("-------------------------------------------");
		System.out.println("DO YOU WANT TO ADD ANOTHER INPUT (Y/N): ");
		choiceAdd = sc.next().charAt(0);
		System.out.println("-------------------------------------------");
		i++;
		}while ((choiceAdd == 'y') || (choiceAdd == 'Y'));
		System.out.println("Enter 00 to back to main menu :");
	    int next = sc.nextInt();
	    System.out.println("");
	}
	
	public static void CalculatePayment(int index) {
		System.out.println("");
		monthlyPayment[index] = amount[index] * (interest / 12) / ( 1 - 1 / Math.pow(1 + (interest / 12), tenure[index] * 12));
		totalPayment[index] = monthlyPayment[index] * tenure[index] * 12;
		
	}
	
	public static void ViewRecord() {
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-10s\n","Name", "Phone Number", "Account Number", "Loan amount (RM)", "Monthly payment(RM)", "Total payment(RM)");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		for (int j = 0; j < i; j++) {
			System.out.printf("%-20s%-20s%-20s%-20s%-20.2f%-10.2f\n", name[j], phone_num[j], acc_num[j], amount[j], monthlyPayment[j], totalPayment[j]);
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter 00 to back to main menu :");
	    int next = sc.nextInt();
	    System.out.println("");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contact [] = {"Zakri", "Ahmad", "Siti"};
		do {
			displayMenu();
			
		switch (choice) {
		case 1 : Information();
		break;
		case 2 : TypeApplication();
		break;
		case 3 : ApplicationInformation();
		break;
		case 4 : Interest();
		break;
		case 5 : Input();
		break;
		case 6 : ViewRecord();
		break;
		case 7 : exitSystem(contact);
		break;
		}
		}while (choice != 7);
	}
    static void exitSystem(String [] contact) {
    	System.out.println("If you have any problem about business loan, you can contact our customer service: ");
    	
    	contact [0] = "Zakri";
    	contact [1] = "Ahmad";
    	contact [2] = "Siti";
    	
    	System.out.println("------------------------------------");
    	System.out.println(" 1    " + contact [0] + "         011 7789 5464 " );
    	System.out.println("------------------------------------");
    	System.out.println(" 2    " + contact [1] + "         011 8942 1215 " );
    	System.out.println("------------------------------------");
    	System.out.println(" 3    " + contact [2] + "          019 6539 844  " );
    	System.out.println("------------------------------------");
    	
    	System.out.println("\nOr you can email or you can go to our website");
    	System.out.println("\nEmail : bankGEMbusinessLoan@gmail.com");
    	System.out.println("Website : bankgembusinessloan.com.my");
	}

}
