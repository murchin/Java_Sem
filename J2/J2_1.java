// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
package J2;

import java.util.Scanner;

public class J2_1 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите драг. камни");
        String jewels = iScaner.nextLine();
        System.out.println("Введите обычные камни");
        String stones = iScaner.nextLine();
        int[] counter = new int[jewels.length()];
        int n = 1;

        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    counter[i] = n++;
                }
            }
            n = 1;
            System.out.print(jewels.charAt(i));
            System.out.print(counter[i]);

        }

    }
}
