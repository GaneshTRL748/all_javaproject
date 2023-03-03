package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
class Student  implements Comparable <Student> {
	 PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	Scanner p1=new Scanner(System.in);
   String studentname;
   double gpa;
   int age;
   Student()
   {
   
   }
   public void setter()
   {
   	out.println("Enter the studentname:");
   	this.studentname=p1.next();
   	out.println("Enter the age:");
   	this.age=Integer.parseInt(getnumber());
   	out.println("Enter the gpa:");
   	this.gpa=Double.parseDouble(getgpa());
   	
   }
   public Student getter()
   {
   	return this;
   }
   public int compareTo(Student s1)
   {
       if(this.gpa>s1.gpa)
       {
       	return -1;
       }
       else if(this.gpa<s1.gpa)
       {
       	return 1;
       }
       else {
       return 0;
       }
       
   }
   String getnumber()
   {
   	String num=p1.next();
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
   
   public String getgpa()
   {
   	String num=p1.next();
   	try {
   		if(Double.parseDouble(num)<=10)
   		{
   			return num;
   		}
   		else {
   			return getgpa();
   		}
   	}
   	catch(Exception e)
   	{
   		return getgpa();
   	}
   }
}