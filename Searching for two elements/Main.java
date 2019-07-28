import java.util.*;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner (System.in);
      int size = in.nextInt();
        int []arr = new int[size];
      for(int i=0;i<size;i++)
        arr[i] = in.nextInt();
      int e1= in.nextInt();
      int e2 = in.nextInt();
      System.out.println(Main.find(e1,arr,size));
      System.out.println(Main.find(e2,arr,size));
    }
  static int find ( int ele,int arr[],int n)
  {
    int f =0 ;
    int i=0;
    for(i=0; i<n; i++)
    {
      if(arr[i]==ele)
      {
        f=1;
        break;
      }
    }
    if (f==1)
     return i;
   else
    return -1;
  }
  
}