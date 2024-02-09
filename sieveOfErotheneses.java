import java.util.Arrays;

class sieveOfErotheneses {
    public static void main(String[] args) {
        int n = 10;
        findPrimeNoLessthanGivenNo(n);

        sieveOfErothenesesFun(n);

        sieveOfErothenesesFunMoreImproved(n);
    }
     
    static void sieveOfErothenesesFun(int n){

        boolean sieve[] = new boolean[n+1];
        Arrays.fill(sieve, true);

        for(int i = 2 ; i * i <= n; i++)
            if(sieve[i])
                for(int j = 2*i ; j <= n ; j = j + i)
                    sieve[j] = false;
        

        for(int i = 2 ; i<= n ; i++){
            if(sieve[i] == true){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
    static void sieveOfErothenesesFunMoreImproved(int n){

        boolean sieve[] = new boolean[n+1];
        Arrays.fill(sieve, true);

        for(int i = 2 ; i  <= n; i++)
        {
            if(sieve[i]){
            System.out.print(i + " ");

                for(int j = i*i ; j <= n ; j = j + i)
                    sieve[j] = false;

            }
        }
        System.out.println();
    }

    static void findPrimeNoLessthanGivenNo(int n){
       
        for(int i = 2 ; i<= n ; i++){
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }System.out.println();
    }
    static boolean checkPrime(int n){
        if(n==1) return false;

        if(n==2 || n==3) return true;

        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }

        for(int i = 5 ; i * i <= n ; i++)
            if( n % i == 0 && n % (i+2) == 0)
                return false;
            
        
        return true;
    }
}


