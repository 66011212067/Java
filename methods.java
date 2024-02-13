public class methods {
    public static void main(String[] args){
        String number = "1011";
        int intNumber = Integer.parseInt(number); //str to int
        String strNumber = Integer.toBinaryString(intNumber); // number to banaricode
        String hexNumber = Integer.toHexString(intNumber); // number to base16
        String OctalNumber = Integer.toOctalString(intNumber); // number to base8
        String strNumber2 = Integer.toString(intNumber,16); // number to String radix base
        int checkgibnumber = Integer.compare(100,99); // check max number
        Character.isDigit('5'); // check string
        Character.isLetter('x'); // check string is tring true
        Character.isSpaceChar('x'); // check space
        Character ch = new Character('0');
        System.out.println(ch.toString()); // check upper text
        // title.charAt(title.length()-1) get index in text
        // title.compareTo(title) == (x) .equals
        // title.compareToIgnoreCase("hello") check == lower or upper .equalsIgnoreCase()
        // char[] data = {'a','A','B'};
        // String.copyValueOf(data) char array to String
        // String.copyValueOf(data, 0, 2) chat array [::] to String
        // title.endsWith("o") check text end
        // title.startsWith("H") check text start
        // title.split("ll")[1]
        // title.indexOf("asdas")
        // title.replace("H", "OK")
        // title.substring(1,2)..
        // title.toCharArray()[0]
        // title.tring() cut space \n \t 
    }
}
