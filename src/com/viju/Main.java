package com.viju;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int i, j, size, data, row, column;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the size of one-dimensional array:");
	size = in.nextInt();
	int[] number1 = new int[size];
	for(i=0; i<size; i++)
    {
        System.out.println("Enter "+i+" cell value");
        data = in.nextInt();
        number1[i]=data;
    }
	System.out.println("One-dimensional array values are");
	System.out.println(Arrays.toString(number1));
	
	System.out.println("Enter how many rows you want to insert for two-dimensional array");
	row = in.nextInt();
	System.out.println("Enter how many columns you want to insert for two-dimensional array");
	column = in.nextInt();
	int[][] number2 = new int[row][column];
	for(i=0; i<row; i++)
    {
        for(j=0; j<column;j++)
        {
            System.out.println("Enter value for "+i+" , "+j+" cell");
            int value = in.nextInt();
            number2[i][j]=value;
        }
    }
	System.out.println("Two-dimensional array values are");
	System.out.println(Arrays.deepToString(number2));
    }
}
