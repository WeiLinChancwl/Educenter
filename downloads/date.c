#include<stdio.h>
main()
{
	int Date(int i,int j,int k);
	int year,month,day;
	printf("�������꣬�£���:\n");
	scanf("%d%d%d",&year,&month,&day);
    printf("%d��%d��%d���Ǹ���ĵ�%d�졣\n",year,month,day,Date(year,month,day));
}

int Date(int i,int j,int k)
{
	int s,d,days=0;
	for(s=1;s<j;s++)
	{
		switch(s)
		{ case 1:case 3:case 5:case 7:case 8:case 12:d=31;break;
	      case 4:case 6:case 9:case 11:d=30;break;
	      case 2:
		    if(i%4==0&&i%100!=0||i%400==0) d=29;
		     else d=28;
		}
		days+=d;
	}
	return (k+days);
}
		  