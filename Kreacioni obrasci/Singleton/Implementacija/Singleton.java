
public class Singleton {

	protected Singleton()
	{
		//in fact what you need and for what you use your singleton
	}
	
	static private Singleton uniqueInstance = null;
	
	static public Singleton getInstance()
	{
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
	
		return uniqueInstance;
	}
	
}
