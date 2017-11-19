package BinarySearch;

/**
 * Created by shubham.goyal on 1/27/17.
 */
public class FirstBadVersion278 {

    public int firstBadVersion(int n) {

        return firstBadVersionAux(1 , n);
    }


    public int firstBadVersionAux(int start, int end) {

        if(start == end) {
            return start;
        }

        int mid = ( start )+ (end - start) / 2;
        if(isBadVersion(mid)) {
            return firstBadVersionAux(start, mid);
        }

        else {
            return firstBadVersionAux(mid + 1, end);
        }

    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
