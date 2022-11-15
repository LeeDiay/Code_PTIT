#include <stdio.h> 
 int main()
 {     
 int v7 = 65537;     
 int i;    
  char Buffer[31] = "uqlqfqc~R6iiZf5h6Zq5Zw6s`wv$k<x";    
   for ( i = 0; i <= 30; ++i )      
    Buffer[i] ^= v7 / 1000 - 60;     
	printf("%s", Buffer);     
	return 0;
}
