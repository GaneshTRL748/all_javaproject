package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Basicpoint implements Cloneable {
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	String x;
    String y;
    public Object clone()
    {
    	try {
           return super.clone();
    	}
    	catch(CloneNotSupportedException e)
    	{
    		out.println("Oops something went wrong"+e);
    		return "";
    	}
    }
    Basicpoint()
    {
      out.println("Enter the x and y coordinates:");
  	  this.x=getnumber();
  	  this.y=getnumber();
    }
    boolean checking(String tempx,String tempy)
    {
  	  if(this.x.equals(tempx)&&this.y.equals(tempy))
  	  {
  		  out.println("X and Y Coordinates are Equal");
  		  return  true;
  	  }
  	  else {
  		  out.println("X and Y Coordinates are NotEqual");
  		  return false;
  	  }
    }
    String getnumber()
    {
   	Scanner p=new Scanner(System.in);
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
       public static void point()
        {
            	  Basicpoint a1=new Basicpoint();
            	  Basicpoint a2=new Basicpoint();
            	  out.println(a1.checking(a2.x,a2.y));
            	  Basicpoint a3=(Basicpoint)a1.clone();
            	  out.println(a1.checking(a3.x,a3.y));
            	   a3.x="9.0";
            	  out.println(a1.checking(a3.x,a3.y)); 
          }
}

