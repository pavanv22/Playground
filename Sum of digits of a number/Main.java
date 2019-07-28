import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int l=0,sum=0;
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      while(n>0)
      {
        l=n%10;
        sum += l;
        n=n/10;
      }
      System.out.println(sum);
    }
}