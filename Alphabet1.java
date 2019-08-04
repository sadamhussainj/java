import java.util.Scanner;
class Alphabet{
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
System.out.println("enter a choose");
char ch=Scan.next().charAt(0);
if((ch>64&&ch<91)||(ch>96&&ch<123)){
System.out.println(ch+"alphabet");
}
else{
System.out.println(ch+"not");
}
}
}
