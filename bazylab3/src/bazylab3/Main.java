package bazylab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
	{
		public static String ip = "127.0.0.1";

		public static void main(String[] args)
			{
				int i = 1;
				
				if (i == 1)
				{
					GUI gui = new GUI();
				} else
				{
//					Login user1 = new Login("admin", "pwsz");
//					Mysql db1 = new Mysql(user1, ip, 3306);
//
//					String test[][];
//					String test2[];
//					String test3[];
//					String test4[];
//					test = db1.select("select * from filmy;");
//					test2 = db1.getColumns("select * from filmy;");
//					test3 = db1.getTables();
//					test4 = db1.getColumnTypes("select * from filmy;");
//					printArray(test2);
//					printArray(test4);
//					System.out.print("\n");
//					printArrayArray(test);
//					System.out.print("\n");
//					printArray(test3);
//					db1.close();
				}
			}

		public static void printArrayArray(String[][] tablica)
			{
				// evil copypaste magic https://stackoverflow.com/a/46018033
				System.out.println(
						Arrays.deepToString(tablica).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
			}

		public static void printArray(String[] tablica)
			{
				System.out.println(Arrays.deepToString(tablica));
			}
	}
