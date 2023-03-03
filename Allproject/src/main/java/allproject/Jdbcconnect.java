package allproject;

public class Jdbcconnect {
	private Jdbcconnect()
	{
		
	}

	public static void database() 
	{
		   Singleton a2=Singleton.getobject();
           try {
			a2.connect2db();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
           a2.closedbconnection();
	}

}
