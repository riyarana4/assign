import java.util.Scanner;
class Search
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int a[]=new int[]{1,4,6,7,8,9,10};
int b=a.length;
System.out.println("Enter value to find:");
int search =s.nextInt();
int first =0;
int last=b-1;
int middle=(first+last)/2;
while(first <= last)
{
if(a[middle] < search)
first = middle+1;
else if(a[middle] == search)
{
System.out.println(search + " found in the array.");
break;
}
else
last=middle-1;
middle=(first+last)/2;
}
if(first > last)
System.out.println(search + " is not found in the array.\n");
}
}