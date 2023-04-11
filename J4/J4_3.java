// Task_5
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false
package J4;

import java.util.*;

import javax.xml.stream.util.StreamReaderDelegate;

public class J4_3 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите строку из скобок");
        System.out.println("Является ли она логически правильной?");
        String text = iScaner.nextLine();
        char[] Char = text.toCharArray();

        Deque<Character> Simbols = new ArrayDeque<>();
        for (int i = 0; i < Char.length; i++) {
            char temp = Char[i];
            Simbols.addLast(temp);
        }

        boolean flag = true;
        char first1 = ' ';
        char first2 = ' ';
        char last1 = ' ';
        char last2 = ' ';
        String StrL = "(,[,{";
        String StrR = "),[,}";

        // System.out.println(Simbols);
        if (Char.length % 2 != 0) {
            flag = false;
        } else {
            while (Simbols.size()!=4) {
                first1 = Simbols.pollFirst();
                last1 = Simbols.pollLast();
                first2 = Simbols.pollFirst();
                last2 = Simbols.pollLast();

                if (StrL.indexOf(first1) != StrR.indexOf(first2)) {
                    if (StrL.indexOf(first1) != StrR.indexOf(last1)) {
                        flag = false;
                        break;
                    }

                    if (StrR.indexOf(last1) != StrL.indexOf(last2)) {
                        if (StrR.indexOf(last1) != StrL.indexOf(first1)) {
                            flag = false;
                            break;
                        }
                    }
                    if (StrR.indexOf(first2) != -1) {
                        flag = false;
                        break;
                    }
                    if (StrL.indexOf(last2) != -1) {
                        flag = false;
                        break;
                    }
                }

            }

        }
        System.out.println(flag ? "Верно" : "НЕ ВЕРНО!");
    }

}
