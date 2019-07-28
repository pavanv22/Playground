import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner ( System.in);
                  int a=0,b=0,c=0;
            int largest=0;
            //Scanner class to take user input.
            Scanner X = new Scanner(System.in);
             
            
            a = X.nextInt(); //read integer number
             
      
            b = X.nextInt(); //read integer number
             

            c = X.nextInt();
            
           int res = Main.Great(a,b);
      if(res>c)
         System.out.println(res);
      else
         System.out.println(c);
	}
  static int Great(int a , int b)
  {
    if(a>b)
      return a;
    else 
      return b;
  }
}