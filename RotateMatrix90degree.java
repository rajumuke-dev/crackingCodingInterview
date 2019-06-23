/*
Qquestion :
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
*/

public class RotateMatrix {
	
	public static void rotate(int[][] matrix, int n) {
		
		for(int layer=0;layer<n/2;++layer){
			int first = layer;
			int last = n-1-layer;
			
			for(int i=first;i<last;++i){
				
				int offset = i-first;
				//save top
				int top=matrix[first][i];
				
				//left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				//bottom -> left
				matrix[last-offset][first]=matrix[last][last-offset];
				
				//right -> bottom
				matrix[last][last-offset]=matrix[i][last];
				
				//top -> right
				matrix[i][last]= top;
				
			}
		}

	}
  
    // Function to print the matrix 
    static void displayMatrix(int N, int mat[][]) 
    { 
        for (int i = 0; i < N; i++) 
        { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + mat[i][j]); 
       
            System.out.print("\n"); 
        } 
        System.out.print("\n"); 
    } 
	
	public static void main(String[] args) {
		
		int mat[][] = {{2,1,5,3},{5,8,6,4},{9,12,6,9},{8,7,6,5}};		
		rotate(mat,4);
		displayMatrix(4, mat);
	}

}
