#include<stdio.h>
#include<math.h>
#include<windows.h>
void SetTeColor(WORD color)
{ 
    HANDLE hConsoleOutput;
    hConsoleOutput = GetStdHandle(STD_OUTPUT_HANDLE);
    CONSOLE_SCREEN_BUFFER_INFO screen_buffer_info;
    GetConsoleScreenBufferInfo(hConsoleOutput, &screen_buffer_info);
    WORD wAttributes = screen_buffer_info.wAttributes;
    color &= 0x000f;
    wAttributes &= 0xfff0; wAttributes |= color;
    SetConsoleTextAttribute(hConsoleOutput, wAttributes);
}
void gotoxy(int x, int y)
{
    static HANDLE  h = NULL;
    if(!h)
        h = GetStdHandle(STD_OUTPUT_HANDLE);
    COORD c = {x,y};
    SetConsoleCursorPosition(h,c);
}
void intro()
{
	gotoxy(40,1);
    SetTeColor(11);
	printf("Minigame KHONG LOI THOAT\n"); 
	gotoxy(20,3);
	SetTeColor(9);
	printf("- Nhiem vu cua ban la dieu khien nhan vat di tim chia khoa va ra khoi phong.");
	gotoxy(20,4);
	printf("- Huong dan: Dung 4 phim: W (di len), A (sang trai), S (xuong duoi), D (sang phai)");
	gotoxy(33,5);
	printf("roi an Enter de di chuyen (co the di chuyen nhieu o lien tuc).");
    gotoxy(20,6);
    printf("- Cac ki hieu trong game: P (Player), K (Key), E (Exit).");
	gotoxy(20,7);
	SetTeColor(14);
	printf("- Vai dong tam su nho: Chuc mung nam moi dai gia dinh ISP CLUB !! ");
	gotoxy(20,8);
	printf("~~ Vi thoi gian Tet kha ban ron nen code cua em con so sai va mac nhieu loi, mong  ");
	gotoxy(35,9);
	printf("anh chi cham chuoc va bo qua cho em <3 ~~ ");

}
void xuatmang(int a[100][100], int n, int m)
{
	int i,j;
	for (i=0; i<n; i++)
      {
        for (j=0; j<m; j++)
            printf("%c  ",a[i][j]);
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
	char check;
 	intro();
 	SetTeColor(7);
	gotoxy(40,11);
	printf(" BAN DA SAN SANG? (y/n): ");
	scanf("%c", &check);
	if (check=='y')
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
      int gtx,hang,cot;
      hang=0;
      cot=0;
      printf("\nBan hay nhap W A S D de di chuyen: ");
      while (check1==0 || check2==0 )
        {
          scanf("%c",&x);
          gtx=int(x);
          system("cls");
		  xuatmang(a,6,7);
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
          if (a[2][2]=='P') check1=1;
          if (check1==1) 
		    {
		  	    // DIEU KIEN NHAT DUOC CHIA //
		  		system("cls");
				xuatmang(a,6,7);
		    	printf("\nBan da nhat duoc chia khoa, hay den cua ra...");
		    	printf("\nBan hay nhap W A S D de di chuyen: ");
		    }
        if (a[5][5]=='P') 
		    {
		  		// DIEU KIEN THOAT PHONG //
		   		check2=1;
		   		if (check1==1) break;
		   		else 
			  	  {
					system("cls");
					xuatmang(a,6,7);
					printf("\nBan chua co chia khoa, hay di thu thap no...");
					printf("\nBan hay nhap W A S D de di chuyen: ");
		      	  }
		    }
		else check2=0;
		if (check2==0) a[5][5]='E';
	  }
    	system("cls");
		xuatmang(a,6,7);
		SetTeColor(14);
    	printf("\nChuc mung ban da chien thang :3");
      } 
    else exit;
}
