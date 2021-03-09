package dbAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection
	{

		private static Connection c = null;

		public static Connection connect()
			{

				try
				{
					c = DriverManager.getConnection("jdbc:sqlite:bazasql2");
					if ((c).isValid(0))
						System.out.println("polaczono");
					else
						System.out.println("brak polaczenia");
				} catch (SQLException e)
				{
				}
				return c;
			}

		public static void close()
			{

				try
				{
					if (c != null)
					{
						c.close();
						System.out.println("rozlaczono");
					}
				} catch (SQLException e)
				{
				}
			}
	}
