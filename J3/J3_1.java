// Сортировка выбором
package J3;
import java.util.Scanner;

public class J3_1 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите размер списка n:");
        int n = iScaner.nextInt();
       
        int[] Numbers = new int[n];
        
        
        for (int item = 0; item < Numbers.length; item++) {
            Numbers[item] = (int) (Math.random() * (100));
            System.out.print(Numbers[item]+" ");
            
        }
       
          
            for (int i = 0; i < Numbers.length; i++) {
                int min = Numbers[i];
                int minIndex = i;
                for (int j = i+1; j < Numbers.length; j++) {
                    if (Numbers[j] < min) {
                        min = Numbers[j];
                        minIndex = j;
                    }
                }
                
                int temp1 = Numbers[i];
                Numbers[i] = min;
                Numbers[minIndex] = temp1;
            }
            System.out.println("");
            for (int i=0;i<Numbers.length;i++){
            System.out.print(Numbers[i]+" ");
            }
        }
    }

