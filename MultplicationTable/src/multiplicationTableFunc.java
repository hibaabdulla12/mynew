
public class multiplicationTableFunc {

	public static void main(String[] args) {

		System.out.println("MULTIPLICATION TABLE/n");
		int n=15;
		MultiplicationTable(15);
	}


	
		public static void MultiplicationTable(int tablesize)
		{
			for(int i=2;i<=tablesize;i++)
			{
				for(int j=1;j<=10;j++)
					
			System.out.print(" "+'\n' +i*j);
				System.out.println("\n---------------------- ");	
		}
		
System.out.println(" ");


	}

}
