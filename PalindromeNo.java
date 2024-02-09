/**
 * PalindromeNo
 */
class PalindromeNo {

    public static void main(String[] args) {
        int n =44898844;
        boolean ans = palindromeCheck(n);
        System.out.println(ans);
        boolean res = palindromeCheckByreverse(n);
        System.out.println(res);
    }
    static boolean palindromeCheckByreverse(int n){
        int temp = n ;
        int rev = 0;
        while (temp!=0) {
            int lastDigit = temp % 10;
            rev = rev *10 + lastDigit;
            temp = temp/10;
        }
        return n == rev;
    }
    static boolean palindromeCheck(int n){
        if(n<10) return true;
        String str = Integer.toString(n);

        int start = 0;
        int end = str.length() - 1;

        while (start< end) {
            if(str.charAt(start) != str.charAt(end))
            return false;

            start++;
            end--;
        }
        return true;

    }
}
// class PalindromeNo {
//     public static void main(String[] args) {

//        int n = 903409;
//        System.out.println(checkPali(n));
//        System.out.println(checkPaliByReverse(n));

//     }
//     static boolean checkPali(int n){
//         if(n<10) 
//          return true;
      
//         String s = Integer.toString(n);

//         int start = 0;
//         int end = s.length()-1;
//         while(start < end){
//             if(s.charAt(start) != s.charAt(end))
//             return false;

//             else
//             {
//                 start ++;
//                 end --;
//             }

//         }
//         return true;
//     }
//     static boolean checkPaliByReverse(int n){
//         if(n<10) 
//          return true;
      
       
//         int temp = n;
//         int rev = 0;
//         while (temp != 0) {
//             int lastDigit = temp % 10;
//             rev = rev * 10  + lastDigit;
//             temp = temp /10;
//         }
//         return (rev == n);
//     }

// }
