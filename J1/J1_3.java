// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
package J1;

import java.util.Scanner;

public class J1_3 {
    public static void main(String[] args) {

        System.out.println("Простой калькулятор 'Каркуляхтер'");
        System.out.println(" ");
        Scanner iScaner = new Scanner(System.in);
        int number = 0;
        char op = ' ';

        System.out.println("Введите число:");
        number = iScaner.nextInt();
        int result = number;

        while (true) {

            System.out.println("Введите операцию(+,-,=,*,/):");
            op = iScaner.next().charAt(0);

            if (op=='='){
                System.out.println(result);
                break;
            }     

            System.out.println("Введите число:");
            number = iScaner.nextInt();

            if (op == '+') {
                result = result + number;
                System.out.println(result);
            }
            if (op == '-') {
                result = result - number;
                System.out.println(result);
            }
            if (op == '*') {
                result = result * number;
                System.out.println(result);
            }
            if (op == '/') {
                result = result / number;
                System.out.println(result);
            }
            
            
        }
        
    }
}
