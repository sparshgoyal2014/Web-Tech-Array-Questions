package com.company;

public class Average {

    public static double average(int[] arr){
        int size = arr.length;

        int sum = 0;

        for(int i=0; i<size; i++){
            sum += arr[i];
        }

        return (double) sum/size;

    }

    public static int secondLargest(int[] arr){
        int size = arr.length;
        int max1 = 0;
        int max2 = 0;

        for(int i=0; i<size; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2){
                max2 = arr[i];
            }
        }

        return max2;


    }

    public static void printOdd(int[] arr){
        int size = arr.length;

        for(int i=0; i<size; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }


    }

    public static void main(String[] args) {

        int[] arr = {23, 6, 47, 35, 2, 14};

        System.out.println("average of the given Array is: " + average(arr));
        System.out.println("the second largest of the given Array is: " + secondLargest(arr));
        System.out.println("Printing odd values of the givemn Array;");
        printOdd(arr);

    }
}
