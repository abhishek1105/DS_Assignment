import java.util.*;
class bubblesort {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("ENTER SIZE");
	int size=sc.nextInt();
    int[] arr=new int[size];
	System.out.println("ENTER ELEMENTS");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
	  
    }
int temp;
    for(int i=0;i<size-1;i++){
      for(int j=0;j<size-i-1;j++){
        if (arr[j] > arr[j+1])
        { temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;

        }
      }
    }
	System.out.println("OUTPUT after sorting");
	for(int i=0;i<size;i++)
    {
      System.out.println(arr[i]);
    }
    
  }
}