package TPException;

class Factorielle
{ 
	public static void main (String[] args)
{
		int i, nbEntiers=0, factorielle=1;
		int ancien;
		nbEntiers= Integer.parseInt(args[0]);
		for (i=2;i<= nbEntiers;i++)
		{
			ancien=factorielle;
			factorielle *= i;
		}
		System.out.println(" Voila la factorielle des "+ nbEntiers +
				" premiers entiers : "+ factorielle );
	}
	}
