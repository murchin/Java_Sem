// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
package J2;

import java.util.Scanner;
import java.util.Arrays;

public class J2_2 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String S = iScaner.nextLine();
        int[] index = new int[S.length()];
        for (int item = 0; item < index.length; item++) {
            index[item] = item + 1;
        }
        char[] temp = new char[S.length()];
        int[] tempind = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            temp[S.length() - i - 1] = S.charAt(i);
            tempind[S.length() - i - 1] = index[i];

        }
        String S1 = String.copyValueOf(temp);

        System.out.print(S);
        System.out.print(Arrays.toString(tempind));
        System.out.print(S1);

    }
}
