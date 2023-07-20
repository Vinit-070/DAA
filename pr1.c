
//Implement factorial algorithm using iterative and recursive manner.
#include<stdio.h>
#include<time.h>
int lc=0,fc=0;
double fact(int n)     //Recursive
{
	int f;
	if(n==1)
	f=1;
	else
	f=n*fact(n-1);
fc++;                 //Function Count
return f;
}
void main()
{
	clock_t st,et;
	int i,n,c;
	double f=1,tt;
	printf("Enter Number:");
	scanf("%d",&n);
	printf("\n1)Itterative");
	printf("\n2)Recursive");
	printf("\n\nEnter Your choice above:");
	scanf("%d",&c);
	switch(c)
	{
		case 1:
			st=clock();     //Starting Time
			for(i=1;lc++,i<n+1;i++)     //Itterative
			f=f*i;
			et=clock();     //Ending Time
			break;
		
		case 2:
			st=clock();     //Starting Time
			f=fact(n);
			et=clock();     //Ending Time
			break;

		default:
			printf("Wrong Choice");
			break;

	}
	tt=(double) (et-st)/CLOCKS_PER_SEC;
	printf("factorial of %d is %lf.\n",n,f);
	if(c==1)
	printf("\nLoop=%d",lc);
	else
	printf("\nFunction=%d",fc);
	printf("\nTotal Time=%lf Second\n",tt);
}