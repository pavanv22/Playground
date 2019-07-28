import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int i=0,j;
      int check=n,n1=n,num,sum1=1,sum2=0,k;
      while(n>0)
      {
        n=n/10;
        i++;
      }
      num=i;
           // System.out.println(n1);

      for(;n1>0;)
      {
          k=n1%10;

        for(i=0;i<num;i++)
        {
          sum1 = sum1 * k;
        }
         n1= n1/10;

        sum2 = sum2+sum1;
        sum1=1;
      }
      if(sum2==check)

      System.out.println("Armstrong Number");
        else
                System.out.println("Not a Armstrong Number");


    
	}
}