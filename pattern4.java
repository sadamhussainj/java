import java.io.*; 
  
// Java code to demonstrate number pattern 
public class pattern4
{ 
    // Function to demonstrate printing pattern 
    public static void printNums(int n) 
    { 
        int i, j,num; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<n; i++) 
        { 
            // initialising starting number 
            num=1; 
  
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing num with a space  
                System.out.print(num+ " "); 
  
                //incrementing value of num 
                num++; 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
    } 
  
    // Driver Function 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printNums(n); 
    } 
} 
Output:
//num pattern
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
