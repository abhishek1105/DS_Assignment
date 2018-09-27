import java.util.*;
class Intersection {
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
   int[] arr2=new int[size];
	System.out.println("ENTER ELEMENTS for 2nd array");
    for(int i=0;i<size;i++)
    {
      arr2[i]=sc.nextInt();
	      }
       int i=0;
	   int j=0;
	   System.out.println("OUTPUT after Intersection of Arrays:");
	   while(i<size&&j<size)
	   {
		   if(arr[i]<arr2[j])
			   i++;
		   else if(arr2[j]<arr[i])
				   j++;
			   else
			   {
				   System.out.print(arr[i]+" ");
				   i++;
				   j++;
				   }
				   }
				     }
					 }