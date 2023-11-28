import java.util.Scanner;
class TestWee2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float mother, child, income, father;
		System.out.print("Income: ");
		income = sc.nextInt();
		mother = (float)0.45*income;
		child = (float)0.15*income;
		father = (float)income - (mother+child);
		System.out.printf("Income = %.0f\n",income);
		System.out.printf("Mothter = %.1f\n",mother);
		System.out.printf("Mothter = %.1f\n",child);
		System.out.printf("Father = %.1f\n",father);
		System.out.printf("Press any key to continue...\n");
	}
}
