import java.sql.Ref;

import static java.util.Collections.swap;

public class test {
    public static void main(String[] args) {
        int[] numbers = { 19, 4 };

        System.out.println("Before swapping: a=" + numbers[0] + " and b=" + numbers[1]);
        swap(numbers);
        System.out.println("After swapping: a=" + numbers[0] + " and b=" + numbers[1]);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[1] = arr[0];
        arr[0] = temp;
    }
}
