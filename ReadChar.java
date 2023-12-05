import java.io.IOException;
class ReadChar
{
	public static void main(String[] args){
		int title;
		char ch,ch1;
		try{
			//this 1 1line a-->A
			//ch=(char)System.in.read();
			//title = System.in.read();
			//ch=(char)title;
			//System.out.println(title);
			//System.out.println(ch);

			//this 2 1line asd --> a,s
			ch=(char)System.in.read();
			ch1=(char)System.in.read();
			System.out.println(ch);
			System.out.println(ch1);
		}catch(IOException test){
			
		}
		System.out.println();
	}
}