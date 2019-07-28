import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner in  = new Scanner (System.in);
      int n=in.nextInt();
    int r=0,d=0;
    while(n>0)
    {
      d=n%10;
      r=r*10+d;
      n=n/10;
    }
      System.out.println(r); 
  }
}