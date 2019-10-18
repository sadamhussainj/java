import java.util.Scanner;
public class MatrixInput{
    
	static final int N = 4; 
    static void transpose(int A[][], int B[][], int C[][], int D[][])
	{ 
		int i, j, k; 
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++){ 
				B[i][j] = A[j][i]; 
			}}
			
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++){
			    D[i][j]=0;
			    for (k=0 ; k<N ; k++){
			        D[i][j] +=B[i][k]*C[k][j];
			    }}}
	}
	public static void main(String []args)
	{
	    int i, j,m,n; 
	Scanner Scan= new Scanner(System.in);
	m= Scan.nextInt();
	n= Scan.nextInt();
	int A[][]= new int[N][N];
	int C[][]= new int[N][N];
	for(i=0;i<N;i++)
	for(j=0;j<N;j++)
        A[i][j]=Scan.nextInt();
    for(i=0;i<N;i++)
	for(j=0;j<N;j++)
        C[i][j]=Scan.nextInt();
	int B[][] = new int[N][N];
    int D[][] = new int[N][N];
	int k; 
	    
	transpose(A, B, C, D); 
	
	System.out.print("Result matrix is \n"); 
	for (i = 0; i < N; i++) 
		
		{ 
			for (j = 0; j < N; j++) 
			System.out.print(D[i][j] + " "); 
			System.out.print("\n"); 
		} 
	}
	 
} 
