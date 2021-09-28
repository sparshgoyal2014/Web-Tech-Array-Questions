package com.company;

public class Matrices {

    public static int multiplySum(int[][] mat1, int[][] mat2, int m, int n){
        int sum = 0;
        for(int i=0; i<mat1[0].length; i++){
            sum += mat1[m][i] * mat2[i][n];
        }

        return sum;
    }


    public static int[][] multiply(int[][] mat1, int[][] mat2){
        int row1 = mat1.length;
        int row2 = mat2.length;
        int col1 = mat1[0].length;
        int col2 = mat2[0].length;

        if(col1 != row2){
            return null;
        }

        int result[][] = new int[row1][col2];


        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){

                int num = multiplySum(mat1, mat2, i, j);
                result[i][j] = num;
            }
        }


        return result;

    }

    public static int trace(int[][] mat){

        int size = mat.length;
        int result = 0;

        for(int i=0; i<size; i++){
            result += mat[i][i];
        }

        return result;



    }


    public static boolean checkSymmetric(){

    }



    public static void main(String[] args) {

        int mat1[][] =  {{1,2},{3,4},{5,6}};
        int mat2[][] = {{6,5,4},{3,2,1}};

        System.out.println("After multiplying the given two Matrices");

        int[][] result = multiply(mat1, mat2);

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }System.out.println();
        }

        int[][] grid = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                grid[i][j] = (i+1) + (j*3);
            }
        }

        System.out.println("The trace of the grid matrix is: " + trace(grid));




    }
}
