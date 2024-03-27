public class D {
    static D met = new D();
    public static void main(String[] args){
        // String x1 = "ONe ZeRO zero";
        // String x2 = "+";
        // String x3 = "Four nine";
        
        String x1 = "One FIVE oNE twO NINE";
        String x2 = "-";
        String x3 = "Nine seveN THREE SEVEN";
        
        int number1 = met.formatStrToInt(x1);
        int number2 = met.formatStrToInt(x3);
        int result = met.processParames(x2,number1,number2);
        System.out.println(number1+" + "+number2+" = "+result);

        String fomatInttoString = "";
        for(String x : String.valueOf(result).split("")){
            fomatInttoString += met.formatStringIntToStr(x)+" ";
        }
        System.out.println(fomatInttoString);
    }
    String formatStrToStr(String x){
        x = x.toLowerCase();
        String resutl = "0";
        switch(x){
            case "zoro" -> resutl ="0";
            case "one" -> resutl ="1";
            case "two" -> resutl ="2";
            case "three" -> resutl ="3";
            case "four" -> resutl ="4";
            case "five" -> resutl ="5";
            case "six" -> resutl ="6";
            case "seven" -> resutl ="7";
            case "eight" -> resutl ="8";
            case "nine" -> resutl ="9";
        }
        return resutl;
    }
    String formatStringIntToStr(String x){
        String result ="";
        switch (x){
            case "0" -> result = "zoro";
            case "1" -> result = "one";
            case "2" -> result = "two";
            case "3" -> result = "three";
            case "4" -> result = "four";
            case "5" -> result = "five";
            case "6" -> result = "six";
            case "7" -> result = "seven";
            case "8" -> result = "eigth";
            case "9" -> result = "nine";
        }
        return result;
    }
    int formatStrToInt(String x){
        String sumx1 = "";
        for(String i1:x.split(" ")){
            sumx1 += met.formatStrToStr(i1);
        }
        return Integer.parseInt(sumx1);
    }
    int processParames(String parame,int num1,int num2){
        int result = 0;
        if(parame.equals("+")){
            result = num1 + num2;
        }else if(parame.equals("-")){
            result = num1 - num2;
        }else if(parame.equals("*")){
            result = num1 * num2;
        }else if(parame.equals("/")){
            result = num1 / num2;
        }else if(parame.equals("%")){
            result = num1 % num2;
        }
        return result;
    }
}
