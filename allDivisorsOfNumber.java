

class allDivisorsOfNumber {
    public static void main(String[] args) {
        int n = 100;
        findAllDivisors(n);
        findAllDivisorsEffieient(n);
    }

    static void findAllDivisorsEffieient(int n){
        int i ;
        for( i = 1 ; i*i < n;i++)
            if(n%i == 0)
                System.out.print(i+" ");
            
        for( ;i>=1;i--)
            if(n%i == 0)
             System.out.print(n/i + " ");
        
        System.out.println();
    }
    static void findAllDivisors(int n){
        for(int i=1 ; i*i <= n ; i++){
            if(n % i == 0){
                System.out.print(i+ " ");
                if(i != n/i)
                System.out.print(n/i+ " ");
            }
        }
        System.out.println();
    }
}

