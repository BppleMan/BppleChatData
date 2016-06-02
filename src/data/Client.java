package data;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author BppleMan
 *
 */
public class Client implements Runnable
{
	Socket socket = null;

	/**
	 * 
	 */
	public Client()
	{
		try
		{
			socket = new Socket("localhost", 5555);
		}
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run()
	{

	}

	public static void main(String[] args)
	{
		(new Client()).run();
		Scanner sc = new Scanner(System.in);
		sc.next();
	}
}
