
class countDigit {

    //time complexity = o(d) where d is number of digits
   public static void main(String[] args) {
    int n = 9548434;
    System.out.println(countDigit(n));
   }
   static int countDigit(int n){
    if(n<10){
        return 1;
    }
    int count = 0;
    while (n>0) {
        count++;
        n = n/10;
    }
    return count;

   }
    
}