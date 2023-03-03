package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
class Calculator{
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	String str;
    String[] exp;
    char[] stack;
    int index=-1;
    int ansindex=0;
    String[] ans;
    HashMap<Character,Integer> map=new HashMap<Character,Integer>();
    int[] ansstack;
    int peek=-1;
    void insert(String temp)
    {
        ansstack[++peek]=Integer.parseInt(temp);
    }
    int getnum()
    {
        return ansstack[peek--];
    }
    void display()
    {
        out.print("Answer is:"+ansstack[peek]);
    }
}