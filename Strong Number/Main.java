import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
                  int num = in.nextInt();
      int sum=1,sum1=0,n,check=num;
      for(;num!=0;)
      {
        n=num%10;
        sum=1;
      for( int i=n;i>0;i--){
        sum=sum*i;
      }
        sum1 = sum1+sum;
        num=num/10;
      
      }
      if(check==sum1)
                   System.out.println("Yes");
      else
                           System.out.println("No");


	}
}