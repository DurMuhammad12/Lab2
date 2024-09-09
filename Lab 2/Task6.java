class Task6 {
    
    public static int countPrimes(int n) {
        if(n <= 2)return 0;

        boolean[] isPrime=new boolean[n];
        for(int i=2;i<n;i++){
            isPrime[i]=true;    }
    
        for(int p=2; p*p<n;p++){
            if(isPrime[p]){
                for(int multiple= p*p;multiple<n ;multiple +=p){
                    isPrime[multiple]=false;
                }}}
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }}
     return count;}
    public static void main(String[] args){
        int n1=10;
        System.out.println("Output: "+countPrimes(n1)); 

        int n2=0;
        System.out.println("Output: "+countPrimes(n2)); 

        int n3=1;
        System.out.println("Output: "+countPrimes(n3)); 
    }}