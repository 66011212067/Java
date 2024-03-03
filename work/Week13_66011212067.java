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
    private String result = "";
    FormatStringToNumber(String data){
        this.data = data;
        this.result += data+" -->,";
    }
    void formatString(){
        String num = "0123456789";
        String []substr = this.data.split("");
        this.data = "";
        for(String i : substr){
            if(num.indexOf(i) != -1){
                this.format += i;
            }
        }
    }
    void formatResult(){
        while (true) {
            if(this.format.split("").length<=1){
                break;
            }else{
                String []substr = this.format.split("");
                int sum = 0;
                String resultdata ="";
                for(int i=0;i<substr.length;i++){
                    sum += Integer.parseInt(substr[i]);
                    if(i<substr.length-1){
                        resultdata += substr[i]+"+";
                    }else{
                        resultdata += substr[i];
                    }
                }
                this.format = ""+sum;
                resultdata += "="+sum+",";
                this.result += resultdata;
            }
        }
    }
    void show(){
        System.out.println("*************************************************");
        String []subResult = this.result.split(",");
        for(int i=0; i<subResult.length;i++){
            if(i<subResult.length-1){
                System.out.print(subResult[i]+" -->");
            }else{
                System.out.print(subResult[i]+"\n");
            }
        }
        System.out.println("*************************************************");
    }
}
