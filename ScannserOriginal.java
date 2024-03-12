import java.io.IOException;
class ScannserOriginal{
    public static void main(String[] args){
        try{
            String sum = "";
            while (true) {
                int x = System.in.read();
                char ch=(char)x;
                // ctrl + z == -1
                if(x==-1){
                    break;
                }
                sum += ch;
            }
            System.out.println(sum);
        }catch(IOException err){}
    }
}




