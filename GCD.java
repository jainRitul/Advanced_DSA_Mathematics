
import java.util.*;
import java.io.*;
import java.lang.*;
class GCD {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(findGCD(a,b));
        System.out.println(findGCDByEuclid(a,b));
        System.out.println(findGCDByEucllid2(a,b));
        

    }
    static int findGCDByEucllid2(int a,int b){
        if(b==0)
        return a;

        return findGCDByEucllid2(b,a%b);
    }

    static int findGCDByEuclid(int a,int b){
        while( a!=b ){
           if(a>b)
            a = a - b;

           else
            b=b-a;
        }
        return a;
    }
    
    static int findGCD(int a,int b){
        int res = Math.min(a,b);
        while(res > 0){
            if(a % res == 0 && b % res == 0)
              break;
              res--;
         }return res;
        
    }
}
