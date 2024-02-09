class CountDigitInNumber {
    public static void main(String[] args) {
       int num = 4533;
       int digit= countDigit(num);
       System.out.println(digit);
    }
    static int countDigit(int num){
        int ans = 0;
    
        while(num > 0){
           num = num / 10;
           ans +=1;
        }
        return ans;
    }
}
