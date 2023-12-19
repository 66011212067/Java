import java.util.Scanner;
class w5_work_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int l = 5,result=0;
		for(int i=0;i<l;i++){
			System.out.printf("input number[%d] : ",i+1);
			result += sc.nextInt();
		}
		System.out.println("result = "+result);
	}
}
