import java.util.Scanner;  
class PowerNumber {
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
int N=Scan.nextInt();
int K=Scan.nextInt();
int res=1;
int i=1;
while(i<=K){
res=res*N;
i++;
}
System.out.println("N^K is"+res);
}
}
