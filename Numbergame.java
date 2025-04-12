import java.util.Scanner;

class Gam
{
	private boolean dec=true;
	private int count=0,n;
	public  void Check(int ran)
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=15;i++)
		{
			while(dec)
					{
					//System.out.println("Enter the number:");
						System.out.print("\u001B[38;5;163m"+"  → ");
				        n=sc.nextInt();
						if(count<=15)
						{
							
						if(ran==n)
						{
							System.out.println("...........................................");
							System.out.println("\u001B[31m"+"   🎉..Congratulation! Number is Right..🎉"+"\u001B[0m");
							count++;
							break;
						}
						else if(ran>n)
						{
							System.out.println("\u001B[34m"+"Number is Low! Try again"+"\u001B[0m");
							count++;
						}
						else
						{
							System.out.println("\u001B[31m"+"Number is High! Try again"+"\u001B[0m");
							count++;
						}
						}
						else
						{
							System.out.println("......................................");
							System.out.println("\u001B[31m"+"       Your Limit is end!"+"\u001B[0m");
							System.out.println("\u001B[31m"+"     Better Luck Next Time"+"\u001B[0m");
							System.out.println("......................................");
							System.exit(0);
						}
					}
			break;
			
		}
	}
	public void Show()
	{
		
			System.out.println("\u001B[34m"+"\t \t   Your Curroct Number is:"+n+"\u001B[0m");
			System.out.println("\u001B[32m"+"\t\t       Total Steps is:"+count+"\u001B[0m");
	}
}
public class Numbergame {

	public static void main(String[] args)
	{
		int randomNum = (int)(Math.random() * 101); 
		//System.out.println(randomNum);
		 String reset = "\u001B[0m";
		System.out.println("\u001B[31m"+"       .......Welcome To......"+reset);
		System.out.println("\u001B[34m"+"  🎮.....Number Guessing Game....🎮"+reset);
		System.out.println("\u001B[32m"+"  Guess the Number Between 1 to 100"+reset);
		System.out.println("\u001B[30m"+"......................................"+reset);
		Gam g1=new Gam();
		g1.Check(randomNum);
		g1.Show();
	}

}
