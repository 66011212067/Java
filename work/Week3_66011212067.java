package work;
import java.util.Scanner;
class Week3_66011212067
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		float market_price, rice, compensate,money_sell_rice,money_compensate,moneyAll;
		System.out.print("market_price: ");
		market_price = sc.nextInt();
		System.out.print("rice (Kg): ");
		rice = sc.nextFloat();
		if(market_price>=15){
			compensate = 0.73f/100;		
		}else{
			compensate = 3.25f;
		}
		money_sell_rice = (rice*1000)*market_price;
		money_compensate = (rice*1000)*compensate;
		moneyAll = money_sell_rice+money_compensate;
		//System.out.println("market_price: "+);
		System.out.printf("market_price\trice(Kg)\tmoney sell rice\t\tmoney compensate\tresult\n");
		System.out.printf("\t%.0f\t%.2f\t\t%.0f\t\t\t%.2f\t\t%.2f\n",market_price,rice,money_sell_rice,money_compensate,moneyAll);
	}
}
