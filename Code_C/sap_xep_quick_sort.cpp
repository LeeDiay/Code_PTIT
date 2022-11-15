#include<stdio.h>

void quicksort(long long a[],long long dau,long long cuoi)
{
   long long i,j,chot,tam;
   if (dau<cuoi)
      {
      	 chot=dau;
         i=dau;
         j=cuoi;

         while (i<j)
	        {
        		 while( a[i]<=a[chot] && i<cuoi ) i++;
        		 while( a[j]>a[chot] ) j--; 
		 		 if (i<j)
		            {
              			tam=a[i];
              			a[i]=a[j];
             			a[j]=tam;
           			} 
       		}
     
      	 tam=a[chot];
         a[chot]=a[j];
         a[j]=tam;
         quicksort(a,dau,j-1);
         quicksort(a,j+1,cuoi);
     }
}

int main()
{
   long long i,n;
   scanf("%lld", &n);
   long long a[n+5];
   for(i=0; i<n; i++)
      scanf("%lld" ,&a[i]);
   quicksort(a,0,n-1);
   for(i=0; i<n; i++)
      printf("%lld ", a[i]);
}
