import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileMethod2 {
    public static void main(String[] args) {
        String path = "data.txt";
        try{
            BufferedReader df = new BufferedReader(new FileReader(path));
            while (true) {
                String x = df.readLine();
                if(x==null){
                    break;
                }
                System.out.println(x);
            }
        }catch(IOException err1){
            System.out.println(err1);
        }
    }
}
