import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner (System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if((ch-key) >='a' && (ch-key)<'z')
        System.out.println((char)(ch-key));
      else
        if(ch>='a' && ch<='z')
      {
                System.out.println((char)('z'-(key-('a'-ch+5))));

      }
      if((ch-key) >='A' && (ch-key)<='Z')
        System.out.println((char)(ch-key));
      else
           if(ch>='A' && ch<='Z')
      {
                System.out.println(('Z'-(key-('A'-ch))));

      }
      
    }
}