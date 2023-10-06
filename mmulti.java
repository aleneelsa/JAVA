

import java.util.Scanner;

public class mmulti{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("enter the no. of rows of first matrix");

int row1=sc.nextInt();

System.out.println("enter the no. of colums of first matrix");

int col1=sc.nextInt();

System.out.println("enter the no. of rows of second matrix");

int row2=sc.nextInt();

System.out.println("enter the no. of colums of second matrix");

int col2=sc.nextInt();

int matrix1[][]=new int[row1][col1];

int matrix2[][]=new int[row2][col2];

int product[][]=new int[row1][col2];

System.out.println("enter the elements of matrix 1");

for(int i=0;i<row1;i++)

{

for(int j=0;j<col1;j++)

{

matrix1[i][j]=sc.nextInt();

}

}

System.out.println("enter the elements of matrix 2");

for(int i=0;i<row2;i++)

{

for(int j=0;j<col2;j++)

{

matrix2[i][j]=sc.nextInt();

}

}

if(col1!=row2)

{

	System.out.println("MULTIPLICATION IS NOT POSSIBLE");	

}

else

{

for(int i=0;i<row1;i++)

	{

for(int j=0;j<col2;j++)	

		{

	product[i][j]=0;

	for(int k=0;k<col1;k++)

	{

		product[i][j]+=matrix1[i][k]*matrix2[k][j];

	}

	System.out.print(product[i][j]+"\t");

		

	}

System.out.println("\n");

	}

}

}

}