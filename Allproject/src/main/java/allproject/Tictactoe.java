package allproject;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Tictactoe{
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	       char[][] arr;
	       int dim;
	       public void creategameboard()
	       {
	    	   this.arr=new char[this.dim][this.dim];
	    	   for(int i=0;i<this.dim;i++)
	    	   {
	    		   for(int j=0;j<this.dim;j++)
	    		   {
	    			   this.arr[i][j]=' ';
	    		   }
	    	   }
	       }
	     public void  displayboard()
	   	{
	    	 out.print("*".repeat((this.dim*this.dim)+1)+"\n");
	   		for(int i=0;i<this.dim;i++)
	   		{
	   			
	   			for(int j=0;j<this.dim;j++)
	   			{
	   				out.print(" "+arr[i][j]+" ");
	   			}
	   			out.print("\n");
	   		}
	   		out.print("*".repeat((this.dim*this.dim)+1)+"\n");
	   	}
	     public void playerfill(int num,char fill)
	     {
	    	  int x;
	    	  int y;
	    	  int pos;
	    	 if(num<=(this.dim*this.dim)) {
				    	   if(num%this.dim==0)
				    	 {
				    		  x=(num-1)/dim;
				 	          y=dim-1;
				    	 }
				    	 else {
				    		  x=num/dim;
				 	          y=(num%dim)-1;
				    	 }
				    	    fillposition(x,y,fill); 
				    	 }
	    	 else {
	    		 out.println("Position number is greater than gameboard!!!!!!");
	    		 pos=getnumber();
	    		 playerfill(pos,fill);
	    	 }
	      
	     }
	     public void fillposition(int x,int y,char fill)
	     {
	    	 if(this.arr[x][y]==' ')
	    	  {
	    		  this.arr[x][y]=fill;
	    	  }
	    	  else {
	    		  out.print("\nOOPs this position is already filled");
	    		  out.print("\nEnter the position:");
	    		   int pos =getnumber();
	    		   playerfill(pos,fill);
	    	  }
	     }
	     public void winnercheck()
	 	{
	 		StringBuilder temp=new StringBuilder();
	 		for(int i=0;i<this.dim;i++)
	 		{
	 			for(int j=0;j<this.dim;j++)
	 			{
	 				temp.append(this.arr[i][j]);
	 			}
	 			check(temp.toString());
	 			temp.delete(0,temp.length());
	 			for(int j=0;j<this.dim;j++)
	 			{
	 				temp.append(this.arr[j][i]);
	 			}
	 			check(temp.toString());
	 			temp.delete(0,temp.length());
	 		}
	 		temp.delete(0,temp.length());
	 		for(int i=0;i<this.dim;i++)
	 		{
	 			temp.append(this.arr[i][i]);
	 		}
	 		check(temp.toString());
	 		temp.delete(0,temp.length());
	 		for(int i=0,j=this.dim-1;i<this.dim;i++,j--)
	 		{
	 			temp.append(this.arr[i][j]);
	 		}
	 		check(temp.toString());
	 		temp.delete(0,temp.length());
	 	}
	     public void check(String temp)
	     {
	    	 if(temp.equals("X".repeat(this.dim)))
	    	 {
	    		 out.print("Player1-Winner!!!!");
	    		 System.exit(0);
	    	 }
	    	 if(temp.equals("O".repeat(this.dim)))
	    	 {
	    		 out.println("Player2 Winner!!!!");
	    		 System.exit(0);
	    	 }
	    	 
	     }
	     public int getnumber()
	     {
	    	 Scanner p=new Scanner(System.in);
	    	 int num;
	    	 try {
	    		 num=p.nextInt();
	    		 return num;
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 out.println("It shoud be number type");
	    	    return getnumber();
	    	 }
	     }
            public  static void tic()
            {
            	Tictactoe a1=new Tictactoe();
            	out.print("Tic tac toe Enter the Dimension\n");
            	a1.dim=a1.getnumber();
            	a1.creategameboard();
            	for(int i=0;i<a1.dim*a1.dim;i++)
            	{
            	     out.print("Enter the position\n");
            	    if(i%2==0)
            	    {
            	    	 int num=a1.getnumber();
            	         a1.playerfill(num,'X');
            	         a1.displayboard();
            	    }
            	    else {
            	    	int num=a1.getnumber();
            	    	a1.playerfill(num,'O');
            	    	a1.displayboard();
            	    }
            	    if(i>a1.dim)
            	    {
            	    	a1.winnercheck();
            	    }
            	}
            	out.print("Match draw");
}
}