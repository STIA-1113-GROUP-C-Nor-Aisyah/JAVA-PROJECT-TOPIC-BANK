package javaProject;

import java.util.Scanner;

public class creditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanMe = new Scanner (System.in);
		int b;
		int c = 0;
		do 
        {
			System.out.println("This system is for Credit Card utility");
			System.out.println();
			System.out.println("1.Payment using credit card");
			System.out.println("2.Gift shop");
			System.out.println("3.Credit Card Calculator");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("**************************************************************************************");
			System.out.println("Choose what you want to do:");
			b = scanMe.nextInt();
			
			switch (b)
			{
            case 1:
            	System.out.println("You choose credit card payment");
        		printcreditcard();
                break;
            case 2:
            	System.out.println("You choose gift shop");
        		printgiftshop();
                break;
            case 3:  
            	System.out.println("You choose credit card calculator");
        		printCreditCardcalculator();  
                break;
            case 4: 
            	System.out.println("Thank you for using our program");
            	exitSystem();
                break;
			}
        } while (b != 4);
	}
    
		
		public static void printcreditcard() {
		System.out.println("Welcome to credit card payment");
		String name;
		
		
		double limit1 = 40000;// limit for credit card type
		double limit2 = 80000;
		double limit3 = 65000;
		
		Scanner scanMe = new Scanner (System.in);
		
		System.out.println("Purchase for smartphone and laptop made in 10/6/2021:");
		System.out.println();
		System.out.println("Enter the price of smartphone:");
		double smartphone = scanMe.nextDouble();
		System.out.println("Enter the price of laptop:");
		double laptop = scanMe.nextDouble();
		System.out.println();
		
		System.out.println("Purchase for petrol,air plane ticket, insurance and house debt made in 20/6/2021:");
		System.out.println();
		System.out.println("Enter the price of petrol:");
		double petrol = scanMe.nextDouble();
		System.out.println("Enter the price of air plane ticket:");
		double airplaneTicket = scanMe.nextDouble();
		System.out.println("Enter the price of insurance:");
		double Insurance = scanMe.nextDouble();
		System.out.println("Enter the price of house debt:");
		double houseDebt = scanMe.nextDouble();
		System.out.println();
		
		System.out.println("Purchase for car debt and hotel booking made in 30/6/2021:");
		System.out.println();
		System.out.println("Enter the price of car debt:");
		double carDebt = scanMe.nextDouble();
		System.out.println("Enter the price of hotel booking:");
		double HotelBooking = scanMe.nextDouble();
		
		System.out.println("Purchase to be made in June using Credit Card:");
		System.out.println("_____________________________________________");
		System.out.println("|DATE       |ITEM                  |PRICE    |");
		System.out.println("|___________|______________________|_________|");
		System.out.println("| 10/6/2021 |* SMARTPHONE          |RM"+ smartphone +" |");
		System.out.println("|           |* LAPTOP              |RM"+ laptop + " |");
		System.out.println("|___________|______________________|_________|");
		System.out.println("| 20/6/2021 |*PETROL               |RM"+ petrol +  "   |");
		System.out.println("|           |*AIRPLANE TICKET      |RM"+ airplaneTicket + "  |");
		System.out.println("|           |*INSURANCE            |RM"+ Insurance + " |");
		System.out.println("|           |*HOUSE DEBT           |RM"+ houseDebt + " |");
		System.out.println("|___________|______________________|_________|");
		System.out.println("| 30/6/2021 |*CAR DEBT             |RM"+ carDebt +"  |");
		System.out.println("|           |*HOTEL BOOKING        |RM"+ HotelBooking +"  |");
		System.out.println("|___________|______________________|_________|");

		
		double totalpayment = smartphone + laptop + petrol + airplaneTicket + Insurance + houseDebt + carDebt + HotelBooking;
		
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("|TYPE |TYPE                                  | CREDIT CARD NUMBER| EXPARITION DATE| CCV |");
		System.out.println("|_____|______________________________________|___________________|________________|_____|");
		System.out.println("|  1  |GEMpak e Credit Card                  |1111-2222-3333-4444|     21/27      | 445 |");
		System.out.println("|_____|______________________________________|___________________|________________|_____|");
		System.out.println("|  2  |GEMpak Petronas Platinum MasterCard   |2324-5957-9128-5387|     09/28      | 499 |");
		System.out.println("|_____|______________________________________|___________________|________________|_____|");
		System.out.println("|  3  |GEMpak Platinum Explore Credit Card-i |7979-6124-6996-9000|     01/25      | 321 |");
		System.out.println("|_____|______________________________________|___________________|________________|_____|");


		

			
			System.out.println("Choose what credit type you want to use:");
			int a = scanMe.nextInt();
		if(a==1) {
			
			System.out.println("You choose GEMpak e Credit Card");
			System.out.println("Your balance for this credit card is RM" + limit1);
			double balance = limit1 - totalpayment;
			System.out.println("Your limit for GEMpak e Credit Card is RM " + balance);
			
		}
		
			
			
			else if(a==2) {
				System.out.println("You choose GEMpak Petronas Platinum MasterCard");
				System.out.println("Your balance for this credit card is RM " + limit2);
				System.out.println("You have 7% cashback for this credit card");
				double balance = limit2 - totalpayment;
				double cashback = (0.07 / 100) * (petrol);
				double balance2 = balance + cashback;
				System.out.println("Your limit for GEMpak Petronas Platinum MasterCard is RM " + balance);
				System.out.println("Your Cashback is RM " + balance2);
				
			}
			else if(a==3) {
				System.out.println("You choose GEMpak Platinum Explore Credit Card-i");
				System.out.println("Your balance for this credit card is RM " + limit3);
				System.out.println("You have 5% cashback for this credit card");
				double balance = limit3 - totalpayment;
				double cashback = (((0.05/100) * (airplaneTicket)) + ((0.05/100) *(HotelBooking)));
				double balance2 = balance + cashback;
				System.out.println("Your limit for GEMpak Platinum Explore Credit Card-i is RM " + balance);
				System.out.println("Your Cashback is RM " + balance2);
				
			}
			else {
				System.out.println("Unknown Credit Card");
			}
		
		// divide 12 is to know what minimum amount to pay for a month
		double smartphoneDebt1 = (smartphone/12);
		double laptopDebt1 = (laptop/12);
		double petrolDebt1 = (petrol/12);
		double airplaneTicketDebt1 = (airplaneTicket/12);
		double InsuranceDebt1 = (Insurance/12);
		double houseDebt1 = (houseDebt/12);
		double carDebt1 = (carDebt/12);
		double HotelBookingDebt1 = (HotelBooking/12);
		double AllDebt1 = smartphoneDebt1 + laptopDebt1 + petrolDebt1 + airplaneTicketDebt1 + InsuranceDebt1 + houseDebt1 + carDebt1 + HotelBookingDebt1;
		System.out.println("Total debt to be pay per monthly is RM " + AllDebt1);
		
		System.out.println("Your unpaid Debt for this credit card is RM1000");
		double Debt1 = 1000 * 9;// coming from the debt that not being paid last month// its from 1 - 9 June
		double Debt2 = 6000 * 9;// 8600 came from total of Debt1 and laptop // its from 10 - 19 June
		double Debt3 = 7074 * 9;// its from 20 - 29 June
		double Debt4 = 7768 * 1;// June 30
		double MonthlyInterest = (Debt1 + Debt2 + Debt3 + Debt4)/30;
		
		System.out.println();
		System.out.println("What is you current money:");
		double currentmoney = scanMe.nextDouble();
			double DPR = 15/365;
			
			
				double MonthlyIntrestRate = DPR * 30;// * 30 because June have 30 days
				System.out.println("The annual interest rate for 3 credit card is 15%");
				double rate = (15/100) * (MonthlyIntrestRate);
				double monthlydebt = AllDebt1 + rate;
				System.out.println("Your charge payment for this month is RM");
				System.out.printf("%.2f",monthlydebt);
				System.out.println();
				
				double moneyleft = currentmoney - monthlydebt;
				System.out.print("Your money left is RM ");
				System.out.printf("%.2f",moneyleft);
				System.out.println();
	}


		
			public static void printgiftshop() {
				Scanner scanMe = new Scanner (System.in);		
			
		System.out.println();
		System.out.println();
		System.out.println("Welcome Gift Shop:");
		System.out.println("___________________________________");
		System.out.println("|ITEM                  |ITEM CODE  |");
		System.out.println("|______________________|___________|");
		System.out.println("|* Samsung Smartphone  |    1      |");
		System.out.println("|* Trip to Langkawi    |    2      |");
		System.out.println("|* GCS Ticket Movie    |    3      |");
		System.out.println("|* PS4                 |    4      |");
		System.out.println("|* ASUS Laptop         |    5      |");
		System.out.println("|______________________|___________|");

		int t = 3;
		int u = 0;
		System.out.println();
		System.out.println("You have 30 points in your credit card");
		System.out.println();
		System.out.println("You can choose 3 Item in Gift Shop, due to purchase made this month");
		
		while(t > 0) {
			System.out.println("Choose item that you interest in the point shop:");
			u = scanMe.nextInt();

			if(u == 1) {
				System.out.println("You choose Samsung Smartphone");
				t--;
			}
			else if(u==2) {
				System.out.println("You choose Trip to Langkawi");
				t--;
			}
			else if(u==3){
				System.out.println("You choose CGS Ticket Movie");
				t--;
			}
			else if(u==4){
				System.out.println("You choose PS4");
				t--;
			}
			else if(u==5){
				System.out.println("You choose ASUS Laptop");
				t--;
			}
			else {
			   System.out.println("The item didnt have in this shop");
			}
			System.out.println("You have" +" "+ t + " " + "left to choose your gift");

		}
		System.out.println("We hope you like the gift");
		System.out.println();
			
			}
		
		public static void printCreditCardcalculator() {
			Scanner scanMe = new Scanner (System.in);
		System.out.println("Welcome to payment calculator");
		System.out.println("This program will calculate how much money you use to pay up credit card debt in a month");
		System.out.println();
		
		
		

		System.out.print("Select how many probability you want to see: ");
		int probability = scanMe.nextInt();
		System.out.println();
		System.out.println("_________________________________________________________________________");
		
		for(int ii=1; ii <= probability; ii++ ) {
			System.out.println("The "+ ii + " calculation" );
		    System.out.print("How much you invest for this credit card: ");
		 	double investment = scanMe.nextDouble();
		 	System.out.print("Annual interst rate for this credit card: ");
			double rate = scanMe.nextDouble();
			System.out.println("Enter how much yo spend for this month:");
			double payment = scanMe.nextDouble();
			System.out.println();
			double percentageInterest = (investment * rate)/(12);
			double interest = (percentageInterest / 100);
			System.out.println("Interst: " + interest);
			double PaidAmount = interest + investment;
			System.out.println("Paid amount: " + PaidAmount);
			double balance = PaidAmount - payment;
			System.out.println("Balance of debt left: RM " + balance);
			System.out.println("_________________________________________________________________________");
			
			System.out.println();
		}
		}
		static void exitSystem () {
			  
		}

}
