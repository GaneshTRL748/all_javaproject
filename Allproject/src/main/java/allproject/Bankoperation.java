package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
public class Bankoperation{
    String accname;
    private int pinno;
    long accno;
    double  balance;
    static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
    Scanner p=new Scanner(System.in);
    Bankoperation()
    {
    	out.println("Enter your Name,Acc_Number,Balance,Pin_number");
		accname=p.next();
	    accno=Long.parseLong(getaccno());
		balance=Double.parseDouble(getnumber());
		pinno=Integer.parseInt(getpinno());
    }
    void deposit(double amount)
    {
        if(pinvalidation()){
              this.balance=balance+amount;
               out.println("Amount SuccessFully Credited");
        }
        else{
            out.println("Wrong Pin!!!!!!");
        }
    }
    void withdraw(double amount)
    {
        if(pinvalidation()){
        if(amount > this.balance)
        {
            out.println(" Insufficient Balance!!!!");
        }
        else{
             this.balance=balance-amount;
             out.println("Amount SuccessFully Debited");
        }
        }
        else{
              out.println("Wrong Pin!!!");
        }
    }
    boolean pinvalidation()
    {	
       out.println("Enter your PinNumber:");
        int pinv=Integer.parseInt(getpinno());
        return (this.pinno==pinv);
    }
    String balanceamount()
    {
        if(pinvalidation())
        {
          return  Double.toString(this.balance);
        }
        else {
        	return "";
        }   
    }
    String getaccno()
    {
    	
    	String acc=p.next();
    	try {
    	       Long.parseLong(acc);
    	       return acc;
    	}
    	catch(Exception e)
    	{
    		out.print("Acc number Should contain only number");
    		return getaccno();
    	}
    }
    String getpinno()
    {
    	
    	String pin=p.next();
    	try {
    	       Integer.parseInt(pin);
    	       return pin;
    	}
    	catch(Exception e)
    	{
    		out.print("Pin number Should contain only number");
    		return getpinno();
    	}
    }
    String getnumber()
    {
    	String num=p.next();
    	try {
    	       Double.parseDouble(num);
    	       return num;
    	}
    	catch(Exception e)
    	{
    		out.print("It should be a number");
    		return getnumber();
    	}
    }
    public static void bank()
    {
		Bankoperation a1= new Bankoperation();
    	while(true)
    	{
    		out.println("Enter your choice 1-deposit 2-withdraw 3-balanceamount");
    		int choice=Integer.parseInt(a1.getnumber());
    		switch(choice)
    		{
    		   case 1:
    		   {
    			   double amount=Double.parseDouble(a1.getnumber());
    			   a1.deposit(amount);
    			    break;
    		   }
    		   case 2:
    		   {
    			   double amount=Double.parseDouble(a1.getnumber());
    			   a1.withdraw(amount);
    			   break;
    		   }
    		   case 3:
    		   {
    			  String currentbal=a1.balanceamount();
    			  if(currentbal.equals(""))
    			  {
    				  out.println("oops wrong pin!!!!");
    			  }
    			  else {
    				  out.println("Your current blance:"+currentbal);
    			  }
    			 break;
    		   }
    		   default:
    		   {
    			   System.exit(0);
    			   break;
    		   }
    		}
    	}
         
    }
}