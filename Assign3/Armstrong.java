import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{int n,num,temp,total=0;
System.out.println("enter a number:");
Scanner s = new Scanner(System.in);
n = s.nextInt();
s.close();
num=n;
for(;num!=0;num/=10)
{
temp=num%10;
total=total+temp*temp*temp;
}
if(total == n)
System.out.println(n +" is an armstrong number");
else
System.out.println(n +" is not an armstrong number");
}
}