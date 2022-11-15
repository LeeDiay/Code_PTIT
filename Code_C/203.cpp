#include <stdio.h>

void doicho(int *a, int *b)
{
    int tam = *a;
    *a = *b;
    *b = tam;
}

void sapxep(int a[], int n)
{
    for (int i = 0; i<n-1; i++)
     {
        int check=0;
        for (int j=0; j<n-i-1; j++)
            if (a[j] > a[j+1])
             {
                doicho(&a[j], &a[j+1]);
                check=1;
             }
        if (check==0)
            break;
        printf("Buoc %d: ", i+1);
        for (int j=0; j<n; j++)
            printf("%d ", a[j]);
        printf("\n");
     }
}

int main()
{
    int n;
    scanf("%d", &n);
    int a[100];
    for (int i=0; i<n; i++)
        scanf("%d", &a[i]);
    sapxep(a, n);
}
