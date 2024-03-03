import java.util.Scanner;
class Week13_66011212067{
    static Week13_66011212067 met = new Week13_66011212067();
    public static void main(String[] args){
        String title = met.input("input your text : ");        
        FormatStringToNumber format = new FormatStringToNumber(title);
        format.formatString();
        format.formatResult();
        format.show();
    }
    String input(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        String data = sc.nextLine();
        return  data;
    }
}
class FormatStringToNumber{
    private String data = "";
    private String format = "";
    private String addnumber = "";
    FormatStringToNumber(String data){
        this.data = data;
    }
    void formatString(){
        String num = "0123456789";
        String []substr = this.data.split("");
        String []resultStrings = {};
        for(String i : substr){
            if(num.indexOf(i) != -1){
                this.format += i;
            }
        }
        substr = this.format.split("");
        this.format = "";
        int sum = 0;
        for(int i=0; i<substr.length;i++){
            sum += Integer.parseInt(substr[i]);
            if(i<substr.length-1){
                this.format += substr[i]+"+";
            }else{
                this.format += substr[i];
            }
        }
        this.format += "="+sum;
        this.addnumber += sum;
    }
    void formatResult(){
        String []subResult = this.addnumber.split("");
        this.addnumber = "";
        int sum=0;
        for(int i=0; i<subResult.length;i++){
            sum += Integer.parseInt(subResult[i]);
            if(i<subResult.length-1){
                this.addnumber += subResult[i]+"+";
            }else{
                this.addnumber += subResult[i];
            }
        }
        this.addnumber += "="+sum;
    }
    void show(){
        System.out.println("*************************************************");
        System.out.println(this.data+" -->"+this.format+" -->"+this.addnumber);
        System.out.println("*************************************************");
    }
}
