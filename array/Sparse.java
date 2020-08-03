import java.util.*;
class Sparse
{   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String s = sc.nextLine();

        String array1[]=new String[size];
        for(int i=0;i<size;i++)
        {
            array1[i]=sc.nextLine();
        }
        int qsize=sc.nextInt();
        s = sc.nextLine();

        String array2[]=new String[qsize];
        
        for(int i=0;i<qsize;i++)
        {
            array2[i]=sc.nextLine();
        }
        for(int i=0;i<qsize;i++)
        {
            int c=0;
            int str=array2[i].length();
            for(int j=0;j<size;j++)
            {
                if(str==array1[j].length()&& array1[j].equals(array2[i]))
                {
                    c++;
                }
            }
            System.out.println(c);
        }

    }
}
