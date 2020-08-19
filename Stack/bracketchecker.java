import java.util.*;
import java.io.*;
class Stackx{
    private int top;
    private char arr[];
    private int maxSize;
    public Stackx(int max)
    {
        top=-1;
        maxSize=max;
        arr=new char[maxSize];
    }
    public void push(char i)
    {
        arr[++top]=i;
    }
    public char pop(){
        return arr[top--];
    }
    public char peek()
    {
        return arr[top];
    }
    public boolean isEmpty()
    {
        return (top==-1);
        /*if(top==-1)
        {
            return True;
        }
        else{
            return False;
        }*/
    }
}
class BracketApp{
    private String input;

    public BracketApp(String in)
    {
        input=in;
    }
    public void check(){
        int Stacksize=input.length();
        Stackx obj=new Stackx(Stacksize);
        for(int k=0;k<input.length();k++)
        {
            char ch=input.charAt(k);
            switch(ch)
            {
                case '{':
                case '[':
                case '(':
                    obj.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!obj.isEmpty())
                    {
                        char chx=obj.pop();
                        if(chx=='{'&& ch=='}' || chx=='['&& ch==']' || chx=='('&& ch==')'  )
                        {
                            System.out.println("Error: "+ch+" "+k);
                        }
                        else
                        {
                               System.out.println("Error: "+ch+" "+k);
                            
                        }
                    }
                    break;
                default:
                    break;
                
            }
        }
        
        if(!obj.isEmpty())
        {
            System.out.println("missing at ");
            
        }
        
    }
    
}
class Bracket{
    public static void main(String args[]) throws IOException{
        String input;
        while(true)
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            input=br.readLine();
            if(input.equals(""))
                break;
            BracketApp obj1=new BracketApp(input);
            obj1.check();
            
        }
        
        
    }
}
