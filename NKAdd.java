import java.util.Scanner;
class NKAdd{
public static void main(String[] qwe)
{
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the value of N &K");
int N=Scan.nextInt();
int k=Scan.nextInt();
int[] arr=new int[N];
int sum=0;
for(int i=0;i<N;i++)
{
int temp=Scan.nextInt();
arr[i]=temp;
}
for(int j=0;j<k;j++)
sum=sum+arr[j];
System.out.println("output"+sum);
}
}
