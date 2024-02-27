package work;
import java.util.Scanner;
public class Week8_66011212067 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input N: ");
        int n = sc.nextInt();

        int metic[][] = new int[n][n];
        float average[][] = new float[n][n];
        for(int i1=0;i1<metic.length;i1++){
            int avg=0;
            for(int i2=0;i2<metic.length;i2++){
                int random = (int) (Math.random()*10+1);
                metic[i1][i2] = random;
                avg = avg+random ;
            }
            average[i1][i1] = avg/n;
        }
        System.out.print("DATA: \n");
        for(int i1=0;i1<metic.length;i1++){
            for(int i2=0;i2<metic.length;i2++){
                System.out.print(metic[i1][i2]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("DATAAVERAGE: \n");
        for(int i1=0;i1<average.length;i1++){
            for(int i2=0;i2<average.length;i2++){
                if(average[i1][i2]>0){
                    System.out.print(average[i1][i2]+"\t");
                }else{
                    System.out.printf("%.0f\t",average[i1][i2]);
                }
            }
            System.out.print("\n");
        }
    }
}
