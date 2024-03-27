import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
public class B {
    public static void main(String[] args){
        String x = "cat brid butterfly ant bird ant ant brid cat termite stop";
        // toLowerCase And remove stop word
        x = x.toLowerCase();
        x = x.replace("stop","");
        // create variables
        HashMap<String,Integer>datas = new HashMap<String,Integer>();
        ArrayList<String>listWord = new ArrayList<String>();
        // loop set
        for(String i:x.split(" ")){
            if(datas.get(i)==null){
                datas.put(i, 1);
                listWord.add(i);
            }else{
                int count = datas.get(i).intValue()+1;
                datas.put(i, count);
            }
        }
        String path = "B.txt";
        try{
            FileWriter fw = new FileWriter(path);
            // print show
            // System.out.println(x);
            fw.write(x+"\n");
            for(String i:listWord){
                fw.write(i+" = "+datas.get(i)+'\n');
                // System.out.println(i+" = "+datas.get(i));
            }
            fw.close();

        }catch(IOException e){}
    }
}
