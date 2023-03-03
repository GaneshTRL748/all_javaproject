package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Studentoperation
{
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
    Scanner p=new Scanner(System.in);
    String stuname;
    String dob;
    double gpa;
    char gradelevel;
    Studentoperation()
    {
        this.stuname=p.next();
        this.gpa=Double.parseDouble(getnumber());
        this.gradelevel=getgrade();
        this.dob=getdate();
    }
    void updategpa(){
        double gpa1;
        if(validation()) {
          out.println("Enter yout current GpA:");
           gpa1=Double.parseDouble(getnumber());
           this.gpa=gpa1;
          out.println("GpA Updated Successfully!!!");
        }
        else {
        	out.println("Authentication Failed!!!!");
        }
    }
    boolean validation()
    {
    	out.println("Enter your DOB TO Update GPA");
    	String dobv=getdate();
    	return (this.dob.equals(dobv));
    }
    String display()
    {
        return this.stuname+" has a "+Double.toString(this.gpa)+" GPA";
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
     char getgrade()
     {
    	 char grade=p.next().charAt(0);
    	 if(Character.isAlphabetic(grade))
    	 {
    		 return grade;
    	 }
    	 else {
    		 out.println("Enter the vaalis grade level!!!");
    		 return getgrade();
    	 }
     }
     String getdate()
     {
    	 out.println("Date shouls be in the fomrat:DD.MM.YYYY");
    	 String date=p.next();
    	 if(date.length()!=10)
    	 {
    		 return getdate();
    	 }
    	 else if(date.charAt(2)!='.'||date.charAt(5)!='.')
    	 {
    		 return getdate();
    	 }
    	 else if(Integer.parseInt(date.substring(0,2))>31||Integer.parseInt(date.substring(0,2))<=0||Integer.parseInt(date.substring(3,5))>12
    		 ||Integer.parseInt(date.substring(3,5))<=0)
				{
					return getdate();
				}
				else {
					return date;
				}
     }
	public static void student() {
	   
	  out.println("Enter your name and gpa and grade and dob");
	   Studentoperation a1=new Studentoperation();
	   a1.updategpa();
	   out.println(a1.display());
	}
}