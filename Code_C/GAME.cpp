#include<stdio.h>
#include<math.h>
#include<windows.h>
void xuatmang(int a[100][100],int n, int m)
{
	int i,j;
	for (i=0; i<n; i++)
            {
                for (j=0; j<m; j++)
                 {
                     printf("%c  ",a[i][j]);
                 }
                printf("\n");
            }
}
void taokhung(int a[100][100], int n, int m)
{
	int i,j;
	for (i=0; i<n; i++)
      for (j=0; j<m; j++)
         a[i][j]=22;
}
int main()
{
    int i,j;
    int check1=0, check2=0;
    char x;
    int a[100][100];
    taokhung(a,6,7);    
    a[0][0]=80;
    a[2][2]=75;
    a[5][5]=69;
    xuatmang(a,6,7);
    int gtx,tg,hang,cot;
    hang=0;
    cot=0;
     printf("Ban hay nhap W A S D de di chuyen: ");
    while (check1==0 || check2==0 )
    {
        scanf("%c",&x);
         gtx=int(x);
        
		
		   
       // gtx=int(x);
		printf("\nBan hay nhap W A S D de di chuyen: ");
        if (gtx==87 || gtx==119)
        { 
            // DI LEN //
        	system("cls");
            a[hang][cot]=22;
            a[hang-1][cot]='P';
            hang=hang-1;
            xuatmang(a,6,7);
        }
        if (gtx==65 || gtx==97)
        {
        	 // SANG TRAI //
        	system("cls");
            a[hang][cot]=22;
            a[hang][cot-1]='P';
            cot=cot-1;
            xuatmang(a,6,7);
        }
        if (gtx==83 || gtx==115)
        {
            // DI XUONG //
            system("cls");
            a[hang][cot]=22;
            a[hang+1][cot]='P';
            hang=hang+1;
            xuatmang(a,6,7);
         
        }
       if (gtx==68 || gtx==100)
        {
           //SANG PHAI //
   			system("cls"); 
            a[hang][cot]=22;
            a[hang][cot+1]='P';
            cot=cot+1;
            xuatmang(a,6,7);
            
        }
        if (a[2][2]=='P') 
		   {
		   	
		   	check1=1;
		   	taokhung(a,6,7);
		   	a[2][2]='P';
		   	a[5][5]='E';
			system("cls");
		   	xuatmang(a,6,7);
		  	printf("Ban da nhat duoc chia khoa, hay den cua ra...");
		   	printf("\nBan hay nhap W A S D de di chuyen tiep: ");
		   }
		if (check1==1) 
		  {
		    printf("Ban da nhat duoc chia khoa, hay den cua ra...");
		    printf("\nBan hay nhap W A S D de di chuyen tiep: ");
             if (a[5][5]=='P') 
		    {
		     system("cls");
		     check2=1;
		    taokhung(a,6,7);
		     a[5][5]='P';
		     xuatmang(a,6,7);
     	    }
           }
        if (check1==0) 
		{
        	if (a[5][5]!='P') printf("Ban chua co chia khoa, hay di thu thap no...");
        	if (a[5][5]=='P') {
        		
			printf("Ban phai co chia khoa moi duoc ra khoi phong...");
			a[5][5]='E'; }
		}
	}
  
	

     printf("Chuc mung ban da chien thang :3");
}
