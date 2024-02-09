class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        System.out.println(recFact(n));
    }
    static int recFact(int n){
        if(n==0 || n==1)
        return 1;

        return recFact(n-1) * n;
    }
    static int fact(int n){
        if(n == 0 || n==1)
        return 1;

        int fact = 1;
        for(int i=2;i<=n;i++){
           fact = fact * i;
        }
        return fact;
    }
}


