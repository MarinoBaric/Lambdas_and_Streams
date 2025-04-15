/*
 * 
 ✅ Zadatak 1: Runnable kao lambda
Napraviti Runnable koji ispisuje:

"Lambda thread is running..."
i pokreni ga u dretvi.
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Operation {
    int apply(int a, int b);
}

public class task1 {
    
    public static void main(String[] args) throws Exception {
        //task 1
        Runnable r = () -> System.out.println("Lambda Thread is running...");
        new Thread(r).start();


        /*
         * ✅ Zadatak 2: Comparator preko lambde
            Imaš listu List<String> names = Arrays.asList("Ana", "Ivan", "Petra", "Marko");

            Sortiraj tu listu po dužini imena koristeći lambdu.
         */

        List<String> list = new ArrayList<>();
        list.add("OMG");
        list.add("ABS");
        System.out.println(list);

        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);
         
        Operation add = (a,b) -> a+b;
        System.out.println("The sum of 2 numbers is: " + add.apply(5, 2));

        Operation sub = (a,b) -> a-b;
        System.out.println("The result of sub is: " + sub.apply(5, 2));

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        numbers.forEach(n -> System.out.println(Math.pow(n, 2)));
    }
}
