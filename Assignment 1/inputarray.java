import java.util.*;
class inputarray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  int maximum;
	System.out.println("ENTER SIZE");
	int size=sc.nextInt();
    int[] arr=new int[size];
	System.out.println("ENTER ELEMENTS");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
	  
    }
	System.out.println("OUTPUT");
	for(int i=0;i<size;i++)
    {
      System.out.println(arr[i]);
    }
	   maximum = arr[0];
 
  for (int c = 1; c < size; c++)
  {
    if (arr[c] > maximum)
    {
       maximum  = arr[c];
       
    }
  }
  System.out.println("MAXIMUM number is :"+maximum);
    
  }
}
