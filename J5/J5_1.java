package J5;

import java.security.KeyStore.Entry;
import java.util.*;
import java.util.jar.Attributes.Name;


public class J5_1 {
    public static void main(String[] args) {
        HashMap<Integer, String> ListPeople = new HashMap<Integer, String>();
        HashMap<Integer, Integer> ListMobTel = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> ListDomTel = new HashMap<Integer, Integer>();
        Scanner iScaner = new Scanner(System.in);
        String text = "";
        int key = 1;
        
        while (true) {
            System.out.println("Введите имя и фамилию (чз пробел):");
            System.out.println("q-выход");
            text = iScaner.nextLine();
            iScaner.nextLine();
            if ((text.charAt(0) == 'q')) {
                break;
            }
            ListPeople.putIfAbsent(key, text);
           
            System.out.println("Введите моб тел:");
            String text1 = iScaner.nextLine();
            int n = Integer.parseInt(text1);
            ListMobTel.put(key, n);

            System.out.println("Введите дом тел:");
            String text2 = iScaner.nextLine();
            int n1 = Integer.parseInt(text2);
            ListDomTel.put(key, n1);

            key++;
        }
        
        iScaner.close();

        System.out.println(ListPeople);

        ArrayList<String> Names = new ArrayList<>();

        for (String value : ListPeople.values()) {
            String[] People = value.split(" ");
            Names.add(People[0]);
            // System.out.println(Names);
        }
        System.out.println(Names);
        int size = Names.size();
        int counter = 1;
       
        ArrayList<Integer> Counters = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {
                if (Names.get(i).equals(Names.get(j))) {
                    counter++;
                    Names.remove(j);
                    size = Names.size();
                }
            }
            Counters.add(counter);
            counter = 1;
            

        }
        // System.out.println(Names);
        // System.out.println(Counters);

        HashMap<String, Integer> ListSort = new HashMap<String, Integer>();

        for(int i=0;i<Counters.size();i++){     
        
        ListSort.put(Names.get(i),Counters.get(i));
        }

        for(Map.Entry<Integer, String> item : ListPeople.entrySet()){
         
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
            
            
        }
        for(Map.Entry<Integer, Integer> item : ListMobTel.entrySet()){
            System.out.println("моб тел:");
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
            
            
        }

        for(Map.Entry<Integer, Integer> item : ListMobTel.entrySet()){
            System.out.println("дом тел:");
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
            
            
        }

        Map<String, Integer> sortedMap2 = new TreeMap<String, Integer>(Comparator.comparing(ListSort::get).reversed());
    sortedMap2.putAll(ListSort);
    System.out.println("Значения по частоте встречаемости:"); 
    System.out.println(sortedMap2);
        }
    }
