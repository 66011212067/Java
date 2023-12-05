import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RegexJava 
{
	public static void main(String[] args) 
	{
		String name = "IT-512 lanme:p1assapol fname:sutatam id:2067";
		Pattern pattern = Pattern.compile("lname:[a-zA-Z]{3,10}\s",Pattern.CASE_INSENSITIVE);
		Matcher matcher  = pattern.matcher(name);
		boolean re = matcher.find();
		if(re){
			System.out.println(re);
		}else{
			System.out.println("no regex...");
		}
	}
// 	public static void main(String[] args) {
//     Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
//     Matcher matcher = pattern.matcher("Visit W3Schools!");
//     boolean matchFound = matcher.find();
//     if(matchFound) {
//       System.out.println("Match found");
//     } else {
//       System.out.println("Match not found");
//     }
//   }
}
