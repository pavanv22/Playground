import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int ct=0;
  for(int i=1;ct<n;i+=2)
  {
    System.out.println(i);
    ct++;
  }
 }
}
    