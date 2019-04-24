public class Test
{
	public static void main(String[] args)
	{
		Console cons = System.console();
		String username = cons.readLine("user name:");
		char[] passwd = cons.readPassword("Password: ");
		System.out.println(username);
		System.out.println(passwd);
                this change is on web;
	}
}
