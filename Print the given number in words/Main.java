import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  int option = in.nextInt();
  switch(option)
  {
   case 1:
   // int sum = n1+n2;
    System.out.println("One");
    break;
   case 2:
   // int difference = n1-n2;
    System.out.println("Two");
    break;
   case 3:
    //int product = n1*n2;
    System.out.println("Three");
    break;
   case 4: System.out.println("Four");
    break;
    case 5 : System.out.println("Five");
   default:
    System.out.println("Invalid");
  }
  }
 }
