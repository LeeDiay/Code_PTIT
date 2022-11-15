/*
* C Program to interchange Major and Minor diagonals of a Matrix
*/
  
#include <stdio.h>
#include <conio.h>
  
int main(){
    int rows, cols, row, col, temp;
    int matrix[50][50];
     
    printf("Enter Rows and Columns of Square Matrix\n");
    scanf("%d %d", &rows, &cols);
      
    printf("Enter Matrix of size %dX%d\n", rows, cols);
      
    for(row = 0; row < rows; row++){
        for(col = 0; col < cols; col++){
            scanf("%d", &matrix[row][col]);
        }
    }
      
    /* Interchange Major and Minor diagonals of Matrix */
    for(row = 0; row < rows; row++) {  
        col = row;    
        temp = matrix[row][col];  
        matrix[row][col] = matrix[row][(cols-col)-1];  
        matrix[row][(cols-col)-1] = temp;  
    }  
      
    printf("Matrix After Swapping Diagonals\n");
    for(row = 0; row < rows; row++){
        for(col = 0; col < cols; col++){
            printf("%d ", matrix[row][col]);
        }
        printf("\n");
    }
     
    getch();
    return 0;
}
