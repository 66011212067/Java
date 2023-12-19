import java.util.Scanner;
class Loop
{
	public static void main(String[] args) 
	{
		//int x = 7;
		/*while (x>2)
		{
			System.out.println(x);
			x-=1;
		}*/

		/*x = 3;
		do{
			System.out.println(x);
			x-=1;
		}
		while(x>1);*/
		int max,min;

		max = inputInt("input number : ");
		min = inputInt("input number : ");
		max = (max>min) ? max : min;
		while(min<=max){
			System.out.println(min);
			min += 1;
		}
	}

	private static int inputInt(String title){
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print(title);
		number = (int) sc.nextInt();
		return number;
	}
	private static int inputInt(){
		Scanner sc = new Scanner(System.in);
		int number;
		number = (int) sc.nextInt();
		return number;
	}
}
