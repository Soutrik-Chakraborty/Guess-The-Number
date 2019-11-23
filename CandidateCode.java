import java.util.*;
class CandidateCode {
    static int phi(int n)
    {
       
        float result = n;
 
   
        for (int p = 2; p * p <= n; ++p) {
           
            if (n % p == 0) {
           
                while (n % p == 0)
                    n /= p;
                result *= (1.0 - (1.0 / (float)p));
            }
        }
 
        if (n > 1)
            result *= (1.0 - (1.0 / (float)n));
 
        return (int)result;
    }
 
     
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            int l = sc.nextInt();
            for(int j = 1; j <= l; j++){
                System.out.print(phi(j)+" ");
            }
            System.out.println();
        }    
    }
}