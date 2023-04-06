// Пусть дан произвольный список целых чисел, удалить из него чётные числа
package J3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class J3_2 {
    public static void main(String[] args) {
        
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите размер списка n:");
        int n = iScaner.nextInt();
        int temp = 0;
        int temp1 = 0;

        ArrayList<Integer> Numbers = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
            temp = (int) (Math.random() * (100));
            Numbers.add(temp);
        }
        System.out.print(Numbers);

        ListIterator<Integer> listIter = Numbers.listIterator();

        while (listIter.hasNext()) {
            temp1 = listIter.next();
            if (temp1 % 2 == 0) {
                listIter.remove();
            }
        }
        System.out.println(" ");
        System.out.print(Numbers);

    }
}
