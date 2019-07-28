import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner (System.in);
      int n=in.nextInt();
      int x=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i%2!=0)
          {
            if(j==n)
            {
              System.out.print(++x);
              break;
            }
               System.out.print(x);
          }
          else
          {
            if(j==1)
             System.out.print(x+1);
            else
              System.out.print(x);
                          if(j==n)
              x++;

          }
          
        }
        
        System.out.println();

      }
	}
}