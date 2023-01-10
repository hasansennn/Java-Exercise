package furkanSorular;

import java.util.Arrays;

public class soru5_array {

    public static void main(String[] args) {

        /*
        5.  Write a program that can reverse an array of integers and returns it as new array
        ex: array = {1,2,3,4,5};
        output:reversedArray = {5,4,3,2,1};

        5.Soru: Bir tamsayı array'i tersine çevirebilen ve onu yeni array olarak döndüren bir program yazın.
         */
        int [] arr= {1,2,3,4,5};
        int [] tersArr=new int[arr.length];

        for (int i = 0; i <arr.length; i++) {
            tersArr[i]=arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(tersArr)); // [5, 4, 3, 2, 1]
    }
}
