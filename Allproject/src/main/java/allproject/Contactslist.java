package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Contactslist {
	private Contactslist()
	{
		
	}
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	private static Scanner p;
	public static void contact() {
		p = new Scanner(System.in);
		Operation a1=new Operation();
		int choice;
	      while(true)
	      {
	    	  out.print("\nEnter your Choice\n1-addcontact , 2-displaycontact,3-deletecontact,4-searchcontact,0-Exit");
	    	  choice=p.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 0:
	    	  {
	    		  System.exit(0);
	    		  break;
	    	  }
	    	  case 1:
	    	  {
	    		  a1.insertcontact();
	    		  break;
	    	  }
	    	  case 2:
	    	  {
	    		  a1.displaycontacts();
	    		  break;
	    	  }
	    	  case 3:
	    	  {
	    		  a1.deletecontact();
	    		  break;
	    	  }
	    	  case 4:
	    	  {
	    		  a1.searchcontact();
	    		  break;
	    	  }
	    	  default:
	    	  {
	    		 Main.main(null);
	    	  }
	    	  }
	      }
	}
}
		
