import java.util.Scanner;
public class Week8_66011212067 {
    public static void main(String[] args){
        int n = input_int("input count Student: ");
        People[] people = new People[n];
        for(int i=0; i<n; i++){
            System.out.println("********************************************");
            people[i] = new People(input_str("Name: "));
            people[i].setMid(input_int("midterm: "));
            people[i].setFin(input_int("final: "));
        }
        String []max_string = {"","",""};
        String []min_string = {"","",""};
        int []max_int = {0,0,0};
        int []min_int = {0,0,0};
        int []result = {0,0,0};
        System.out.println("********************************************");
        print_strArray("Name","Midterm","Final","Score","Grade");
        for(int i=0;i<n;i++){
            result[0] += people[i].getMid();
            result[1] += people[i].getFin();
            result[2] += people[i].getScore();
            print_DataPeople(people[i].getName(),people[i].getMid(),people[i].getFin(),people[i].getScore(),people[i].getGrade());
            if(people[i].getMid()>max_int[0]){
                max_string[0] = people[i].getName();
                max_int[0] = people[i].getMid();
            }
            if(people[i].getFin()>max_int[1]){
                max_string[1] = people[i].getName();
                max_int[1] = people[i].getFin();
            }
            if(people[i].getScore()>max_int[2]){
                max_string[2] = people[i].getName();
                max_int[2] = people[i].getScore();
            }
            if(i==0){
                min_string[0] = people[i].getName();
                min_int[0] = people[i].getMid();
                min_string[1] = people[i].getName();
                min_int[1] = people[i].getFin();
                min_string[2] = people[i].getName();
                min_int[2] = people[i].getScore();
            }else{
                if(people[i].getMid()<min_int[0]){
                    min_string[0] = people[i].getName();
                    min_int[0] = people[i].getMid();
                }
                if(people[i].getFin()<min_int[1]){
                    min_string[1] = people[i].getName();
                    min_int[1] = people[i].getFin();
                }
                if(people[i].getScore()<min_int[2]){
                    min_string[2] = people[i].getName();
                    min_int[2] = people[i].getScore();
                }
            }
        }
        System.out.println("---------------------------------------");
        print_DataPeople("result",result[0],result[1],result[2],"");
        print_DataPeople("max",max_int[0],max_int[1],max_int[2],"");
        print_DataPeople("min",min_int[0],min_int[1],min_int[2],"");
        System.out.printf("%s\t%s\n","Max midterm",max_string[0]);
        System.out.printf("%s\t%s\n","min midterm",min_string[0]);
        System.out.printf("%s\t%s\n","Max Final",max_string[1]);
        System.out.printf("%s\t%s\n","min Final",min_string[1]);
        System.out.printf("%s\t%s\n","Max score",max_string[2]);
        System.out.printf("%s\t%s\n","min score",min_string[2]);
    }
    private static void print_strArray(String ...titles){
        System.out.printf("%s\t\t%s\t%s\t%s\t%s\n",titles[0],titles[1],titles[2],titles[3],titles[4]);
    }
    private static void print_DataPeople(String name,int mid,int fin,int score,String grade){
        System.out.printf("%s\t\t%d\t%d\t%d\t%s\n",name,mid,fin,score,grade);
    }
    private static int input_int(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        int number = sc.nextInt();
        return number;
    }
    private static String input_str(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        String text = sc.nextLine();
        return text;
    }
}

class People {
    private String name;
    private int mid;
    private int fin;
    private int score;
    private String grade;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String new_title) {
        this.name = new_title;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int new_number) {
        this.mid = new_number;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int new_number) {
        this.fin = new_number;
    }

    public int getScore() {
        this.score = this.mid+this.fin;
        return score;
    }

    public String getGrade() {
        this.grade = (this.score>=70)?"S":"U";
        return grade;
    }
}