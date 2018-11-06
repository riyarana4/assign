import java.util.*;
class bubble_sort{
public void bub_sort(int arr[],int n)
{
for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-i-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          arr[j]=arr[j]^arr[j+1];
          arr[j+1]=arr[j]^arr[j+1];
          arr[j]=arr[j]^arr[j+1];
        }
      }
    }
System.out.println("Sorted array:");
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
}
  public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
bubble_sort b=new bubble_sort();     
int n,i,j,max=0;
    System.out.println("enter the size of array");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
	b.bub_sort(arr,arr.length);
   }
}