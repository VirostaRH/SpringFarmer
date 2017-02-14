package aula114.springmvc.domain;
import java.io.Serializable;
public class Creature implements Serializable
{	
	private String id;
	private String name;
	private int hungry;
	private int cleany;
	private boolean alive;

	public Creature() { }
	public Creature(String i, String n) 
	{
		id=i;
		name=n;
		hungry=0;
		cleany=100;
		alive = true;
	}

	public void setId(String id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHungry()
	{
		this.hungry++;
	}
	public void setCleany()
	{
		if (this.cleany!=1)
		{
			this.cleany--;
		}
		else
		{
			setAlive(false);
		}
	}
	public void setAlive(Boolean a)
	{
		this.alive=a;
	}

	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}

	public int getHungry()
	{
		return hungry;
	}
	public int getCleany()
	{
		return cleany;
	}
	public Boolean getAlive()
	{
		return alive;
	}

	public String toString()
	{
		return "ID-> "+id+" Nombre-> "+name + " Hambre-> " + hungry + " Limpieza-> "+cleany+" Estado->"+alive;
	}
}