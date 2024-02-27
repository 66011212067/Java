package work;
import java.util.Scanner;
class Week13_66011212067 {
    public static void main(String [] args){
        Week13_66011212067 input = new Week13_66011212067();
        System.out.println("***************************************************");
        // String test = "1-2015-41462-23-4";
        String test = input.inputStr("input numberid : ");
        PeopleID peopleid = new PeopleID(test);
        peopleid.showall();
        System.out.println("***************************************************");
    }


    private String inputStr(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextLine();
    } 
}
/**
 * PeopleID
 */ 
class PeopleID {
    private String staticid;
    private int[] id = new int[13];
    private int[] calID = new int[12];
    private int summation;
    private int numbermod;
    private int numberdelete;
    private String backnumberToCheck;
    private boolean statucthi;
    public PeopleID(String id){
        this.staticid = id;
        id = id.replaceAll("-", "");
        String []sub = id.split("");
        if(sub.length == 13){
            for(int i=0;i<13;i++){
                // System.out.println(Integer.parseInt(sub[i])+10);
                this.id[i] = Integer.parseInt(sub[i]);
            }
            step1();
            step2();
            step3();
            step4();
            step5();
        }else{
            System.out.println("ตัวเลขต้องมี 13 หลัก!!");
        }
    }
    void step1(){
        int x = 13;
        for(int i=0;i<12;i++){
            this.calID[i] = this.id[i]*x--;
        }
    }
    void step2(){
        for(int i : this.calID){
            this.summation += i;
        }
    }
    void step3(){
        this.numbermod = this.summation % 11;
    }
    void step4(){
        this.numberdelete = 11-this.numbermod;
        String x = String.valueOf(this.numberdelete);
        String []x1 = x.split("");
        this.backnumberToCheck =  x1[x.length()-1];
    }
    void step5(){
        boolean check = String.valueOf(this.id[12]).equals(this.backnumberToCheck);
        this.statucthi = (check)?true:false;
    }
    public void showall(){
        System.out.println(this.staticid +" --> "+this.statucthi);
    }
    
}



