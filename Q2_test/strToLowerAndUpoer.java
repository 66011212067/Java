class strToLowerAndUpoer{
    static strToLowerAndUpoer met = new strToLowerAndUpoer();
    public static void main(String[] args){
        String title = "interface";
        System.out.println(met.strToLoverAndUpper(title));
    }
    String strToLoverAndUpper(String title){
        String []titles = title.split("");
        String newtitle = "";
        for(int i=0; i<titles.length; i++){
            newtitle += (i%2==0) ? titles[i].toUpperCase() : titles[i].toLowerCase();
        }
        return newtitle;
    }
}