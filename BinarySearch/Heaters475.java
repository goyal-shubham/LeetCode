package BinarySearch;

import java.util.*;

/**
 * Created by shubham.goyal on 2/16/17.
 */
public class Heaters475 {

    public int findRadius(int[] houses, int[] heaters) {
        if(houses.length == 0 || heaters.length == 0) {
            return 0;
        }

        Arrays.sort(heaters);

        int min = 0;

        for(int value : houses) {

            int right = Integer.MAX_VALUE;
            int left = Integer.MAX_VALUE;
            int index = binarySearch(heaters, value);
            System.out.println(index);
            if(index == 0 ) {
                left = Math.abs(heaters[index]  - value);
            }
            else if(index >= heaters.length) {
                right = Math.abs(heaters[index - 1]  - value);
            }
            else {
                left = Math.abs(heaters[index]  - value);
                right = Math.abs(heaters[index - 1]  - value);
            }

            int currentMin = Math.min(right , left);
            min = Math.max(min, currentMin);
        }

        return min;

    }

    public int binarySearch(int[] heaters, int value ) {

        int start = 0;
        int end = heaters.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;

            if(heaters[mid] == value) {
                return mid;
            }
            else if(heaters[mid] < value) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Heaters475 obj = new Heaters475();

        int[] homes = new int[]{10,20,23,40,13};
        int[] heaters = new int[]{15,32};

        System.out.println(obj.findRadius(homes,heaters));
//        int[] heaters = new int[]{1, 10, 30, 6, 23};
//        int[] homes = new int[]{3, 10, 23, 35};
    }
}
