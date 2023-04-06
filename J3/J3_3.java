//  Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package J3;

import java.util.Scanner;
import java.util.*;

public class J3_3 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите размер списка n:");
        int n = iScaner.nextInt();
        int temp = 0;
        

        ArrayList<Integer> Numbers = new ArrayList<>(n);
        iScaner.nextLine();
        for (int i = 0; i < n; i++) {
            temp = (int) (Math.random() * (100));
            Numbers.add(temp);
        }
        System.out.print(Numbers);
        System.out.println(" ");
        int Max = Collections.max(Numbers);
        int Min = Collections.min(Numbers);

        int Sum = 0;
        double Avg = 0;
        for (int i = 0; i < Numbers.size(); i++) {
            Sum += Numbers.get(i);
        }
        Avg = Sum / Numbers.size();

        System.out.println("Max:" + Max);
        System.out.println("Min:" + Min);
        System.out.println("Average:" + Avg);

    }

}