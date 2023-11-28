import java.util.Scanner;
class Week2_66011212067
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in)){
			float w, l, h, price, area, pay;
			price= (float)25.25;
			System.out.print("Width: ");
			w = sc.nextFloat();
			System.out.print("Length: ");
			l = sc.nextFloat();
			System.out.print("Height: ");
			h = sc.nextFloat();
			System.out.println("***************************************");
			area = (float)(w*h*2)+(l*h*2);
			pay = (float)area*price;
			System.out.printf("Area %.2f\n",area);
			System.out.printf("Area %.2f Bath\n",pay);
		}
	}
}
