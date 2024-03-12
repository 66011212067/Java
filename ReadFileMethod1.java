import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadFileMethod1 {
    public static void main(String[] args) {
        // String path = "data.txt";
        String path = "ReadFile.java";
        try{
            FileInputStream file = new FileInputStream(path);
            while (true) {
                int x=file.read();
                if(x==-1){break;}
                char ch=(char)x;
                System.out.print(ch);
            }
        }catch(FileNotFoundException err1){
            System.out.println(err1);
        }catch(IOException err2){
            System.out.println(err2);
        }
    }
}
