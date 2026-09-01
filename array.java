import java.util.Scanner;

public class array {

    void updateArr(int[] array, int target, int add) {
        int i = findElement(array, target);

        if (i != -1) {
            array[i] = add;
            for (i = 0; i < 8; i++) {
                System.out.println(array[i]);
            }
        } 
        else {
            System.out.println("sorry!, this element does not exist");
        }
    }

    void second(int[] array) {
        int i = 0, n = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
        while (i < array.length) {
            if (array[i] > n) {
                sec = n;
                n = array[i];
            } 
            else if (array[i] > sec && array[i] != n) {
                sec = array[i];
            }
            i++;
        }
        System.out.println(sec + " is second largest element");
    }

    void findMax(int[] array) {
        int n = Integer.MIN_VALUE;
        for (int i = 0; i < 8; i++) {
            if (array[i] > n) {
                n = array[i];
            }
        }
        System.out.println(n + " is the maximum value");
    }

    void findMin(int[] array) {
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            if (array[i] < n) {
                n = array[i];
            }
        }
        System.out.println(n + " is the minimum value");
    }

    void arrReverse(int[] array) {
        int i = 0, j = array.length - 1, temp;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        for (i = 0; i < 8; i++) {
            System.out.println(array[i]);
        }
    }

    int findElement(int[] array, int target) {
        for (int i = 0; i < 8; i++) {
            if (array[i] == target) {
                System.out.println("element found at index " + (i + 1));
                return i;
            }
        }
        System.out.println("element not found");
        return -1;
    }

    public static void main(String args[]) {
        array obj = new array();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[8];
        System.out.println("enter elements of array");
        for (int i = 0; i < 8; i++) {
            int n = sc.nextInt();
            array[i] = n;
        }
        System.out.println("enter element to be searched");
        int target = sc.nextInt();

        obj.findElement(array, target);
        obj.arrReverse(array);
        obj.findMax(array);
        obj.findMin(array);
        obj.second(array);

        System.out.println("enter the element to update");
        target = sc.nextInt();

        System.out.println("enter the element to add");
        int n = sc.nextInt();

        obj.updateArr(array, target, n);

        sc.close();
    }
}