import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;;
class test{
    public static void main(String[] args) throws IOException {
        // String title = "HEllo AA BB CC and FFF";
        // StringBuffer std = new StringBuffer(title);
        // StringBuffer std1 = std.insert(std.length(), " ");
        // StringBuffer std2 = std.deleteCharAt(0);
        // System.out.println(std);
        // System.out.println(replaseSpace(std));
        // /////////////////////////////////////////////////////////////////
        // Runtime runtime = Runtime.getRuntime();
        // try{
            // runtime.exec("notepad.exe");
            // runtime.exec("C:/Program Files/Google/Chrome/Application/chrome.exe");
            // runtime.exec("C:/Program Files/Microsoft Office/root/Office16/EXCEL.EXE");
        // }catch(IOException err){}
        // /////////////////////////////////////////////////////////////////
        // StringTokenizer token = new StringTokenizer("s1 as");// tolen this word
        // System.out.println(token.countTokens());
        // System.out.println(token.hashCode());
        // while (token.hasMoreTokens()) {
        //     System.out.println(token.nextToken());
        // }
        // /////////////////////////////////////////////////////////////////
        Date date = new Date();
        // System.out.println(date.toInstant());
        // System.out.println(date.getTime());
        // System.out.println(date.getDate());
        // System.out.println(date.getDay());
        // System.out.println(date.getMonth());
        // System.out.println(date.getYear());
        // System.out.println(date.getHours());
        // /////////////////////////////////////////////////////////////////
        // Calendar calender = Calendar.getInstance();
        // System.out.println(calender.DAY_OF_MONTH);
        // /////////////////////////////////////////////////////////////////
        // Locale lc = new Locale("th");
        // Locale lc = new Locale("en");
        // SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss {EEEE E} {MMMM MMM} {a,{zzzz z Z}}");
        // SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss {EEEE E} {MMMM MMM} {a,{zzzz z Z}}",lc);
        // System.out.println(sdfm.format(date));
        // /////////////////////////////////////////////////////////////////
        DecimalFormat dcm = new DecimalFormat("#,###,###.##");
        System.out.println(dcm.format(1233.12311155));


    }
    static StringBuffer replaseSpace(StringBuffer std){
        while (true) {
            int space = std.indexOf(" ");
            if(space <= 0){
                break;
            }else{
                std = std.replace(space,space+1, "");
            }
        }
        return std;
    }
}