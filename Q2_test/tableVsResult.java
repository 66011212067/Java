import java.util.ArrayList;
import java.util.Scanner;
class tableVsResult {
    public static void main(String[] args){
        int n = 4;
        ArrayList<ArrayList>sumArray = new ArrayList<ArrayList>();
        for (int i=0; i<n; i++) {
            ArrayList<String>a1 = new ArrayList<String>();
            for(int j=0; j<n-1; j++) {
                a1.add("Team:"+(i+1));
            }
            sumArray.add(a1);
        }
        
        ArrayList<ArrayList>teamVS = new ArrayList<ArrayList>();
        ArrayList<ArrayList>teamVS1 = sumArray;
        ArrayList<ArrayList>teamVS2 = sumArray;
        for(int i=0; i<n; i++) {
            System.out.println(i);
            for(int j=0; j<n-1; j++) {
            //     if(!a1.get(0).equals(a2.get(0))){
            //         System.out.printf("%s vs %s\n",a1.get(0),a2.get(0));
            //         sumArray.remove(a2.get(0));
            //     }
                teamVS1.get(i).remove(teamVS1.get(i).get(0));
            }
            System.out.println(teamVS1);
        }

    }    
}
