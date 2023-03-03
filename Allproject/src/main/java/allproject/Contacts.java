package allproject;
class Contacts{
	String name;
	String email;
	String phoneno;
	Contacts next;
	Contacts(String name,String phoneno,String email)
	{
		this.name=name;
		this.email=email;
		this.phoneno=phoneno;
	}
}