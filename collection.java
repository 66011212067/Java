import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
class collection {
    public static void main(String[] args){
    // ************ ArrayList ******************************************************
    //    ArrayList arLst = new ArrayList<>();
    //    System.out.println(arLst.size()); 
    //    System.out.println(arLst.isEmpty()); 
    //    arLst.add(12);
    //    System.out.println(arLst);

    //    ArrayList <Integer>arLstInt = new ArrayList<Integer>();
    //    arLstInt.add(1);
    //    arLstInt.add(2);
    //    arLstInt.add(3);
    //    arLstInt.add(4);
    //    arLstInt.remove(1);
    //    System.out.println(arLstInt.get(0)); 
    //    System.out.println(arLstInt.size());
    //    System.out.println(arLstInt.contains(11));  check data in varible
    //    for(int i : arLstInt){
            // System.out.println(i);
    //    }

    // *********** set *******************************************************
        // HashSet hst = new HashSet<>();
        // HashSet <String>nameStudent = new HashSet<String>();
        // nameStudent.add("Jo");
        // nameStudent.add("max");
        // nameStudent.add("Zer");
        // nameStudent.add("Bob");
        // Iterator <String>itt =  nameStudent.iterator(); // เอาไว้เรียกค่า ถ้าไม่มี get
        // System.out.println(nameStudent.size());
        // for(int i=0;i<nameStudent.size();i++){
        //     System.out.println(itt.next()); 
        // }
        // while (itt.hasNext()) {
        //     System.out.println(itt.next()); 
        // }
        // for(String i :nameStudent ){
        //     System.out.println(i);
        // }
        // System.out.println(nameStudent.contains("Jo"));
        // System.out.println(nameStudent);
    // *********** map *******************************************************
        // HashMap <String,Integer>hsm = new HashMap<String,Integer>();
        // HashMap <String,HashMap>datas = new HashMap<String,HashMap>();
        // hsm.put("data1", 100);
        // hsm.put("data2", 100);
        // hsm.put("data3", 100);
        // datas.put("A",hsm);
        // hsm.put("data1", 20);
        // hsm.put("data2", 30);
        // hsm.put("data3", 0);
        // datas.put("B",hsm);

        // Set <String>keys1 = datas.keySet();
        // for(String key1 : keys1){
        //     System.out.println(datas.get(key1));
        //     HashMap data = datas.get(key1);
        //     @SuppressWarnings("unchecked")
        //     Set <String>keys2 = data.keySet();
        //     for(String key2 : keys2) {
        //         System.out.println(data.get(key2));
        //     }
        //     // Iterator <String>keys = data.keySet().iterator();
        //     // while(keys.hasNext()){
        //     //     System.out.println(data.get(keys.next()));
        //     // }
        // }
    // *********** Vector *******************************************************
        // import java.util.Queue; เพิ่มเข้าด้านหน้า
        // import java.util.Stack; เพิ่มเข้าด้านหลัง
        
    }
}
