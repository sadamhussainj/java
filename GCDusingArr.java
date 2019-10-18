public class GCDusingArr{
static int gcd(int a, int b) 
	{ 
	if (b == 0) 
		return a; 
	return gcd(b, a % b); 
	}
static int Findgcd(int arr[],int n){
    int result = arr[0];
    for(int i=1;i<n;i++)
    result = gcd(arr[i],result);
    return result;
}
     public static void main(String[] args) 
	{ 
		int arr[]={1,2,2,4,3,3};
		int n =arr.length;
		System.out.println(Findgcd(arr,n)); 
	} 
} 
