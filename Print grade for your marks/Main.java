import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int m=in.nextInt();
      if(m>=85)
        System.out.println("A");
      else
        
      if(m<85 && m>=75)
        System.out.println("B");
      else
        
      if(m>=65 && m<75)
        System.out.println("C");
      else
        
      if(m>=55 && m<65)
        System.out.println("D");
      else
        
      if(m>=45 && m<55)
        System.out.println("E");
      else
        
      if(m<45)
        System.out.println("Fail");
      
    }
}