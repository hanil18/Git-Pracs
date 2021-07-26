import java.util.Scanner;
public class pascal
{
public static void main(String args[])
{
int p,i,j,k=1,m;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of lines: ");
p=sc.nextInt();
System.out.println();
sc.close();
for(i=0;i<p;i++)
{
for(j=0;j<p-i;j++)
{
System.out.print(" ");
}
for(m=0;m<=i;m++)
{
if(i==0||m==0)
{
k=1;
}
else
{
k=k*(i-m+1)/m;
}
System.out.print(" "+k);
}
System.out.println();
}
}}

