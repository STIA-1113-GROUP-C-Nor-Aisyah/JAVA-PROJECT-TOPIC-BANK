package javaProject;

import java.util.Scanner;

public class HousingLoan {

	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int menu;
        
        do {
        	
        	 System.out.println("\nMENU");
             System.out.println("\n1. REGISTER ");
             System.out.println("\n2. LOAN CALCULATOR ");
             System.out.println("\n3. TYPE HOUSE ");
             System.out.println("\n4. E-STATEMENT ");
             System.out.println("\n5. EXIT ");
             System.out.print("\nSELECT CHOOSE: ");
             menu = sc.nextInt();
        
           
            
             int i;
            
             int formatter = 0;
             
             switch (menu)
            
             {
            
             case 1:
            	
            	 String housingloan=null ;
            	 
            	 Register (housingloan);
            	 
            	 break;
             
             case 2:
            	
            	 Object loancalculator=null;
            	 
            	 calculator(loancalculator);
            	 
            	 break;
             
             case 3:
             
            	 String[] housetype = null;
				
            	 House(housetype);
             	
            	 break;
             	
             case 4:
            	
            	 futurehousevalue();
            	 
            	 break;
             
             case 5:
            	 
            	 String exit =null;
            	
            	 exitSystem();
            	 
            	 break; 
                
            
             }
        
        
        }while (menu != 5);
	
	}

        
	static void Register(String housingloan) {
	        
        Register r = new Register();
        r.Register();
        		
	}
       
	static void calculator (Object loancalculator){
	
		
		System.out.println("\nENTER YOUR NAME : ");
		
		String name = sc.next();
			
		System.out.println("\nENTER THE LOAN AMOUNT : ");
			
		double loan =sc.nextDouble();
		
		System.out.println("\nENTER THE INTERST RATE : ");
			
		double interest = sc.nextDouble();
			
		double monthlyinterest = interest /(12*100);
			
		System.out.println("\nENTER THE NUMBER OF YEARS : ");
		
		double time = sc.nextDouble();
		
		double years = time * 12;
		
		double monthlypayment= (loan*monthlyinterest*Math.pow(1+monthlyinterest,years))/(Math.pow(1+monthlyinterest,years)-1);
		
		double totalpayment = monthlypayment * years;
		
		
		System.out.println("\n*---YOUR TOTAL MONTHLY PAYMENT AND TOTAL PAYMENT---*");
		
		System.out.println("\nTHE TOTAL MONTHLY PAYMENT IS RM "+ (Math.round(monthlypayment)));
        
        System.out.println("\nTHE TOTAL PAYMENT IS RM " + (Math.round(totalpayment)));
        
        System.out.println("\n*THANK YOU FOR USING GEMpak CALCULATOR *");
	
	}
	
	
	static void House (String [] housetype) {
		
		
		String home="";
		
		int loan;
		
		float pay;
	
	
	
		System.out.print("\nPLEASE ENTER YOUR BUDGET PRICE :");
	    
		loan=(int)sc.nextDouble();
	    
		
	        
		if(loan>=100000 && loan<=200000){
			home="1";
            pay=130000/200;
            System.out.println("PACKAGE HOME 1 ");
            System.out.println("APARTMENT");
            System.out.println("PRICE RM 130000 ");
            System.out.println("HOUSE LOAN 30 YEARS");
	            
	         
		}
	         
	         
		else if (loan>=200000 && loan<=300000){
	           
			 home="2";
	            pay=270000/200;
	            System.out.println("PACKAGE HOME 2");
	            System.out.println("SINGLE STOREY ");
	            System.out.println("PRICE RM 270000 ");
	            System.out.println("HOUSE LOAN 30 YEARS ");
	            
	            
		}
	         
	       
		else if (loan>=300000 && loan<=400000) {
	        	 
			 home="3";
              pay=320000/200;
        	  System.out.println("PACKAGE HOME 3");
              System.out.println("DOUBLE STOREY ");
              System.out.println("PRICE RM 320000 ");
              System.out.println("HOUSE LOAN 30 YEARS ");
	              
	         
		}
	         
	          
		else if (loan>=400000 && loan<=600000) {
	        	 
			 home="4";
              pay=550000/200;
        	  System.out.println("PACKAGE HOME 4");
              System.out.println("SEMI D DOUBLE STOREY ");
              System.out.println("PRICE RM 550000 ");
              System.out.println("HOUSE LOAN 30 YEARS ");
	              
	          
		}
	         
	         
		else if (loan>=600000 && loan<=1000000) {
	        	 
			 home="5";
              pay=1000000/200;
        	  System.out.println("PACKAGE HOME 5");
              System.out.println("BUNGLOW");
              System.out.println("PRICE RM 1000000 ");
              System.out.println("HOUSE LOAN 30 YEARS ");
	          
		}
	         	
		System.out.print("\n***");
	    
		System.out.print("\nPLEASE ENTER PACKAGE NUMBER IF YOU INTERESETED : ");
	    
		home=sc.next();
	    
		home.toUpperCase();
	    
		if(home.equalsIgnoreCase(home)){
	    
			switch(home){
	           
	            
			case "1":
            
				pay=(130000/200);
               
				System.out.println("\nPAKEJ "+home);
	            System.out.printf("\nYOUR MONTHLY PAYMENT WILL BE :RM %.2f%n",pay);
	                                              
	            break;
	                                                                                               
	            
			case "2":
            
				pay=(270000/200);
               
				System.out.println("\nPAKEJ "+home);
	            System.out.printf("\nYOUR MONTHLY PAYMENT WILL BE :RM %.2f%n",pay);
	            									
	            break;
	            									
	           
			case "3":
               
				pay=(320000/200);
               
				System.out.println("\nPAKEJ "+home);
	            System.out.printf("\nYOUR MONTHLY PAYMENT WILL BE :RM %.2f%n",pay);
													
	            break;
													
	           
			case "4":
             
				pay=(550000/200);
              
				System.out.println("\nPAKEJ "+home);
	            System.out.printf("\nYOUR MONTHLY PAYMENT WILL BE :RM %.2f%n",pay);
													
	            break;
													
	            
			case "5":
               
				pay=(1000000/200);
              
				System.out.println("\nPAKEJ "+home);
	            System.out.printf("\nYOUR MONTHLY PAYMENT WILL BE :RM %.2f%n",pay);
													
	            break;
	            
			}
		  
		}
	
	}
	            
	        
	static void futurehousevalue(){
	            	 
	            	
		System.out.println("\nENTER THE LOAN AMOUNT : ");
	         		 
	            	
		double loan =sc.nextDouble();
	         				
	         		
		System.out.println("\nENTER THE INTERST RATE : ");	
	         		
		double interest = sc.nextDouble();
	         		
		double monthlyinterest = interest /(12*100);

	         		
		System.out.println("\nENTER THE NUMBER OF YEARS : ");
	      
		double time = sc.nextDouble();
	    
		double years = time * 12;
	         				
	    
		for(int i = 0; i < time; i++) {	         		
                  
	         		 
			double monthlypayment = (loan*monthlyinterest*Math.pow(1+monthlyinterest,years))/(Math.pow(1+monthlyinterest,years)-1);
	        
			double totalpayment = monthlypayment * years;
	        
			double yearlypayment = monthlypayment * 12;
	        
			double allpayment = yearlypayment * ((i+1)*12);
	         			    	
	        
			System.out.format(" Year No "+ (i+1) +" : RM %.2f", allpayment);
	        
			System.out.println("\n");
	         	  
	         		 
	         		 
	        
		}
	         		 
	    
	}
		  
	static void exitSystem () {
			  
	}

}
