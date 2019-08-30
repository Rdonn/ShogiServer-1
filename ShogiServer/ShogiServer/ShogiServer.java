package ShogiServer;

public class ShogiServer 
{	
	public ShogiServer(String arg)
	{
		//Code goes here
	}
	
	public ShogiServer()
	{
		//this will eventually be default case
		//if there are no command line arguments
		this("");
	}
	
	public static void main(String[] args) 
	{
		if(args.length > 0)
		{
			new ShogiServer(args[0]);
		}
		else 
		{
			new ShogiServer();
		}
	}

}
