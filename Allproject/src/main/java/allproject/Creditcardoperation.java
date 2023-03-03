package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Creditcardoperation implements Cloneable{
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
            String cardname;
            String cardnumber;
            String expirydate;
            Scanner p=new Scanner(System.in);
            protected Object clone()
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
            Creditcardoperation()
            {
            	out.println("Enter your name and cardnumber and expirydate");
            	this.cardname=p.next();
            	this.cardnumber=getcardnum();
            	this.expirydate=getdate();
            }
            boolean checkcardnumber(String str)
            {
            	if(this.cardnumber.equals(str))
            	{
            		out.println("Card number verified successfully.......");
            		return true;
            	}
            	else {
            		out.println("OOPs wrong card number");
            		return false;
            	}
            }
            String getcardnum()
            {
            	String num=p.next();
            	try {
            		Integer.parseInt(num);
            		return num;
            	}
            	catch(Exception e)
            	{
            		out.println("Card number should contain only number");
            		return getcardnum();
            	}
            }
            String getdate()
            {
            	out.println("Date should be in the format:MM-YYYY");
            	String date=p.next();
            	if(date.length()!=7)
            	{
            		return getdate();
            	}
            	else if(date.charAt(2)!='-')
            	{
            		return getdate();
            	}
            	else if(Integer.parseInt(date.substring(0, 2))<=0||Integer.parseInt(date.substring(0, 2))>12)
            	{
            		return getdate();
            	}
            	else {
            		return date;
            	}
            }
            public static void card() 
            {
            	Creditcardoperation a1=new Creditcardoperation();
            	Creditcardoperation a2=(Creditcardoperation)a1.clone();
            	out.println("Cloned Details:\ncardnumber:"+a2.cardnumber+"\ncardname:"+a2.cardname+"\nexpirydate:"+a2.expirydate);
            	out.println("verification status:"+a1.checkcardnumber(a2.cardnumber));
            }
}