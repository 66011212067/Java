import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
class WriteFilseMethod3 {
    public static void main(String[] args) {
        String file = "data.xlsx";
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter fileW = new FileWriter(file);
            // int x = 0;
            // while (true) {
            //     String title = sc.nextLine();
            //     if(title == "exit"){
            //         break;
            //     }
            //     fileW.write(title, 10, 10);
            //     fileW.close();
            // }
            fileW.write("CODE");
            fileW.write("NAME");
            fileW.write("MIDTERM");
            fileW.write("FINAL");
            fileW.write("SUM");
            fileW.close();
        }catch(IOException err1){}
    }
}
