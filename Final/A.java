import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class A{
    static A met = new A();
    public static void main(String[] args){
        String path = "A.txt";
        // String a = "I CAN SEE YOU";
        // String a = "HELLO WORLD";
        String a = "HAPPY NEW YEAR";
        System.out.println(met.processStringToInt(a));
        try{
            FileWriter fw = new FileWriter(path);
            fw.write(a+" = "+met.processStringToInt(a));
            fw.close();
        }catch(IOException e){};
    }
    String inputStr(String title){
        System.out.print(title);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    String[] strToArray(String str){
        return str.split(" ");
    }
    char[] strToCharArray(String str){
        return str.toCharArray();
    }
    String processStringToInt(String a){
        String result = "";
        for(int index=0;index<met.strToArray(a).length;index++){
            String sumChar = "";
            for(char c:met.strToCharArray(met.strToArray(a)[index])){
                sumChar += (int)c;
            }
            result += sumChar;
            if(index<met.strToArray(a).length-1){
                result +='+';
            }
        }
        return result;
    }
}