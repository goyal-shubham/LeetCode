package Sorting;

import java.util.Random;

/**
 * Created by shubham.goyal on 2/23/17.
 */
public class Veritasdsd {


    public static int getValue(int a , int b) {


        do {
            if(a > b) {
                a = a - b;
            }
            if(b > a) {
                b = b - a;
            }
        }while(a != b);

        return a;
    }

    public static void main(String[] args) {
        int i = 0; int j = 4;
        Random r = new Random();
        while(i != j) {

            i = r.nextInt(500);
            j = r.nextInt(500);
//            System.out.println(i + " " + j + getValue(i , j));
        }

        System.out.println(getValue(2437 , 875));
    }
}
