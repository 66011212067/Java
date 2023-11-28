import java.util.Scanner;
class Sumation1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("input number 1 : ");
		int number1 = sc.nextInt();
		System.out.print("input number 2 : ");
		int number2 = sc.nextInt();

		float sum = number1+number2;
		System.out.printf("%d + %d = %.0f\n",number1,number2,sum);
		sum = number1-number2;
		System.out.printf("%d - %d = %.0f\n",number1,number2,sum);
		sum = number1*number2;
		System.out.printf("%d * %d = %.0f\n",number1,number2,sum);
		sum = (float) number1/number2;
		System.out.printf("%d / %d = %.2f\n",number1,number2,sum);
		sum = number1%number2;
		System.out.printf("%d %% %d = %.0f\n",number1,number2,sum);
	}
}
