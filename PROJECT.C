#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<process.h>
#include<graphics.h>
void course();
struct empl
{
	int sr;
	char name[20];
	char fname[20];
	char add[30];
	char mono[12];
	struct dob
	{
		long int day;
		char month[10];
		char year[11];
	}d;
}s;
void fun()
{
	char ch;
	FILE *f,*f1;
	f1=fopen("cba.txt","r");
	f=fopen("bata.txt","w");
	while((fscanf(f1,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year))!=EOF)
	{
		fprintf(f,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
	}
	fclose(f);
	fclose(f1);
};
void main()
{
	FILE *f,*f1;
	int n,p,i,m,k,gm=0,gd,t=0;
	char ch,chr[25];
	main:

	clrscr();
	initgraph(&gm,&gd,"C:\\TC\\bgi");
	setbkcolor(BLUE);
	setcolor(RED);
	settextstyle(7,0,5);
	outtextxy(10,10,"\n***************||*WELCOM*||*************\n\t");
	printf("\n\n\n\n\n\t [1]. TO SEE RECORD. \n\t [2]. TO ADD NEW DATA.\n\t [3]. TO SEARCH EMPLYEE.\n\t [4]. TO DELETE DATA.\n\t [5]. TO EDIT DATA. \n\t [6]. TO SEE THE NO OF EMPLOYEE.\n\t [0]. TO EXIT. ");
	printf("\n*******************|| ENTER YOUTR CHOICE |---");
	scanf("%d",&n);
	switch(n)
	{
		case 1:clrscr();
			f=fopen("bata.txt","r");
			printf("\n FIRST & LAST NAME   DEPARTMENT   E-MAIL\t PHONE   POST    CABIN NO  \n\n");
			while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
			printf(" \tID NO\t%d\n\t\tNAME\t%s %s\n\t\t DEPARTMENT\t%s\n\t\tE-MAIL\t%s\n\t\tPHONE\t%ld   %s   %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
		fclose(f);
		break;
		case 2:
		f=fopen("bata.txt","r+");
		do
		{       clrscr();
			printf(" \nENTER \n    FIRST & LAST NAME \t DEPARTMENT   E-MAIL\t\tPHONE  POST  CABIN NO \n");
			while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
			s.sr=s.sr+1;
			fflush(stdin);
			scanf("%s %s %s %s %ld %s %s",s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year);
			fprintf(f,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
			printf(" \n****** | PLEAE NOTE YOUR COLLEGE ID NO IS = %d \n",s.sr);
			printf(" \n****** | [Y] FOR MORE ENTRY\n");
			fflush(stdin);
			scanf("%c",&ch);
		}
		while((ch=='y')||(ch=='Y'));
		fclose(f);
		clrscr();
		break;
		case 3:
		do
		{       clrscr();
			printf(" \n\t[1] TO SEARCH BY ROLL NO.\t [2] TO SEARCH BHY NAME \n******************|| ENTER YOUR CHOICE |-");
			scanf("%d",&m);
			switch(m)
			{
				case 1:
				do
				{
					printf("*****|| ENTER ROLL NO |-\n");
					scanf("%d",&k);
					f=fopen("bata.txt","r");
					printf("\n\nID NO.   FIRST & LAST NAME  CITY   PHONE\t\tSELARY  POST  DOB \n");
					while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
						if(k==s.sr)
						{
							printf("%d\t %s %s\t   %s\t %s\t%ld   %s    %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
							break;
						}
						fclose(f);
						printf(" *******| [Y] TO MORE SEARCH\n");
						fflush(stdin);
						scanf("%c",&ch);
      }while((ch=='y')||(ch=='Y'));
     break;
     case 2:
     do
     {
      printf("****ENTER NAME |-\n");
      scanf("%s",chr);
      t=0;
      f=fopen("bata.txt","r");
      clrscr();
      printf("\n\nID NO.   FIRST & LAST NAME \t CITY   PHONE\t\tSALARY  POST  DOB \n");
      while(1)
      {
       ch=fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year);
       if(ch==EOF)
	{
	if(t==0)
	printf("*****|| SEARCH IS NOT FOUND |-\n");
	break;
	}

       if(strcmp(chr,s.name)==0)
       {
       t++;
      printf("%d\t %s %s\t\t%s\t%s\t%ld   %s  %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
      }
      }
      fclose(f);
      printf(" ********** || [Y] TO MORE SEARCH |-\n");
      fflush(stdin);
      scanf("%c",&ch);
      clrscr();
      }
     while((ch=='y')||(ch=='Y'));
     break;
    }
    printf("******* [Y] FOR MORE SEARCH \n");
    fflush(stdin);
    scanf("%c",&ch);
   }
   while((ch=='y')||(ch=='Y'));

      break;
   case 4:
   do
   {
    printf(" \n\t[1] TO DELETE BY ROLL NO.\t [2] TO DELETDE BHY NAME \n******************|| ENTER YOUR CHOICE |-");
    scanf("%d",&m);
    switch(m)
    {
     case 1:
      clrscr();
      printf("********|| ENTER ID NO |-\n");
      scanf("%d",&k);
      f=fopen("bata.txt","r");
      f1=fopen("cba.txt","w");
      while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
       {
       if(k==s.sr)
       {
       printf(" *****| DELETION SUCCESSFUL |*****\n");
       continue;
       }
       fprintf(f1,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
       }   fclose(f);fclose(f1);
      fun();
      break;
   case 2:
      clrscr();
      printf("********|| ENTER NAME |-\n");
      scanf("%s",chr);
      f=fopen("bata.txt","r");
      f1=fopen("cba.txt","w");
      while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
       {
       if(strcmp(chr,s.name)==0)
       {
       continue;
       printf(" *****| DELETION SUCCESSFUL |*****\n");
       }
       fprintf(f1,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
       }   fclose(f);fclose(f1);
       fun();
       }
    printf(" *****||  [Y] TO MORE DATA DELETE |- \n");
    fflush(stdin);
    scanf("%c",&ch);
   }
   while((ch=='y')||(ch=='Y'));
   break;
  case 5:
   do
   {
    printf(" \n\t[1] TO  BY ID NO.\t [2] TO EDIT BY NAME \n******************|| ENTER YOUR CHOICE |-");
    scanf("%d",&m);
    switch(m)
    {
     case 1:
      clrscr();
      printf("********|| ENTER ID NO |-\n");
      scanf("%d",&k);
      f=fopen("bata.txt","r");
      f1=fopen("cba.txt","w");
      while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
       {
       if(k==s.sr)
       {
       printf("ENTER ID NO.FIRST & LAST NAME\t CITY \tPHONE  SALERY POST  DATE OF BIRTH \n");
       scanf("%d %s %s %s %s %ld %s %s",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year);
       printf(" *****| EDIT SUCCESSFUL |*****\n");
       }
       fprintf(f1,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
       }
      fclose(f);fclose(f1);
      fun();
      break;
   case 2:
      clrscr();
      printf("********|| ENTER NAME |-\n");
      scanf("%s",chr);
      f=fopen("bata.txt","r");
      f1=fopen("cba.txt","w");
      while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
       {
       if(strcmp(chr,s.name)==0)
       {
       printf("ENTER ID NO.FIRST & LAST NAME\t CITY \tPHONE  SALARY  POST  DATE OF BIRTH \n");
       scanf("%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year);
       printf(" *****| EDIT SUCCESSFUL |*****\n");
       }
       fprintf(f1,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
       }   fclose(f);fclose(f1);
       fun();
       }
    printf(" *****||  [Y] TO MORE DATA EDIT |- \n");
    fflush(stdin);
    scanf("%c",&ch);
   }
   while((ch=='y')||(ch=='Y'));
   break;
   case 6:
   t=0;
   f=fopen("bata.txt","r");
   while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
   t++;
   printf("\n**** NO EMPLOYEE =%d ||***\n",t);
   break;
   case 0:
   exit(0);
   default :
   printf("\n**PLEASE AGAIN ENTER YOUR CHOICE**\n");
  }
  printf("\n|||**** [1] TO BACK MENU. \t\tANY OTHER KEY TO EXIT|-\n");
  scanf("%d",&p);
  if(p==1)
  goto main;
  else
  exit(0);
 getch();
}
void course()
{
  struct course
  {
	int sr;
	char name[20];

	int year;
	long int fee;

  }c;

  {
	printf("\n\n\n\n\n\t [1]. TO SEE RECORD. \n\t [2]. TO ADD NEW DATA.\n\t [3]. TO SEARCH EMPLYEE.\n\t [4]. TO DELETE DATA.\n\t [5]. TO EDIT DATA. \n\t [6]. TO SEE THE NO OF EMPLOYEE.\n\t [0]. TO EXIT. ");
	printf("\n*******************|| ENTER YOUTR CHOICE |---");
	scanf("%d",&n);
	switch(n)
	{
	       clrscr();
			f=fopen("cors.txt","r");
			printf("\n SR No\tCIOURSE NAME\tYEAR\tFEE \n\n");
			while(fscanf(f,"%d %s %d %ld\n",&c.sr,c.name,&c.)!=EOF)
		fclose(f);
		case 1:clrscr();
			f=fopen("bata.txt","r");
			printf("\n FIRST & LAST NAME   DEPARTMENT   E-MAIL\t PHONE   POST    CABIN NO  \n\n");
			while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
			printf(" \tID NO\t%d\n\t\tNAME\t%s %s\n\t\t DEPARTMENT\t%s\n\t\tE-MAIL\t%s\n\t\tPHONE\t%ld   %s   %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
		fclose(f);
		break;
		case 2:
		f=fopen("bata.txt","r+");
		do
		{       clrscr();
			printf(" \nENTER \n    FIRST & LAST NAME \t DEPARTMENT   E-MAIL\t\tPHONE  POST  CABIN NO \n");
			while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
			s.sr=s.sr+1;
			fflush(stdin);
			scanf("%s %s %s %s %ld %s %s",s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year);
			fprintf(f,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
			printf(" \n****** | PLEAE NOTE YOUR COLLEGE ID NO IS = %d \n",s.sr);
			printf(" \n****** | [Y] FOR MORE ENTRY\n");
			fflush(stdin);
			scanf("%c",&ch);
		}
		while((ch=='y')||(ch=='Y'));
		fclose(f);
		clrscr();
		break;
		case 3:
		do
		{       clrscr();
			printf(" \n\t[1] TO SEARCH BY ROLL NO.\t [2] TO SEARCH BHY NAME \n******************|| ENTER YOUR CHOICE |-");
			scanf("%d",&m);
			switch(m)
			{
				case 1:
				do
				{
					printf("*****|| ENTER ROLL NO |-\n");
					scanf("%d",&k);
					f=fopen("bata.txt","r");
					printf("\n\nID NO.   FIRST & LAST NAME  CITY   PHONE\t\tSELARY  POST  DOB \n");
					while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
						if(k==s.sr)
						{
							printf("%d\t %s %s\t   %s\t %s\t%ld   %s    %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
							break;
						}
						fclose(f);
						printf(" *******| [Y] TO MORE SEARCH\n");
						fflush(stdin);
						scanf("%c",&ch);
      }while((ch=='y')||(ch=='Y'));
     break;
     case 2:
     do
     {
      printf("****ENTER NAME |-\n");
      scanf("%s",chr);
      t=0;
      f=fopen("bata.txt","r");
      clrscr();
      printf("\n\nID NO.   FIRST & LAST NAME \t CITY   PHONE\t\tSALARY  POST  DOB \n");
      while(1)
      {
       ch=fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year);
       if(ch==EOF)
	{
	if(t==0)
	printf("*****|| SEARCH IS NOT FOUND |-\n");
	break;
	}

       if(strcmp(chr,s.name)==0)
       {
       t++;
      printf("%d\t %s %s\t\t%s\t%s\t%ld   %s  %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
      }
      }
      fclose(f);
      printf(" ********** || [Y] TO MORE SEARCH |-\n");
      fflush(stdin);
      scanf("%c",&ch);
      clrscr();
      }
     while((ch=='y')||(ch=='Y'));
     break;
    }
    printf("******* [Y] FOR MORE SEARCH \n");
    fflush(stdin);
    scanf("%c",&ch);
   }
   while((ch=='y')||(ch=='Y'));

      break;
   case 4:
   do
   {
    printf(" \n\t[1] TO DELETE BY ROLL NO.\t [2] TO DELETDE BHY NAME \n******************|| ENTER YOUR CHOICE |-");
    scanf("%d",&m);
    switch(m)
    {
     case 1:
      clrscr();
      printf("********|| ENTER ID NO |-\n");
      scanf("%d",&k);
      f=fopen("bata.txt","r");
      f1=fopen("cba.txt","w");
      while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
       {
       if(k==s.sr)
       {
       printf(" *****| DELETION SUCCESSFUL |*****\n");
       continue;
       }
       fprintf(f1,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
       }   fclose(f);fclose(f1);
      fun();
      break;
   case 2:
      clrscr();
      printf("********|| ENTER NAME |-\n");
      scanf("%s",chr);
      f=fopen("bata.txt","r");
      f1=fopen("cba.txt","w");
      while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
       {
       if(strcmp(chr,s.name)==0)
       {
       continue;
       printf(" *****| DELETION SUCCESSFUL |*****\n");
       }
       fprintf(f1,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
       }   fclose(f);fclose(f1);
       fun();
       }
    printf(" *****||  [Y] TO MORE DATA DELETE |- \n");
    fflush(stdin);
    scanf("%c",&ch);
   }
   while((ch=='y')||(ch=='Y'));
   break;
  case 5:
   do
   {
    printf(" \n\t[1] TO  BY ID NO.\t [2] TO EDIT BY NAME \n******************|| ENTER YOUR CHOICE |-");
    scanf("%d",&m);
    switch(m)
    {
     case 1:
      clrscr();
      printf("********|| ENTER ID NO |-\n");
      scanf("%d",&k);
      f=fopen("bata.txt","r");
      f1=fopen("cba.txt","w");
      while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
       {
       if(k==s.sr)
       {
       printf("ENTER ID NO.FIRST & LAST NAME\t CITY \tPHONE  SALERY POST  DATE OF BIRTH \n");
       scanf("%d %s %s %s %s %ld %s %s",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year);
       printf(" *****| EDIT SUCCESSFUL |*****\n");
       }
       fprintf(f1,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
       }
      fclose(f);fclose(f1);
      fun();
      break;
   case 2:
      clrscr();
      printf("********|| ENTER NAME |-\n");
      scanf("%s",chr);
      f=fopen("bata.txt","r");
      f1=fopen("cba.txt","w");
      while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
       {
       if(strcmp(chr,s.name)==0)
       {
       printf("ENTER ID NO.FIRST & LAST NAME\t CITY \tPHONE  SALARY  POST  DATE OF BIRTH \n");
       scanf("%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year);
       printf(" *****| EDIT SUCCESSFUL |*****\n");
       }
       fprintf(f1,"%d %s %s %s %s %ld %s %s\n",s.sr,s.name,s.fname,s.add,s.mono,s.d.day,s.d.month,s.d.year);
       }   fclose(f);fclose(f1);
       fun();
       }
    printf(" *****||  [Y] TO MORE DATA EDIT |- \n");
    fflush(stdin);
    scanf("%c",&ch);
   }
   while((ch=='y')||(ch=='Y'));
   break;
   case 6:
   t=0;
   f=fopen("bata.txt","r");
   while(fscanf(f,"%d %s %s %s %s %ld %s %s\n",&s.sr,s.name,s.fname,s.add,s.mono,&s.d.day,s.d.month,s.d.year)!=EOF)
   t++;
   printf("\n**** NO EMPLOYEE =%d ||***\n",t);
   break;
   case 0:
   exit(0);
   default :
   printf("\n**PLEASE AGAIN ENTER YOUR CHOICE**\n");
  }
  printf("\n|||**** [1] TO BACK MENU. \t\tANY OTHER KEY TO EXIT|-\n");
  scanf("%d",&p);
  if(p==1)
  goto main;
  else
  exit(0);
 getch();
}