import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ReadFileMethod3 {
    public static void main(String[] args) {
        String path = "data.txt";
        try{
            Scanner df = new Scanner(new File(path));
            // System.out.println(df);
            // while (df.hasNext()) {
            //     System.out.println(df.next());
            // }
            // while (df.hasNextLine()) {
            //     System.out.println(df.hasNextLine());
            // }
            while(df.hasNextInt()) {
                System.out.print(df.nextInt());
                System.out.print(df.next());
            }
        }catch(IOException err1){
            System.out.println(err1);
        }
    }
}
