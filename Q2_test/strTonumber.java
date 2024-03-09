class strTonumber{
    static strTonumber met = new strTonumber();
    public static void main(String[] args){
        System.out.println(met.strtonumber("I CAN SEE YOU"));
        System.out.println(met.strtonumber("HELLO WORLD"));
        System.out.println(met.strtonumber("HAPPY NEW YEAR"));
    }
    String strtonumber(String data){
        String []datas = data.split("");
        String newData = "";
        for(String i : datas){
            newData += (i.equals(" ")) ? "+" : i.hashCode();
        }
        return newData;
    }
}