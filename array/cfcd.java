/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cfcd
{
    static long countDigits(long n)
    {
        long s=0;
        while(n>0)
        {
            long d=n%10;
            n=n/10;
            s=s+d;
        }
        return s;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(buf.readLine());
		for(int i=0;i<t;i++)
		{
		    int n=Integer.parseInt(buf.readLine());
		    long s1=0,s2=0;
		    for(int j=0;j<n;j++)
		    {
		    String st[]=(buf.readLine()).split(" ");
		    long chef=Long.parseLong(st[0]);
		    long morty=Long.parseLong(st[1]);
		    long pchef=countDigits(chef);
		    long pmorty=countDigits(morty);
		    if(pmorty>pchef)
		    s2=s2+1;
		    else if(pchef>pmorty)
		    s1=s1+1;
		    else
		    {
		        s1=s1+1;
		        s2=s2+1;
		    }
		    }
		    if(s1>s2)
		    System.out.println("0 "+s1);
		    else if(s2>s1)
		    System.out.println("1 "+s2);
		    else
		    System.out.println("2 "+s1);
		}
	}
}
