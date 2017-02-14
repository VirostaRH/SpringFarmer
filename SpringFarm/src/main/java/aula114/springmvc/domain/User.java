package aula114.springmvc.domain;

public class User 
{	
	private String id;
	private String name;
	private String email;

	public User() { }
	public User(String i, String n, String e) 
	{ 
	  id=i;
	  name=n;
	  email=e;
	}

	public String getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String e)
	{
		this.email = e;
	}
	public void setName(String n)
	{
		this.name = n;
	}

	public void setId(String i)
	{
		this.id=i;
	}

	public String toString()
	{
		return "Id = "+ id +"Name = "+name+" Email="+email;
	}
}