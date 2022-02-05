package javaProject;

import java.util.Scanner;
public class Project {

	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		char choices;
		Scanner sc = new Scanner (System.in);
		do {
		System.out.println("******####### WELCOME TO GEMpak BANK #######*******");
		System.out.println("MAIN MENU");
		System.out.println("1. BUSINESS LOAN");
		System.out.println("2. PERSONAL ACCOUNT");
		System.out.println("3. CREDIT CARD");
		System.out.println("4. HOUSING LOAN");
		System.out.println("5. INVESTMENT");
		System.out.println("******######################################*******");
		System.out.print("Please choose your service :");
		int service = sc.nextInt();
		
		if(service==1) {
			businessLoan b = new businessLoan();
			b.main(args);
		}
		else if(service==2) {
			personalAccount p = new personalAccount();
			p.main(args);
		}
		else if(service==3) {
			creditCard c = new creditCard();
			c.main(args);
		}
		else if(service==4) {
			HousingLoan h = new HousingLoan();
			h.main(args);
		}
		else if(service==5) {
			investment i = new investment();
			i.main(args);
		}
		else {
			System.out.println("Invalid Number ! Please Try Again");
		}
		
		System.out.println("");
		System.out.println("DO YOU WANT TO RETURN TO THE MAIN MENU  ? Y=YES N=NO");
		choices = sc.next().charAt(0);
		}while (choices =='y' || choices =='Y');
		
		System.out.println("##################################################################");
		System.out.println("               <<<<<<YOU CHOOSE TO EXIT>>>>>>  ");
		System.out.println("           <THANK TOU FOR USING THIS BANK SERVICE> ");
		System.out.println("Any problem, feel free to contact our customer service or email us! ");
		System.out.println("Customer service number : 09 895 9432");
		System.out.println("Email : GEMpakBank@gmail.com");
		System.out.println("##################################################################");
		
	}
}	
