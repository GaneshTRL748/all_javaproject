package allproject;

public class Jdbcconnect {

	public static void database() throws ClassNotFoundException
	{
		   Singleton a2=Singleton.getobject();
           a2.connect2db();
           a2.closedbconnection();
	}

}
