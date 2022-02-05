package javaProject;

import java.util.Scanner;

public class personalAccount {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {

		int choose;
		do 
		{
		System.out.println("__________________________________________________________________________________________________________");
		System.out.println("### WELCOME TO GEMpak Personal Account Service ###");
		System.out.println("#  1.	Register New User                        #");
		System.out.println("#  2.	DuitNow                                  #");
		System.out.println("#  3.	Exit                                     #");
		System.out.println("##################################################");
		
        System.out.print("CHOOSE ONE OF THE OPTION ABOVE : ");
        choose = sc.nextInt();
        
        int i;
        switch (choose) 
        {
        case 1:
        	String[] user = null;
        	Register(user);
        	break;
        case 2:
        	String DuitNow = null;
        	Duitnow(DuitNow);
        	break;
        case 3: 
        	String exit = null;
        	exitSystem(exit);
        	break;
        }
		} while (choose != 3);
	}

	static void Register(String [] user) {
		
		Register r = new Register();
        r.Register();
	}

	static void Duitnow(Object duitNow) {
		
		int addedTime=0;
		char addtransaction='X',back='X';	 
		
	    //Array
	    int length=10; 
	    int[] acc= new int[length];
	    double[] amount1=new double[length];
	    double total1;
	    String[] acc1= new String[length];
	    String[] bankname1= new String[length];
	    String[] name1= new String[length];
	    String[] reference1= new String[length];
	    //Array End
		
		System.out.println("");
		String anotherBank = sc.nextLine();
		
		System.out.println("XXXXXXXXXXXXXXXXXXX DuitNow XXXXXXXXXXXXXXXXXXXXX");
		System.out.println("");
		
        for (int i=0; i < length; i++) {
            i=addedTime;
		System.out.print("Your Account Number : ");
		acc[i]= sc.nextInt();
		System.out.println("");
	    System.out.println("______PLEASE INSERT THE INFORMATION DETAILS______");
	    System.out.print("Recipient Bank Name : ");
	    bankname1[i]=sc.nextLine();
        sc.nextLine();
		System.out.print("Recipient Account : ");
		acc1[i]=sc.nextLine();
		System.out.print("Recipient Name : ");
		name1[i]=sc.nextLine();
		System.out.print("Recipient Reference : ");
		reference1[i]=sc.nextLine();
		System.out.print("Amount : RM ");
		amount1[i]= sc.nextInt();
			
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^  *Fee : 2%                                                           ^");
		System.out.println("^  *Please take note that RM1.00 will be charged for every transaction ^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		System.out.println("CHOOSE 1 TO CONTINUE !");
		int next1 = sc.nextInt();
		String anotherBank1 = sc.nextLine();
		
		System.out.print("Total that have been charged : RM ");
		total1 =amount1[i]+((amount1[i]*0.02)+1);
		System.out.printf("%.2f",  total1);	
		System.out.println("\n");
		
   		System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("          **TRANSACTION SUCCESSFULL**                ");
        System.out.println("-----------------------------------------------------");
        System.out.println("");
        addedTime++;
        //ADD transaction
        System.out.print("DO YOU WANT TO ADD ANOTHER TRANSACTION? (Y/N) : ");
        addtransaction=sc.next().charAt(0);
        if (addtransaction=='N'||addtransaction=='n') {
            back='y';
            i=length;//break the Loop
		
        }
        }
	}

	 static void exitSystem(String exit) {
	    System.out.println("------------------------------------------------------- ");
	 	System.out.println("THANK YOU FOR USING GEMpak Bank Personal Account Service");
		System.out.println("------------------------------------------------------- ");
	    
		System.out.print("______________________________________________________________________________________________________________");
		System.out.println("\n");
		
		System.out.println("##    ##     ##    #########  #########  ##        ##      ######## ######### ######## #########    ### ### ");
		System.out.println("##    ##   ##  ##  ##     ##  ##     ##  ###      ##       ######## ######### ######## #########    ### ### ");
		System.out.println("########  ##    ## ##     ##  ##     ##   ###   ###              ## ##     ##       ##        ##    ### ### ");
		System.out.println("######## ######### #########  #########     #####          ######## ##     ## ######## #########    ### ### ");
		System.out.println("##    ## ##     ## ##         ##              ##           ##       ##     ## ##       ##           ### ### ");
		System.out.println("##    ## ##     ## ##         ##              ##           ######## ######### ######## #########            ");
		System.out.println("##    ## ##     ## ##         ##              ##           ######## ######### ######## #########    ### ### ");
		System.out.print("______________________________________________________________________________________________________________");
		
		System.out.println("\n");
		System.out.println("                                  TO OUR BELOVED GEMpak BANK USER <3                                      ");
		System.out.println("                             We are going to send you some present to you <3                                ");		
		System.out.print("______________________________________________________________________________________________________________");		
		System.out.println("\n                               LETS PLAY A GUESS NUMBER GAME FIRST !!                                     ");
		System.out.println("\n                   You Will Be Asked To Guess A Number Before Proceed to your gifts                       ");
		System.out.println("                                        You can attempt 5 times                                             ");
		
		int number = 1 + (int)(100 * Math.random());
        int K = 5;
        int i, guess;

        System.out.println("\nA number is chosen" + " between 1 to 100.");

        for (i = 0; i < K; i++) {

        System.out.println("Guess the number:");
        guess = sc.nextInt();

        if (number == guess) {

        System.out.println("Congratulations!" + " You guessed the number.");

       break;
        }
       else if (number > guess && i != K - 1) {

       System.out.println("The number is " + "greater than " + guess);
       }

       else if (number < guess && i != K - 1) {

       System.out.println("The number is" + " less than " + guess);

       }
        }
        if (i == K) {

       System.out.println("You have exceeded the maximum attempts.");
       System.out.println("The number is " + number);
        }
		System.out.print("___________________________________________________________________________________________________________");       
		System.out.println("\n");
		System.out.println("                                  PLEASE CHOOSE YOUR GIFTS<3                                             ");
		System.out.println("\n1.Notebook + Calender      ");
		System.out.println("\n2.Bag + Calender           ");
		System.out.println("\n3.Tumblr Bottle + Calender ");
		System.out.println("\n4.We Bare Bear + Calender  ");
		System.out.println("\n5.Colour Pencil + Calender ");
		System.out.print("\nInsert the NUMBER : ");
		int gift = sc.nextInt();
	
		if (gift == 1) {
			System.out.println("\nYou choose Notebook and 2022 Calender as a gift.     ");
		}
		else if(gift == 2) {
			System.out.println("\nYou choose Bag and 2022 Calender as a gift.          ");
		}
		else if (gift == 3) {
			System.out.println("\nYou choose Tumblr Bottle and 2022 Calender as a gift.");
		}
		else if (gift == 4) {
			System.out.println("\nYou choose We Bare Bear and 2022 Calender as a gift. ");
		}
		else if (gift == 5) {
			System.out.println("\nYou choose Colour Pencil and 2022 Calender as a gift.");
		}
		else {
		System.out.println("\nYou don't choose any gift.");	
		}
		
		
}
}
