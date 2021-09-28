package com.company;

public class Array2D {

    public static void printFib(int n){
        int[] arr = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int i=0; i<=n; i++){
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) {

        int[][] arr = new int[5][];

        for(int i=0; i<5; i++){
            arr[i] = new int[i+1];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }

        System.out.println("Print Fibonacci series of 10 Numbers: ");
        printFib(10);


    }
}
