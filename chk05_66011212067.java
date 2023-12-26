import java.util.Scanner;
class chk05_66011212067
//66011212067 passapol sutatam
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int people = 0,sum_IGUNIT=0,sum_UNIT=0;
		//�Ѻ��Ҩӹǹ��3�����
		System.out.printf("input count people : ");
		people = (int)sc.nextInt();
		for(int i=0;i<people;i++){
			System.out.println("\n********************************************");
			System.out.printf("input [A,B,C,D,F] people[%d]: ",i+1);
			//�Ѻ����ô  ABCDF ���������礷�� �ѧ��ѹ���Ǩ����Ţ�ӹǹ����͡�� ����ô�ç������͹� ���� 0-4 ������ç���� -1 �͡��
			String grade = sc.next();
			int score = setGradeToNumber(grade);
			//�Ѻ���˹��¡Ե
			System.out.printf("input UNIT : ");
			int git = sc.nextInt();
			//����Ҷ�Ҥ�ṹ�ҡ���� 0 ���ӧҹ�����ç���  
			if(score>=0){
				sum_UNIT += git;//�ǡ���ô�����
				int IG_UNIT= score*git;//�Ҥ�ṹ ˹��¡Ե+��ṹ�ô
				sum_IGUNIT += IG_UNIT;//�ǡ�Ѻ��ṹ������
				System.out.printf("IG = %d, UNIT = %d, IG*UNIT = %d",score,git,IG_UNIT);
			}else{
				System.out.printf("IG =  , UNIT = %d, IG*UNIT =   ",git);
			}
		}
		System.out.println("\n********************************************");
		float gpax = (float)sum_IGUNIT/sum_UNIT;//�� gpax �� ��ṹ�������áѺ˹��¡Ե���
		System.out.printf("sum UNIT = %d\nIG*UNIT = %d\nGPAX = %f\n",sum_UNIT,sum_IGUNIT,gpax);
	}
	//�ѧ��ѹ�觵���ѡ��  ABCDF ����������ŧ�繵���Ţ���͡�
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
