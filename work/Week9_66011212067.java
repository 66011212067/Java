package work;
import java.util.Scanner;
public class Week9_66011212067 {
    public static void main(String[] args){
        Week9_66011212067 met = new Week9_66011212067();
        int [][]array_trangle = {{0,0},{0,0},{0,0}};
        char []title = {'Q','W','E'};
        for(int i=0;i<array_trangle.length;i++){
            met.printstr("***** "+title[i]+" *****");
            array_trangle[i][0] = met.intputint("x"+(i+1)+" : ");
            array_trangle[i][1] = met.intputint("y"+(i+1)+" : ");
        }
        // **********************************************************
        met.printstr("***** Show *****");
        double aSind = met.sideLength(array_trangle[0][0],array_trangle[1][0],array_trangle[0][1],array_trangle[1][1]);
        double bSind = met.sideLength(array_trangle[1][0],array_trangle[2][0],array_trangle[1][1],array_trangle[2][1]);
        double cSind = met.sideLength(array_trangle[2][0],array_trangle[0][0],array_trangle[2][1],array_trangle[0][1]);
        double sSum = met.sCal(aSind,bSind,cSind);
        double areaCal = met.areaCal(sSum,aSind,bSind,cSind);
        met.showResult("a(Q,W)\t",aSind);
        met.showResult("a(W,E)\t",bSind);
        met.showResult("a(E,Q)\t",cSind);
        met.showResult("S\t",sSum);
        met.showResult("Area\t",areaCal);
    }
    private void printstr(String title){
        System.out.println(title);
    }
    private void showResult(String title,double number){
        System.out.println(title+number);
    }
    private double areaCal(double s,double a,double b,double c){
        double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        return area;
    }
    private double sCal(double a,double b,double c){
        double s = (a+b+c)/2;
        return s;
    }
    private double sideLength(int x1,int x2,int y1,int y2){
        double side = Math.sqrt(Math.pow((x1-x2), 2)+(Math.pow((y1-y2), 2)));
        return side;
    }

    private int intputint(String title){
        System.out.printf("%s",title);
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        return data;
    }
}
