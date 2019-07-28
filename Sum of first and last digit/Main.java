import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int l=0;
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      l=n%10;
      while(n>=10)
      {
        n=n/10;
      }
      System.out.println(n+l);
    }
}