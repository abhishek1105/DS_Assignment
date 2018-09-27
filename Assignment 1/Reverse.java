import java.util.*;
class  {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("ENTER SIZE");
	int size=sc.nextInt();
    int[] arr=new int[size];
	System.out.println("ENTER ELEMENTS for 1st array");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
  

	System.out.println("OUTPUT");
	 for(int i = size-1; i>=0; i--)
    {
      System.out.print(arr[i]+" ");
    }
    
  }
}