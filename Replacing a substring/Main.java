import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner in = new Scanner (System.in);
      String str = in.nextLine ();
      String str1=in.nextLine();
      String str2=in.nextLine ();
      
      System.out.println( str.replaceAll(str1, str2) );
   
      
    }
}