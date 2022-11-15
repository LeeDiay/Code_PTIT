#include <stdio.h> 
int giaithua(int n)
{ 
  int i, 
  gt=1;
  for(i=2; i<=n; i++) gt*=i; 
  return gt; 
 } 
int ketqua(int n)
{ 
    int x=n,
    sum=0;
    while (n>0)
     { 
     sum+=giaithua(n%10);
     n/=10;
	 } 
    if(sum==x) return 1; 
	return 0; 
} 
	int main(){
	int n, m, i;
	scanf("%d %d", &n, &m); 
	if(n>m) { int temp=n; n=m; m=temp; }
	for(i=n; i<=m; i++) 
	if(ketqua(i))
	printf("%d ", i);
	return 0; 
}

