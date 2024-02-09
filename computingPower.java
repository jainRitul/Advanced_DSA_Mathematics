class computingPower {
    public static void main(String[] args) {
        int a = 9;
        int n = 9;
        System.out.println(computePower(a,n));
        System.out.println(recursiveComputePower(a,n));
        System.out.println(iterativecomputePower(a,n));
        
    }

    static int iterativecomputePower(int a,int n){
        
        int res = 1;
        while(n > 0){
            if(n % 2 != 0)
             res = res * a;
            
            a = a*a;
            n = n>>1; 

        }return res;

    }

    static int recursiveComputePower(int a,int n){
        if(n == 0 )
        return 1;

        int temp = recursiveComputePower(a,n/2);
        temp  = temp * temp;

        if(n%2 == 0)
          return temp;
        else
          return temp * a;
    }

    static int computePower(int a,int n){
        if(n==0) return 1;
        if(n==1) return a;
        
        int ans = 1;
        for(int i = 0 ; i<n ; i++){
             ans  *= a;
        }
        return ans;
    }
}



