import java.util.Scanner;
class calgrade
//66011212067 passapol sutatam
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int people = 0,sum_IGUNIT=0,sum_UNIT=0;
		System.out.printf("input count people : ");
		people = (int)sc.nextInt();
		for(int i=0;i<people;i++){
			System.out.println("\n********************************************");
			System.out.printf("input [A,B,C,D,F] people[%d]: ",i+1);
			String grade = sc.next();
			int score = setGradeToNumber(grade);
			System.out.printf("input UNIT : ");
			int git = sc.nextInt();
			if(score>=0){
				sum_UNIT += git;
				int IG_UNIT= score*git;
				sum_IGUNIT += IG_UNIT;
				System.out.printf("IG = %d, UNIT = %d, IG*UNIT = %d",score,git,IG_UNIT);
			}else{
				System.out.printf("IG =  , UNIT = %d, IG*UNIT =   ",git);
			}
		}
		System.out.println("\n********************************************");
		float gpax = (float)sum_IGUNIT/sum_UNIT;
		System.out.printf("sum UNIT = %d\nIG*UNIT = %d\nGPAX = %f\n",sum_UNIT,sum_IGUNIT,gpax);
	}
	private static int setGradeToNumber(String grade){
		int number;
		switch (grade){
			case "A" -> number = 4;
			case "B" -> number = 3;
			case "C" -> number = 2;
			case "D" -> number = 1;
			case "F" -> number = 0;
			default -> number = -1;
		}
		return number;
	}
}
