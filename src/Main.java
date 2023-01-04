import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // reading the array size.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int size = s.nextInt();

        // create an array
        int[] array = new int[++size];
        for (int i = 1; i < size; i++) {
            System.out.println("Enter number "+i );
            int value = s.nextInt();
            array[i] = value;

        }
        // getting array length
        int length = array.length;
        // default sum value.
        int sum = 0;
        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / length;
        System.out.println("Average is : " + average);

    }
}