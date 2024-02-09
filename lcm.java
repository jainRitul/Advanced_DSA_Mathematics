class lcm {
    public static void main(String[] args){
        int a = 4;
        int b = 6;
        System.out.println(findLcm(a,b));
        System.out.println(findLcmByEuclid(a,b));
    }
    static int findLcm(int a,int b){
       int max = Math.max(a,b);
       while(true){
        if(max % a == 0 && max % b == 0){
            break;
        }
        max++;
       }
       return max;
    }
    static int findLcmByEuclid(int a,int b){
       int mul = a * b;
       int gcd = gcd(a,b);
       return mul/gcd;
    }
    static int gcd(int a,int b){
        if(b==0)
         return a;
        return gcd(b,a%b); 
    }
}

/**
 * lcm
 */
