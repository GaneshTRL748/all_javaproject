package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Singleton{
	Connection con;
	private String pass="ganeshS@123";
	private static Singleton  a1;
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	private Singleton()
	{
	    out.println("Instance created successfully");
	}
	public static Singleton getobject()
	{	
		if(a1==null)
		{
			a1=new Singleton();
		}
		return a1;
	}
	void connect2db() 
	{
		try {
 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root",pass);
 		   out.println("Database Connected Successfully");
 	   }
 	   catch(SQLException e)
 	   {
 		   out.println("oops something wentwrong"+e);
 	   }
	}
	void closedbconnection() 
	{
		try {
			con.close();
		}
		catch(SQLException e)
		{
			out.println("Oops something went wrong"+e);
		}
		finally{
	      	out.println("Databaseconnection CLosed Successfully");
		}
	}
}

