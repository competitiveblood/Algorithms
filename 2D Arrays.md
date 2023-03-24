# 2D Arrays


In a 2D array, each element is identified by a pair of indices,
One for the row and another for the column. 
The rows and columns are typically numbered starting from 0.

**2D arrays in Java-:**

```c
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```


**Output**

1 2 3 
4 5 6 
7 8 9 

**2D arrays in Python-:**

(using loops)
```c
for i in range(len(matrix)):
    for j in range(len(matrix[i])):
        print(matrix[i][j], end=' ')
    print()
   ```
   
  **Output** 
  
  1 2 3 
  4 5 6 
  7 8 9 
  
  
  **2D arrays in C-:**
 
 ```c
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        printf("%d ", matrix[i][j]);
    }
    printf("\n");
}
```


**Output-:**

0 1 2 3 
4 5 6 7 
8 9 10 11 

