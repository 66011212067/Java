import java.io.IOException;
class ReadChar
{
	public static void main(String[] args){
		int title;
		char ch;
		try{
			//ch=(char)System.in.read();
			title = System.in.read();
			ch=(char)title;
			System.out.println(title);
			System.out.println(ch);
		}catch(IOException test){
			
		}
		System.out.println();
	}
}