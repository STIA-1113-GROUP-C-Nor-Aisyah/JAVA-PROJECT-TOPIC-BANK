package javaProject;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class investment {

    static Scanner scan = new Scanner(System.in);
    private static double a;
    private static double b;
    private static int c;
    private static String[] x = new String[15];
    private static int[] y = new int[10];
    private static String[] z = new String[15];
    private static int count=0;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    
        System.out.println("------------------------------------- ");
        System.out.println(" WELCOME TO GEMpak BANK  ");
        System.out.println("------------------------------------- ");
        
        System.out.println("\n");
        System.out.println(" This are in the Invesment Section . ");
        System.out.println("");
        
        int invest_amount = 0, invest_tenure = 0;
        int choose; 
        char pick;
        double percent=0;
        
        do 
        {
                System.out.println("Menu ");
                System.out.println("1. Register");
                System.out.println("2. Do Invest");
                System.out.println("3. Future Value");
                System.out.println("4. Get Receipt");
                System.out.println("5. Exit");
                System.out.print("Select choose : ");
                choose = scan.nextInt();
        
                
                int i;
                int formatter = 0;
                switch (choose) 
                {
                    case 1:
                        String[] investor = null;
                        Register(investor);
                        break;
                    case 2:
                        Object investamount = null;
                        invesmentAmount(investamount);
                        break;
                    case 3:   
                        futureInvestmentValue(a,b,c);  
                        break;
                    case 4:
                        printReceipt(x, y, z, a,b,c);
                        break;
                    case 5: 
                    String exit = null;
                    exitSystem(exit);
                        break;
                }
            } while (choose != 5);
        }
    
     static void Register(String[] investor) {
        
            String [] name = new String[15];
            int [] phone_number = new int[10];
            String [] acc_number = new String[15];
            
            
            System.out.print(" Please enter your name: ");
            name [count]= scan.next();
            scan.nextLine();	
            System.out.print(" Please enter your phone number: ");
            phone_number[count] =scan.nextInt();
            System.out.print(" Please enter your account number: ");
            acc_number [count]= scan.next();
            
            x[count] = name [count];
            y[count] = phone_number[count];
            z[count] = acc_number [count];
            count++;
        }
     static void invesmentAmount(Object investamount) {
        
            int invest_amount, invest_tenure;
            double percent, profitpayabletocust, accumulatedprofit, totalamount;
            
            do {
            System.out.println(" Enter your Investment amount : ");
            invest_amount = scan.nextInt();
            
            percent = 0;
            if((invest_amount >= 1000)&&(invest_amount <= 10000)) {
                percent = 3.2;
            } else if ((invest_amount >= 10001)&&(invest_amount <= 30000)) {
                percent = 3.8;
            } else if ((invest_amount>= 30001)&& (invest_amount <= 50000)) {
                percent = 4.2;
            }else {
                System.out.println("PLEASE PUT AMOUNT BETWEEN RM1000 TO RM50000 !");
            }
            } 
            while((invest_amount < 1000)||(invest_amount>50000));               
            
            int f=1;
            do {
            System.out.println("PLEASE PUT 3 OR 6 OR 12 ONLY!");
            System.out.println(" Enter Investment tenure : ");
            invest_tenure = scan.nextInt();
           
            if (invest_tenure == 3){
                System.out.println("Calculation in Progress.");
                f=2;
            }else if (invest_tenure == 6){
                System.out.println("Calculation in Progress.");
                f=2;
            }else if (invest_tenure == 12){  
                 System.out.println("Calculation in Progress.");
                 f=2;
            }else {
                System.out.println("Please Follow Instruction !");
            }
            }
            while (f==1);
           
                
            profitpayabletocust = invest_amount * percent/100 * 30/365;
            accumulatedprofit = profitpayabletocust * invest_tenure ;
            totalamount = invest_amount + accumulatedprofit ;
            
            System.out.println("");
            System.out.println("Calculation Done !");
            System.out.println("");
            System.out.format(" Profit Payable to Customer : RM %.2f", profitpayabletocust);
            System.out.println("\n");
            System.out.format(" Accumulated Profit : RM %.2f", accumulatedprofit);
            System.out.println("\n");
            System.out.format(" Total Amount : RM %.2f", totalamount);
            System.out.println("\n");
            
            a = invest_amount;
            b = percent;
            c = invest_tenure;
     }
     
     static void futureInvestmentValue(double invest_amount, double percent, int invest_tenure) {
        
        double  profitpayabletocust, accumulatedprofit, totalamount;
        
        System.out.println("\t Month       Future Value");
        for(int i = 0; i < invest_tenure; i++) {
            
            profitpayabletocust = invest_amount * percent/100 * 30/365;
            accumulatedprofit = profitpayabletocust * (i+1) ;
            totalamount = invest_amount + accumulatedprofit ;
            
            System.out.format("\t Month No "+ (i+1) +" : RM %.2f", totalamount);
            System.out.println("\n");
        }
    }
     
     static void printReceipt(String name[], int phone_number[], String acc_number[], double invest_amount, double percent, int invest_tenure ) {
        
    	 double  profitpayabletocust, accumulatedprofit, totalamount;
            
    	System.out.println("__________________");
     	System.out.println("\n\t         GEMpak BANK E-Receipt");
     	
                System.out.println(" \tName \tPhone Number \tAccount Number  \n");
            for(int i = 0; i < count; i++)
            {
                System.out.println( "\t" + name[i] + "\t" + "0"+phone_number[i] + "\t" + acc_number[i] + "\t" );
            }
            
            int noOfDays = 0; 
    		if(invest_tenure == 3) {
    			noOfDays = 90;
    		} else if (invest_tenure == 6) {
    			noOfDays = 180;
    		} else if(invest_tenure == 12) {
    			noOfDays = 365;
    		}
    	     Calendar cal = Calendar.getInstance();
    	     Date cdate = cal.getTime();
    	     cal.add(Calendar.DAY_OF_YEAR, noOfDays);
    	     Date date = cal.getTime();
    	    
            System.out.println("\n\tRegistration Date : "+ cdate);
            System.out.println("\n\tMaturity Date : "+ date);
         
            
            profitpayabletocust = invest_amount * percent/100 * 30/365;
            accumulatedprofit = profitpayabletocust * invest_tenure ;
            totalamount = invest_amount + accumulatedprofit ;
            
            System.out.println("");
            System.out.format("\tProfit Payable to Customer : RM %.2f", profitpayabletocust);
            System.out.println("\n");
            System.out.format("\tAccumulated Profit : RM %.2f", accumulatedprofit);
            System.out.println("\n");
            System.out.format("\tTotal Amount : RM %.2f", totalamount);
            System.out.println("\n");
            
            a = invest_amount;
            b = percent;
            c = invest_tenure;
             
            futureInvestmentValue(a,b,c);  
            
            System.out.println("*This is computer generated receipt, no signature required. ");
            System.out.println("__________________");                  
                
     }
     static void exitSystem(String exit) {
        System.out.println("------------------------------------------------ \n");
        System.out.println(" \tTHANK YOU FOR USING OUR SERVICE.  \n");
        System.out.println("------------------------------------------------ \n");
     }

}