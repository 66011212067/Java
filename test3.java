class test3{
    public static void main(String[] args){
        int n = 191,count=0;
        for(int i=0;i<n;i++){
            if((i+1)%n==0){
                System.out.println(i+1);
                count+=1;
            }
        }
        System.out.println(count);
        System.out.println(checkPrime(count));
    }

    static String checkPrime(int number){
        for(int i=2;i<number;i++){
            if(number%i==0){return "is not prime"; }
        }
        return "is prime";
    }
}