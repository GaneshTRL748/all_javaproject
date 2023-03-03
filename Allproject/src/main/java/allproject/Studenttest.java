package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Studenttest {
	public static void objectlist() {
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner p=new Scanner(System.in);
		 ArrayList<Student> a1=new ArrayList<Student>();
	      out.println("Enter the no of object:");
	     int num=p.nextInt();
	     for(int i=0;i<num;i++)
	     {
	        Student a=new Student();
	        a.setter();
	        a1.add(a);
	     }
	     out.println("The student details:");
	     for(int i=0;i<num;i++)
	     {
	    	 Student a2=a1.get(i).getter();
	    	 out.println("Name:"+a2.studentname+" Age:"+a2.age+" Gpa:"+a2.gpa);
	     }
	     Collections.sort(a1);
	     out.println("After sorting:");
	     for(int i=0;i<num;i++)
	     {
	    	 Student a2=a1.get(i).getter();
	    	 out.println("Name:"+a2.studentname+" Age:"+a2.age+" Gpa:"+a2.gpa);
	     }
	    }
}