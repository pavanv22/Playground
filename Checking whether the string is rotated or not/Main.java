import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner in = new Scanner (System.in);
      String str1=in.nextLine();
      String str2=in.nextLine ();
    String   str3=str1.concat(str1);
      
     CharSequence seq = str2; 

    boolean bool = str3.contains(str2); 
if(bool)
    System.out.println("Yes"); 
      else
        System.out.println("No");

   
      
    }
}