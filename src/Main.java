import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000);
        }

        System.out.println(Arrays.toString(arr));

        int total = 0;
        for (int element : arr) {
            total += element;
        }
        System.out.println(total);
        int minInt = 1000000;
        int max = 0;
        for (int element : arr) {

            if (minInt > element) {
                minInt = element;
            }

            if (max < element) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minInt + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        int total1 = 0;
        for (int element : arr) {
            total1+= element;
        }
        double avg  = total / arr.length;
        System.out.println(avg);

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i > -1 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}