import java.util.Scanner;
public class Week8_66011212067 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input N: ");
        int n = sc.nextInt();

        int metic[][] = new int[n][n];
        float avg[] = new float[n];
        for(int i1=0;i1<metic.length;i1++){
            int avgs=0;
            for(int i2=0;i2<metic.length;i2++){
                int random = (int) (Math.random()*10+1);
                metic[i1][i2] = random;
                avgs = avgs+random ;
            }
            avg[i1] = avgs/n;
        }
        System.out.print("DATA: \n");
        for(int i1=0;i1<metic.length;i1++){
            for(int i2=0;i2<metic.length;i2++){
                System.out.print(metic[i1][i2]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("DATAAVERAGE: \n");
        for(int i1=0;i1<metic.length;i1++){
            for(int i2=0;i2<metic.length;i2++){
                if(i1==i2){
                    System.out.print(avg[i1]+"\t");
                }else{
                    System.out.print(0+"\t");
                }
            }
            System.out.print("\n");
        }
    }
}
