import java.util.*;
import java.io.*;
class Reverse1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
