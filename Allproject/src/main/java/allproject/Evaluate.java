package allproject;
class Evaluate extends Calculator
{
    void evaluate(char temp,Evaluate a1)
    {
        int x;
        int y;
        int ans;
        if(temp=='+')
        {
            x=a1.getnum();
            y=a1.getnum();
            ans=x+y;
            a1.ansstack[++a1.peek]=ans;
        }
        else if(temp=='-')
        {
            x=a1.getnum();
            y=a1.getnum();
            ans=y-x;
            a1.ansstack[++a1.peek]=ans;
        }
        else if(temp=='*')
        {
            x=a1.getnum();
            y=a1.getnum();
            ans=x*y;
            a1.ansstack[++a1.peek]=ans;
        }
        else if(temp=='/')
        {
            x=a1.getnum();
            y=a1.getnum();
            ans=y/x;
            a1.ansstack[++a1.peek]=ans;
        }
        else{
            
            x=a1.getnum();
            y=a1.getnum();
            ans=(int)Math.pow(y,x);
            a1.ansstack[++a1.peek]=ans;
        }
    }
}