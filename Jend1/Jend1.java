package Jend1;

import java.util.*;

import javax.management.remote.NotificationResult;

import Jend1.Nout;

public class Jend1 {
    public static void main(String[] args) {

        HashSet<Nout> ListN = new HashSet<Nout>();

        Scanner iScaner = new Scanner(System.in);
        int number = 0;
        int ozu = 0;
        int Vgd = 0;
        String Op = " ";
        String Color = " ";
        boolean flag = true;
        String temp = " ";

        while (flag) {
            System.out.println("Введите параметры ноута ");

            number++;

            System.out.println("ОЗУ?");
            temp = iScaner.nextLine();
            ozu = Integer.parseInt(temp);
            iScaner.nextLine();

            System.out.println("Объем ЖД?");
            temp = iScaner.nextLine();
            Vgd = Integer.parseInt(temp);
            iScaner.nextLine();

            System.out.println("Операционка?");
            temp = iScaner.nextLine();
            Op = temp;

            System.out.println("Цвет?");
            temp = iScaner.nextLine();
            Color = temp;

            ListN.add(new Nout(number, ozu, Vgd, Op, Color));

            System.out.println("(Выход: q, продолжить - любые символы)");
            temp = iScaner.nextLine();
            if ((temp.charAt(0) == 'q') & (iScaner.nextLine().length() < 2)) {
                flag = false;
            }
        }

        System.out.println("SIZE:" + ListN.size());

        for (Nout s : ListN) {
            s.PrintNout();
        }

        System.out.println("Сортировка ноутбуков:");
        System.out.println("1-по ОЗУ");
        System.out.println("2-по ЖД");
        System.out.println("3-по Операционке");
        System.out.println("4-по Цвету");
        int Var = Integer.parseInt(iScaner.nextLine());
        

        switch (Var) {

            case (1):
                System.out.println("по ОЗУ. Введите min ОЗУ:");
                int minozu = Integer.parseInt(iScaner.nextLine());
                for (Nout s : ListN) {
                    if (s.ozu > minozu) {
                        s.PrintNout();
                    }
                }
                break;

            case (2):
                System.out.println("по Жд. Введите min Жд:");
                int minGd = Integer.parseInt(iScaner.nextLine());
                for (Nout s : ListN) {
                    if (s.ozu > minGd) {
                        s.PrintNout();
                    }
                }
                break;

            case (3):
                System.out.println("по Операциоке. Введите операционку:");
                String qOp = iScaner.nextLine();
                for (Nout s : ListN) {
                    if ((s.Op).equalsIgnoreCase(qOp)) {
                        System.out.println("Ноуты с опер. системой " + qOp);
                        s.PrintNout();
                    }
                }
                break;

            case (4):
                System.out.println("по Цвету. Введите Цвет:");
                String qColor = iScaner.nextLine();
                for (Nout s : ListN) {
                    if ((s.Color).equalsIgnoreCase(qColor)) {
                        System.out.println("Ноуты с Цвет " + qColor);
                        s.PrintNout();
                    }
                }
                break;
            default:
                System.out.println("Без сортировки. Спасибо за внимание");
        }
    }
}
