package allproject;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Jdbcconnect {
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	private Jdbcconnect()
	{
		
	}

	public static void database() 
	{
		   Singleton a2=Singleton.getobject();
           a2.connect2db();
           a2.closedbconnection();
	}

}
