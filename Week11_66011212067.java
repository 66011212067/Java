import java.util.Scanner;
public class Week11_66011212067 {
    static Week11_66011212067 fuc = new Week11_66011212067(); 
    public static void main(String[] args){
        // String title = "Hello my name is Supoat Wongsa I was born 1976 I have 36 years old.";
        String title = fuc.inputstr();
        fuc.print(fuc.checkCountNumber(fuc.charArrays(title.replaceAll(" ",""))),"Numeric");
        fuc.print(fuc.checkCountLower(fuc.charArrays(title.replaceAll(" ",""))),"Lowercase");
        fuc.print(fuc.checkCountUpper(fuc.charArrays(title.replaceAll(" ",""))),"Uppercase");
        fuc.print(title.split(" ").length,"Word");
    }
    private void print(int count, String text){
        System.out.println(count+" "+text);
    }
    private String inputstr(){
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        return title;
    }
    private char[] charArrays(String text){
        char []values=text.toCharArray();
        return values;
    }
    private int checkCountNumber(char []array){
        int count=0;
        String number = "01234567890";
        for(char i:array){
            if(number.indexOf(i)!=-1){
                count++;
            }
        }
        return count;
    }
    private int checkCountLower(char []array){
        int count=0;
        for(char i:array){
            if(Character.isLowerCase(i)){
                count++;
            }
        }
        return count;
    }
    private int checkCountUpper(char []array){
        int count=0;
        for(char i:array){
            if(Character.isUpperCase(i)){
                count++;
            }
        }
        return count;
    }
}
