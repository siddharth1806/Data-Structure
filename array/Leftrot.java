import java.util.*;
class Leftrot{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int rot=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[(i+size-rot)%size]=sc.nextInt();

            
        } 
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }   
    }
}
