import java.util.*;
class Arrayrow {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("ENTER rows");
	int row=sc.nextInt();
  System.out.println("ENTER cols");
  	int col=sc.nextInt();
    int[][] arr=new int[row][col];
	System.out.println("ENTER ELEMENTS for 2-D array");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++){
      
      arr[i][j]=sc.nextInt();
    }
    }
  

	System.out.println("OUTPUT");
	for(int i=0;i<row;i++)
    {for(int j=0;j<col;j++){
      
      System.out.print(arr[i][j]+" ");
    }
	}
    
  }
}