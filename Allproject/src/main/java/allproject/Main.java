package allproject;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
    public static void main(String[] args)
    {
    	Scanner p=new Scanner(System.in);
    	while(true) {
    	   out.println("Enter your choice");
    	   out.println("1-Bankoperation 2-Shapesoperation 3-Studentoperation 4-Databaseconnect 5-Basicpoint\n"
    	   		+ "6-Creditcardoperation 7-listofbject 8-priorityCalc 9-wordfrequency 10-tictactoe 11-contactlist");
    	   int choice=p.nextInt();
    	   switch(choice)
    	   {
    	       case 1:
    	       {
    	    	  Bankoperation.bank();
    	    	   break;
    	       }
    	       case 2:
    	       {
    	    	   Shapesoperation.shape();
    	    	   break;
    	       }
    	       case 3:
    	       {
    	    	   Studentoperation.student();
    	    	   break;
    	       }
    	       case 4:{
    	    	  
    	    	     Jdbcconnect.database();
    	    	   break;
    	       }
    	       case 5:{
    	    	   Basicpoint.point();
    	    	   break;
    	       }
    	       case 6:
    	       {
    	    	   Creditcardoperation.card();
    	    	   break;
    	       }
    	       case 7:
    	       {
    	    	   Studenttest.objectlist();
    	    	   break;
    	       }
    	       case 8:
    	       {
    	    	   Prioritycalc.calc();
    	    	   break;
    	       }
    	       case 9:
    	       {
    	    	   try {
    	    	     Wordcount.word();
    	    	   }
    	    	   catch(Exception e)
    	    	   {
    	    		   out.print(e);
    	    	   }
    	    	   break;
    	       }
    	       case 10:
    	       {
    	    	   Tictactoe.tic();
    	    	   break;
    	       }
    	       case 11:
    	       {
    	    	   Contactslist.contact();
    	    	   break;
    	       }
    	       default:
    	       {
    	    	   System.exit(0);
    	       }
    	       
    	   }
    	}
    	
    	
    	
    }
	
	
	
	
}
