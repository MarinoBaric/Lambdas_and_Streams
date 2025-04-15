import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Shape {
    double area(double x);
}

public class Lambdass {
    

    public static void main(String[] args) {
        /*
            ✅ ZADATAK 1: Runnable s lambdom
            Napraviti dretvu koja koristi lambdu i ispisuje:

            "This is a lambda Runnable!"

            🎯 Cilj: da shvatiš kako lambda može zamijeniti klasični Runnable.
         */

         Runnable r = () -> System.out.println("This is thread lambda running!!!");
         new Thread(r).start();

         List<String> names = Arrays.asList("Marko", "Ana", "Ivana", "Luka");

         names.sort((o1,o2) -> o1.compareTo(o2));
         System.out.println(names);

         Shape shape1 = (a) -> a*a;
         System.out.println(shape1.area(2));

         Shape shape2 = (a) -> Math.PI * a * a;
         System.out.println(shape2.area(5));

         Shape shape3 = (a) -> a * 10;
         System.out.println(shape3.area(6));

         
    }
}
