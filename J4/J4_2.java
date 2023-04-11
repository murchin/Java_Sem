//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
// public static void main(String[] args) {
//     Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
//     Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
//     // result [6,6,0,1]

package J4;

import java.util.*;

public class J4_2 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        LinkedList<Integer> res = new LinkedList<>();
        int n = 0;
        int sizeD = 3;

               
        for (int i = 0; i < sizeD; i++) {

            n = d1.pollFirst() + d2.pollFirst();
            
            if (n < 9) {
                res.addLast(n);
            } else {
                res.addLast(n % 10);
                res.addLast(1);
            }
        }
        System.out.println(res);
    }
}
