import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class C {
    public static void main(String[] args){
        try{
            int countLine = 0;
            int countUpper = 0;
            int countLower = 0;
            int countDigit = 0;
            String str = "";
            Scanner rd = new Scanner(new File("C.txt"));
            while (rd.hasNextLine()) {
                str += rd.nextLine();
                countLine +=1;
            }
            str = str.replaceAll(" ","");
            System.out.println(str);
            String titleX = ",.?/!`~%+-]*#$^&*()=[^<]*(?:\\";
            for(String i:str.split("")){
                if(titleX.indexOf(i)==-1){
                    if("0123456789".indexOf(i)==-1){
                        countUpper += (i.equals(i.toUpperCase())) ? 1 : 0;
                        countLower += (i.equals(i.toLowerCase())) ? 1 : 0;
                    }else{
                        countDigit += ("0123456789".indexOf(i)!=-1) ? 1 : 0;
                    }
                }
            }
            System.out.println(countUpper+"\tUpper Case");
            System.out.println(countLower+"\tLower Case");
            System.out.println(countDigit+"\tDigit");
            System.out.println(countLine+"\tLine");
        }catch(IOException e){}
    }
}
