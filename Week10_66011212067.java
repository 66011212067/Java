import java.util.Scanner;
public class Week10_66011212067 {
    static Week10_66011212067 met = new Week10_66011212067();
    public static void main(String[] args){
        int N = met.inputInt("input N :");
        System.out.println("Welcome To X/O game :)");
        char [][]bord = new char[N][N];
        met.fill_toCharArray(bord);
        met.printCharArray2D(bord);
        met.startGame(bord);
    }
    void startGame(char [][]bord){
        while (true) {
            String optin = met.inputChar("option X/O or E(exit) : ");
            if(optin.equals("E")){
                System.out.println("exit game X/O Thank you.");
                break;
            }else if(optin.equals("X")||optin.equals("x")){
                while (true) {
                    int X = met.inputInt("set X position X : ");
                    int Y = met.inputInt("set X position Y : ");
                    try{
                        if(bord[Y][X]!='X'&&bord[Y][X]!='O'){
                            bord[Y][X] = 'X';
                            met.setXtoArray2D(bord, X, Y);
                            break;
                        }else{
                            met.printStr_count("*",((int)Math.pow(bord.length,bord.length)));
                            System.out.printf("set X position x=%d, y=%d not emtry! input x,y again\n",X,Y);
                            met.printCharArray2D(bord);
                        }
                    }catch(Exception err){
                        met.printStr_count("*",((int)Math.pow(bord.length,bord.length)));
                            System.out.printf("set X position x=%d, y=%d can't set input x,y agin\n",X,Y);
                    }
                }
            }else if(optin.equals("O")||optin.equals("y")){
                while (true) {
                    int X = met.inputInt("set O position X : ");
                    int Y = met.inputInt("set O position Y : ");
                    try{
                        if(bord[Y][X]!='X'&&bord[Y][X]!='O'){
                            bord[Y][X] = 'X';
                            met.setYtoArray2D(bord, X, Y);
                            break;
                        }else{
                            met.printStr_count("*",((int)Math.pow(bord.length,bord.length)));
                            System.out.printf("set O position x=%d, y=%d not emtry! input x,y again\n",X,Y);
                            met.printCharArray2D(bord);
                        }
                    }catch(Exception err){
                        met.printStr_count("*",((int)Math.pow(bord.length,bord.length)));
                            System.out.printf("set O position x=%d, y=%d can't set input x,y agin\n",X,Y);
                    }
                }
            }
        }
    }
    void setXtoArray2D(char [][]X,int x,int y){
        X[y][x] = 'X';
        met.printCharArray2D(X);
    }
    void setYtoArray2D(char [][]X,int x,int y){
        X[y][x] = 'Y';
        met.printCharArray2D(X);
    }
    void printCharArray2D(char [][]x){
        met.printStr_count("*",((int)Math.pow(x.length,x.length)));
        System.out.printf("X-->\t");
        for(int i=0;i<x.length;i++){
            System.out.printf("%d\t",i);
        }
        System.out.printf("\n");
        met.printStr_count("-",((int)Math.pow(x.length,x.length)));
        for(int i=0;i<x.length;i++){
            System.out.printf("%d|\t",i);
            for(int j=0;j<x[i].length;j++){
                System.out.printf("%c\t",x[i][j]);
            }
            System.out.print('\n');
        }
        met.printStr_count("-",((int)Math.pow(x.length,x.length)));
    }
    void fill_toCharArray(char [][]x){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                x[i][j] = '-';
            }
        }
    }
    void printStr_count(String t,int c){
        for(int i=0;i<c;i++){
            System.out.print(t);
        }
        System.out.print("\n");
    }
    
    int inputInt(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextInt();
    }
    String inputChar(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextLine();
        // return (char) sc.next().charAt(0);
    }
}
