import java.util.Scanner;
class CountDigits{
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
System.out.println("Enter the value");
int N=Scan.nextInt();
int count=0;
while(N!=0)
{
N=N/10;
count++;
}
System.out.println("output"+count);
}}
