class equalStrFirstAndEnd {
    public static void main(String[] args){
        String []s = "foodpannd".split("");
        System.out.println(s[0].toLowerCase().equals(s[s.length-1].toLowerCase()));
    }
}