import java.util.Arrays;

public class Array_method {
    public static void main(String[] args){
        // ************************************************************
        // int numbers[][] = new int[3][4];
        // for(int i1=0;i1<3;i1++){
        //     for(int i2=0;i2<4;i2++){
        //         numbers[i1][i2] = (int) (Math.random()*100+65);
        //     }
        // }
        // for(int i1=0;i1<3;i1++){
        //     for(int i2=0;i2<4;i2++){
        //         System.out.print(numbers[i1][i2]+"\t");
        //     }
        //     System.out.print("\n");
        // }
        // int metic[][] = {{1,1},{1,2,3,4,5,6},{8,9,9}};
        // for(int i1=0;i1<metic.length;i1++){
        //     for(int i2=0;i2<metic[i1].length;i2++){
        //         System.out.printf("%d\t",metic[i1][i2]);
        //     }
        //     System.out.printf("\n");
        // }
        // ************************************************************
        int A[]={1,2,3,4,5,6};
        int B[]={11,12,13,14,15,16};
        int C[]={21,22,23,24,25,26};
        // System.arraycopy(A,3,B,0,3);
        Arrays.sort(A);
        int re = Arrays.binarySearch(A, 5);
        // System.out.println(re);
        // ************************************************************
        Arrays.fill(A,5);
        for(int i:A){
            System.out.println(i);
        }
        // ************************************************************
    }
}
