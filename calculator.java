import java.util.Scanner;

class calculator 
{

    public void menu()
	{
		System.out.println("1.Addition ");
		System.out.println("2.Substraction");
		System.out.println("3.Mutiplication");
		System.out.println("4.Division");
		
         Scanner sc=new Scanner(System.in);
	     int opt=sc.nextInt();

		if (opt==1)
		{
			Addition();
			menu();
		}
		else if (opt==2)
		{
			Substraction();
			menu();
		}
		else if (opt==3)
		{
			Mutiplication();
			menu();
		}
		else if (opt==4)
		{
			Division();
			menu();
		}

	}

	public void Addition()
	{
		 Scanner sc=new Scanner(System.in);
         System.out.println("enter 1st value"); 
	     int a=sc.nextInt();
		  System.out.println("enter 2nd value"); 
	     int b=sc.nextInt();

		 int result=a+b;
         System.out.println("Answer: "+result);
	}

	public void Substraction()
	{
		 Scanner sc=new Scanner(System.in);
         System.out.println("enter 1st value");
	     int c=sc.nextInt();
		 System.out.println("enter 2nd value");
	     int d=sc.nextInt();

		 int result=c-d;
         System.out.println("Answer: "+result);
	}

	public void Mutiplication()
	{
		 Scanner sc=new Scanner(System.in);
         System.out.println("enter 1st value");
	     int e=sc.nextInt();
		 System.out.println("enter 2nd value");
	     int f=sc.nextInt();

		 int result=e*f;
         System.out.println("Answer: "+result);
	}

	public void Division()
	{
		 Scanner sc=new Scanner(System.in);
         System.out.println("enter 1st value");
	     int g=sc.nextInt();
		 System.out.println("enter 2nd value");
	     int h=sc.nextInt();

		 int result=g/h;
         System.out.println("Answer: "+result);
	}
	

}
