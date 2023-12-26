public class timesleep {
    public static void main(String[] args) {
        for(int i=24;;i--){
            try{
                Thread.sleep(100);
                System.out.print("\r"+i+" ");
                if(i==0){
                    i = 24;
                }
            }catch(InterruptedException err){
                System.out.println(err);
            }
        }
    }
}
