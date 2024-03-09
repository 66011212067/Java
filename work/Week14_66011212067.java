package work;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Queue;
class Week14_66011212067 {
    static Week14_66011212067 met = new Week14_66011212067();
    public static void main(String[] args){
        try{
            met.start();
        }catch(IOException err){met.printStr("Programe Error.");}
    }
    String inptStr(String title) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextLine();
    }
    void start() throws IOException{
        ArrayList<String> datas = new ArrayList<String>(); 
        String op = "";
        String newdata = "";
        while (true) {
            try{
                met.printArrayList(datas);
            }catch(IOException err){met.printStr("Error type data, Can't show data.");}
            try{
                op = met.inptStr("Input [exit, add, remove]: ");
            }catch(IOException err){met.printStr("Input Error Input again.");}
            if("exit".equalsIgnoreCase(op)){
                try{
                    met.printArrayList(datas);
                }catch(IOException err){met.printStr("Error type data, Can't show data.");}
                met.printStr("stop programe.");
                break;
            }else if("add".equals(op)){
                try{
                    newdata = met.inptStr("Input [exit, add, remove]: ");
                }catch(IOException err){met.printStr("Input Error Input again.");}
                try{
                    datas = met.add(datas,newdata);
                }catch(IOException err){met.printStr("Can't add data.");}
            }else if("remove".equals(op)){
                try{
                    datas = met.remove(datas);
                }catch(IOException err){met.printStr("Can't remove data.");}
            }
        }
    }
    void printArrayList(ArrayList<String> datas) throws IOException{
        System.out.println("data is: "+datas);
    }
    void printStr(String title){
        System.out.println(title);
    }
    ArrayList<String> add(ArrayList<String> datas,String newdata) throws IOException{
        ArrayList<String> rets= new ArrayList<>(datas);
        rets.add(0,newdata);
        return rets;
    }
    ArrayList<String> remove(ArrayList<String> datas) throws IOException{
        if(!datas.isEmpty()){
            Queue<String> dataRemove = new LinkedList<>(datas);
            dataRemove.remove();
            ArrayList<String> rets = new ArrayList<>(dataRemove);
            return rets;
        }else{
            met.printStr("Can't remove data is Empty!");
            return datas;
        }
    }
}
