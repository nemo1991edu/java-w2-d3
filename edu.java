import java.util.Scanner;
import java.util.*;

public class edu {

    static final int SIZE = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //first problem
        System.out.print("First Problem:");
        int num[] = {1,2,3,4,5,6,7,8,9,0}; 
        System.out.println("The input array: " + Arrays.toString(num));
        int nump1 = input.nextInt();
        System.out.println("\nKey to be searched=" + nump1);
        int r=binary(num, nump1); 
        if (r == -1){
            System.out.println("Element not found"); 
        }else{
            System.out.println("Element found at " + "index " + r); 
        } 

        //second problem
        System.out.print("Second Problem:");
        int[] num2p = new int[SIZE];
        System.out.print("Enter ten numbers to exclude from random (1-54): ");
        for (int i = 0; i < num2p.length; i++){
            num2p[i] = input.nextInt();
        }
        System.out.println("Number generated: " + getRandom(num2p));

        //third problem
        System.out.print("third Problem:");
        double[] num3p = new double[SIZE];
        System.out.print("Enter 10 double numbers: ");
        for (int i = 0; i < num3p.length; i++){
            num3p[i] = input.nextDouble();
        }
        System.out.println("The average value is: " + average(num3p));

        //fourth problem
        System.out.print("Fourth Problem:");
        double[] num4p = new double[SIZE];
        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < num4p.length; i++){
             num4p[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(num3p));
    }

    //first problem
    public static int binary(int arr[], int x) {
        int l = 0, r = arr.length - 1; 
            while (l <= r) { 
                int m = l + (r - l) / 2; 
                if (arr[m] == x){ 
                    return m; 
                }
                if (arr[m] < x) {
                    l = m + 1; 
                }else{
                    r = m - 1; 
                }
            } 
            return -1; 
    }

    //second problem
    public static int getRandom(int... num2p) {

        int random = (int)(Math.random() * 54 + 1);
        for (int i = 0; i < num2p.length; i++) {
            if (random == num2p[i]) {
                random = (int)(Math.random() * 54 + 1);
                i = -1;
            }
        }
        return random;
    }

    //third problem
    public static int average(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    public static double average(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    //fourth problem
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }



}