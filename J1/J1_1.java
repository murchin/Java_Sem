// ask_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
// Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

// Sample Input:

// 8
// 11
// Sample Output:

// 512
// 1331

// Task_2.

package J1;

import java.util.Scanner;

public class J1_1 {
    public static void main(String[] args) {

        double[] Cube_Number = new double[1000];

        for (int i = 0; i < Cube_Number.length; i++) {
            Cube_Number[i] = Math.pow(i + 1, 3);
        }

        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите число 1:");
        String text = iScaner.nextLine();
        int a = Integer.parseInt(text);
        System.out.println("Введите число 2:");
        text = iScaner.nextLine();
        int b = Integer.parseInt(text);

        System.out.println("Число " + a + " в кубе равно " + Cube_Number[a-1]);
        System.out.println("Число " + b + " в кубе равно " + Cube_Number[b-1]);
        
        
    }

}
