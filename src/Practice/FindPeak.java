package Practice;

public class FindPeak {
    public static void main(String[] args) {
        int[] array = {4,4,5,6,7,3,2,1};
        System.out.println(Peak(array));
    }
    public static int Peak(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while(start < end) {
            int mid = start + (end + start) / 2;
            if (array[mid] < array[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
