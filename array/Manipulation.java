import java.io.*;
import java.util.*;
class Manipulation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            arr[l-1] += k;
            arr[r] -= k;
        }
        long max = 0;
        long c = 0;
        for (int i = 0; i < n; i++) {
            c += arr[i];
            if (c > max) 
            {
                max = c;
            }
        }
        System.out.print(max);
    }
}
