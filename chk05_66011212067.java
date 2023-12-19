import java.util.Scanner;
class chk05_66011212067
//66011212067 passapol sutatam
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int people = 0,sum_IGUNIT=0,sum_UNIT=0;
		//รับค่าจำนวนคนเข้ามา
		System.out.printf("input count people : ");
		people = (int)sc.nextInt();
		for(int i=0;i<people;i++){
			System.out.println("\n********************************************");
			System.out.printf("input [A,B,C,D,F] people[%d]: ",i+1);
			//รับค่าเกรด  ABCDF แล้วเอาไปเช็คที่ ฟังก์ชันแล้วจะได้เลขจำนวนเต็มออกมา ถ้าเกรดตรงตามเงื่อนไข จะได้ 0-4 ถ้าไม่ตรงจะได้ -1 ออกมา
			String grade = sc.next();
			int score = setGradeToNumber(grade);
			//รับค่าหน่วยกิต
			System.out.printf("input UNIT : ");
			int git = sc.nextInt();
			//เช็คว่าถ้าคะแนนมากกว่า 0 ให้ทำงานตปกติรงนี้  
			if(score>=0){
				sum_UNIT += git;//บวกทบเกรดเก็บไว้
				int IG_UNIT= score*git;//หาคะแนน หน่วยกิต+คะแนนเกรด
				sum_IGUNIT += IG_UNIT;//บวกทับคะแนนรวมไว้
				System.out.printf("IG = %d, UNIT = %d, IG*UNIT = %d",score,git,IG_UNIT);
			}else{
				System.out.printf("IG =  , UNIT = %d, IG*UNIT =   ",git);
			}
		}
		System.out.println("\n********************************************");
		float gpax = (float)sum_IGUNIT/sum_UNIT;//หา gpax โดย คะแนนรวมมาหารกับหน่วยกิตรวม
		System.out.printf("sum UNIT = %d\nIG*UNIT = %d\nGPAX = %f\n",sum_UNIT,sum_IGUNIT,gpax);
	}
	//ฟังก์ชันส่งตัวอักษร  ABCDF เข้ามาเพื่อแปลงเป็นตัวเลขส่งออกไป
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
