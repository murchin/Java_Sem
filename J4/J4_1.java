// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
package J4;

import java.util.*;

public class J4_1 {
    public static void main(String[] args) {
        System.out.println("Проверка числа: палиндром или нет");
        System.out.println("Введите число:");
        Scanner myScan = new Scanner(System.in);
        String textnumber = myScan.nextLine();

        Deque<Integer> deque = new ArrayDeque<>();
        char c = ' ';
        int c1 = 0;

        for (int i = 0; i < textnumber.length(); i++) {
            c = textnumber.charAt(i);
            c1 = c - '0';
            deque.addLast(c1);
        }
        System.out.println(deque);

        while (true) {
            if (deque.pollFirst() != deque.pollLast()) {
                System.out.println("Не палиндром");
                break;
            } else {

                if (deque.size() <= 1) {
                    System.out.println("Палиндром");
                    break;
                }
                deque.pollFirst();
                deque.pollLast();
            }
        }
        // В семинаре:
        // boolean res=true;
        // for (int i=0; i<deque.size()/2;i++){
        // int first =deque.pollFirst();
        // int last=deque.pollLast();
        // if (first!=last){
        // res =false;
        // break;
        // }
        // System.out.println(res?"Палиндром":"Не палиндром");
        // }
    }
}
