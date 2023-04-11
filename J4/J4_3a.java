package J4;

import java.util.*;

public class J4_3a {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите строку из скобок");
        System.out.println("Является ли она логически правильной?");
        String text = "(){}()";
        

        boolean flag = true;
        char first1 = ' ';
        char first2 = ' ';
        char last1 = ' ';
        char last2 = ' ';
        String StrL = "(,[,{";
        String StrR = "),[,}";

        System.out.println(text + text.length());

        
            for (int i = 0; i < text.length()-1; i++) {

                first1 = text.charAt(i);
                last1 = text.charAt(text.length() - i - 1);
                first2 = text.charAt(i + 1);
                last2 = text.charAt(text.length() - i - 2);

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
                    
                }

            }
            System.out.println(flag ? "Верно" : "НЕ ВЕРНО!");
        }
        
    }


