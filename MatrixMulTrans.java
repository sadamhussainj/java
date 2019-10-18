class MatrixMulTrans{
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
		int A[][] = { {1, 1, 1, 1}, 
					{2, 2, 2, 2}, 
					{3, 3, 3, 3}, 
					{4, 4, 4, 4}}; 
	    int C[][]={ {1,1,1,1},
	                {2,2,2,2},
	                {3,3,3,3},
	                {4,4,4,4} };
		int B[][] = new int[N][N];
		int D[][] = new int[N][N];
		int i, j, k; 
	    
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
