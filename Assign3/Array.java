class Array
{
public static void main(String[] args)
{
int a[]=new int[]{1,1,1,1,0,0,1,0};
int b=a.length;
int count=0;
for(int i=0;i<b;i++)
{if(a[i] == 0)
count++;
}
for(int i=0;i<count;i++)
a[i]=0;
for(int i=count;i<b;i++)
a[i]=1;
for(int i=0;i<b;i++)
System.out.print(a[i] + " ");
}
}