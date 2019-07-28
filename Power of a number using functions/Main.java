import java.util.*;

public class Main
{
  public static void main( String args[] )
  {
    Scanner in = new Scanner ( System.in);
    int base = in.nextInt();
    int exp =  in.nextInt();
    int res = Main.power(base,exp);
    System.out.println(res);
  }
  static int power(int base, int exp)
  {
    int res=1;
    for( int i=0 ; i<exp ; i++)
      res = res * base;
    return res;
  }
}