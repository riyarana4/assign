import java.util.*;
class reverse {
public void rev(int arr[],int n)
{int i,j;
for(i=0,j=n-1;i<n/2;i++,j--)
    {
      arr[i]=arr[i]^arr[j];
      arr[j]=arr[i]^arr[j];
      arr[i]=arr[i]^arr[j];
    }
System.out.println("Reversed array is:");
    for(i=0;i<n;i++)
    {
      System.out.print(" "+arr[i]);
    }
 
}  
public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    int n,i,j,max=0,k=0,n1;
reverse p=new reverse();
    System.out.println("enter the size of array");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
p.rev(arr,n);
    }
}   