import java.util.*;
class max_val {
public void maxv(int arr[])
{
int max=-1;
for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.println("max value in array is: "+max);

}  
public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    max_val m=new max_val();
    int n,i,j,max=0;
    System.out.println("enter the size of array");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
    m.maxv(arr);
  }
}