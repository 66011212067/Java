import java.io.FileOutputStream;
import java.io.IOException;
class WriteFilseMethod1 {
    public static void main(String[] args) {
        String file = "data.txt";
        try{
            FileOutputStream wrtF = new FileOutputStream(file,true); // true method 'a', false method 'w'
            while (true) {
                int x = System.in.read();
                if(x==-1){
                    break;
                }
                wrtF.write(x);
            }
        }catch(IOException err1){}
    }
}
