// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно.

// Sample Input:

// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10

package J1;

import java.util.Scanner;

public class J1_2 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите число n:");
        String text = iScaner.nextLine();
        int n = Integer.parseInt(text);
        int[] Numbers = new int[n];
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Введите число:");
            text = iScaner.nextLine();
            Numbers[i] = Integer.parseInt(text);
        }
        System.out.println("Введите число, на которое мы будем умножать:");
        text = iScaner.nextLine();
        int k = Integer.parseInt(text);
        int[]Results =new int[n];
        System.out.println(" ");
        for (int i = 0; i < Numbers.length; i++) {
        Results[i]=Numbers[i]*k;
        System.out.println(Results[i]);
        }
    }
}
