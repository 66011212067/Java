import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Week15_66011212067 {
    static Week15_66011212067 met = new Week15_66011212067();
    public static void main(String[] args) {
        String path = "./data.xls";
        try{
            System.out.println("Code\tFname\tLname\tMidterm\tFinal\tScore\tGrade");
            
            FileWriter fw = new FileWriter(path);
            fw.write("Code\tFname\tLname\tMidterm\tFinal\tScore\tGrade\n");
            while(true){
                String id = met.inputStr("input Code : ");
                if(id.split("")[0].equals("0")){break;}
                Nisit  nisit = new Nisit();
                nisit.setId(id);
                nisit.setFname(met.inputStr("input Fname : "));
                nisit.setLname(met.inputStr("input Lname : "));
                nisit.setMid(met.inputInt("input Midterm : "));
                nisit.setFin(met.inputInt("input Final : "));
                fw.write(nisit.getId()+"\t"+nisit.getFname()+"\t"+nisit.getLname()+"\t"+nisit.getMid()+"\t"+nisit.getFin()+"\t"+nisit.getScore()+"\t"+nisit.getGrade()+"\n");
            }
            fw.close();
            Scanner rf = new Scanner(new File(path));
            while (rf.hasNextLine()) {
                System.out.println(rf.nextLine());
            }
        }catch(IOException err){}
    }
    String inputStr(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextLine();
    }
    Integer inputInt(String title) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextInt();
    }
}

class Nisit{
    public String id ="";
    public String firstName="",lastName="";
    public double midTerm=0,finalExam=0;
    public double score = 0;
    void setId(String id){
        this.id=id;
    }
    void setFname(String name){
        this.firstName=name;
    }
    void setLname(String name){
        this.lastName=name;
    }
    void setMid(double num){
        this.midTerm=num;
    }
    void setFin(double num){
        this.finalExam=num;
    }
    
    String getId(){
        return this.id;
    }
    String getFname(){
        return this.firstName;
    }
    String getLname(){
        return this.lastName;
    }
    String getGrade(){
        return (this.score>100||this.score<0)?"Error":"FFFFFDCBAAA".split("")[(int)(this.score/10)];
    }
    double getMid(){
        return this.midTerm;
    }
    double getFin(){
        return this.finalExam;
    }
    double getScore(){
        this.score = this.finalExam + this.midTerm;
        return this.score;
    }
}
