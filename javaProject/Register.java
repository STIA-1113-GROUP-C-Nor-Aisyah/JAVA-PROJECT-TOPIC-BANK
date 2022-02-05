package javaProject;

import java.util.Scanner;

public class Register {

	static void Register() {
		
		Scanner sc = new Scanner(System.in);
	
        String [] name = new String[15];
        String [] acc_number = new String[15];
        int [] phone_number = new int[10];
        int a = 1;

        System.out.println("");
    	System.out.println("XXXXXXXXXXXXXXXXXXX NEW USER XXXXXXXXXXXXXXXXXXXXX");
    	System.out.println("");
	    System.out.println("______PLEASE INSERT THE INFORMATION DETAILS______");
	    System.out.println("");
        System.out.print(" Full Name : ");
        name [a]= sc.next();
        sc.nextLine();
        System.out.print(" Account Number: ");
        acc_number [a]= sc.next();
        System.out.print(" Number Phone: ");
        phone_number[a] =sc.nextInt();
        System.out.println("");
        System.out.println("--------THANK YOU FOR REGISTERING WITH US !---------");
        System.out.println("--------NOW YOU ARE MEMBER OF GEMpak BANK !---------");
		

	}

}
