import java.util.Scanner;
class IFelseTest1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int farm = (int)sc.nextInt();
		float tax_persen, money_give, money_tax, money_remain;
		if(farm>10){
			tax_persen = 1.5f/100;
		}else{
			tax_persen = 0.5f/100;
		}
		money_give = farm*2500f;
		money_tax = money_give*tax_persen;
		money_remain = money_give-money_tax;
		System.out.println("is give money: "+money_give);
		System.out.println("is tax price: "+money_tax);
		System.out.println("is remain: "+money_remain);

		// float salary = (float) sc.nextInt();
		// float salary_10persen, add_salary, new_salaty;
		// salary_10persen = salary * 0.1f;
		// add_salary = (salary_10persen > 5000f) ? (salary * 0.25f) : (salary * 0.125f);
		// new_salaty = salary + add_salary;
		// System.out.printf("salary: %.0f\n10%%: %.2f\nadd salary: %.2f\nnew salary: %.2f\n", salary, salary_10persen, add_salary, new_salaty);

		// Scanner sc =new Scanner(System.in);
		// int salary;
		// salary = (int)sc.nextInt();
		// float salary_10persen,add_salary,new_salaty;
		// salary_10persen = salary*0.1f;
		// add_salary = (salary_10persen > 5000f) ? (salary * 0.25f) : (salary * 0.125f);
		// new_salaty = salary+add_salary;
		// System.out.printf("salary: %d\n10%: %.2f\nadd salary: %.2f\nnew salary: %.2f\n",salary,salary_10persen,add_salary,new_salaty);

		// int price;
		// price = (int)sc.nextInt(); 
		// float discount = price*0.15f;
		// float remain = price-discount;
		// int[] cupong = {0,0,0};
		// if(remain>1000){
		// 	cupong[0] = (int)remain/1000;
		// }
		// remain = remain-(1000*cupong[0]);
		// if(remain>500){
		// 	cupong[1] = (int)remain/500;
		// }
		// remain = remain-(500*cupong[1]);
		// if(remain>100){
		// 	cupong[2] = (int)remain/100;
		// }
		// remain = remain-(100*cupong[1]);
		// System.out.printf("price: %d\ndiscount: %f\nremain: %f\ncupong1000: %d cupong500: %d cupong100: %d\n",price,discount,remain,cupong[0],cupong[1],cupong[2]);




		//int money;
		//money = (int)sc.nextInt();
		//double tax = money*0.155;
		//if(tax>100_000){
		//	float price = money*0.000025f;
		//	float remain = money-price;
		//	System.out.printf("tax = %f remain = %f\n",price,remain);
		//}
			
		//int price,money;
		//try(Scanner sc= new Scanner(System.in)){
		//	System.out.print("input price : ");
		//	price = (int)sc.nextInt();
		//	System.out.print("input pay : ");
		//	money = (int)sc.nextInt();
		//	System.out.println("******************************************");
		//	if(price<money){
		//		int change = money-price;
		//		System.out.printf("Change %d\n",change);
		//		System.out.println("Press any key to continue ...");
		//	}
		//}
	}
}
