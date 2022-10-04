package greatest;

import java.util.Scanner;


public class MaxOfFour {
	public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         int n1 = in.nextInt();
         System.out.print("Input second number: ");
         int n2 = in.nextInt();
		 System.out.print("Input third number: ");
         int n3 = in.nextInt();
         System.out.print("Input fourth number: ");
         int n4 = in.nextInt();
          if( n1 >= n2 && n1 >= n3 && n1 >= n4)
            System.out.println(n1 + " is the largest number.");
          else if (n2 >= n1 && n2 > n3 && n2 > n4)
             System.out.println(n2 + " is the largest number.");
          else if (n3 >= n1 && n3 > n2 && n3 > n4) 
            System.out.println(n3 + " is the largest number.");
            else 
            System.out.println(n4 + " is the largest number.");
    }
}


