import java.util.Scanner;
class formatStr {
    static formatStr met = new formatStr();
    public static void main(String[] args) {
        double number = met.getSetStrtoDouble(met.inputInt("input : "));
        // double number = met.getSetStrtoDouble("7*300");
        System.out.printf("%,.3f",number);
    }
    String inputInt(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title);
        return sc.nextLine();
    }
    double getSetStrtoDouble(String data){
        String []numbers = data.split("[%*/+-]");
        String []datas = data.split("");
        String operator = "";
        double result = 0;
        for(String i : datas){
            if(i.equals("-")){
                operator += "-";
            }else if(i.equals("+")){
                operator += "+";
            }else if(i.equals("*")){
                operator += "*";
            }else if(i.equals("/")){
                operator += "/";
            }else if(i.equals("%")){
                operator += "%";
            }
        }
        // System.out.println(operator);
        String []opraters = operator.split("");
        for(int i=0;i<numbers.length;i++){
            if(i==0){
                result = Double.parseDouble(numbers[i]);
            }else{
                result = met.SystemOperations(result,opraters[i-1],Double.parseDouble(numbers[i]));
            }
        }
        return result;
    }
    double SystemOperations(double a,String operarion,double b){
        double result = 0.0;
        if(operarion.equals("+")){
            result = a + b;
        }else if(operarion.equals("-")){
            result = a - b;
        }else if(operarion.equals("*")){
            result = a * b;
        }else if(operarion.equals("/")){
            result = a / b;
        }else if(operarion.equals("%")){
            result = a % b;
        }
        return result;
    }
}
