package work;
import java.util.Scanner;
public class Whk6_66011212067 {
    public static void main(String[] args) {
        int y=0,m=0,d=0;
        y = input("input year: ");
        m = input("input month: ");
        d = input("input day: ");
        System.out.println("YEAR:\tMONTH:\tDAY:");
        for(;d>=0;d--){
            try{
                Thread.sleep(50);
                System.out.printf("\r%d \t%d \t%d ",y,m,d);
            }catch(InterruptedException err){System.out.println(err);}
            if(d==0&&m!=0){
                d=30;
                m -= 1;
            }
            if(m==0&&y!=0){
                m=12;
                y -= 1;
            }
            if(y<0){break;}
        }
        System.out.println("\n.....BOOOOMMMMM.....");
        System.out.println("...HAPPY NEW YEAR...");
    }

    static int input(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        int number = (int) sc.nextInt();
        return number;
    }
}
