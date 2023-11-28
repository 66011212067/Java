import java.util.Scanner;
class Cscanner{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean status;
		System.out.print("input True or False: ");
        status = input.nextBoolean();
        System.out.println(status);
		if(status && status==true){
			int age;
			System.out.print("input Age: ");
			age = input.nextInt();
			System.out.println(age);	

			System.out.print("input name: ");
			String name;
			name = input.next();
			name = input.nextLine();
			System.out.println(name);

		}
    }
} 