import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
class WriteFilseMethod2 {
    public static void main(String[] args) {
        String file = "data.txt";
        try{
            PrintWriter bftF = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            String titles = "";
            while (true) {
                int x = System.in.read();
                if('x'==(char)x){
                    break;
                }
                titles += (char)x;
            }
            bftF.write(titles);
            bftF.close();
        }catch(IOException err1){}
    }
}
