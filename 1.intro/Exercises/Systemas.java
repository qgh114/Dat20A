import java.util.ArrayList;
import java.util.List;

public class Systemas {

    public static class out {

        public static void println(String hello) {
            System.out.println(hello);
        }

        public static void println(int hello) {
            System.out.println(hello);
        }

        public static void println(double hello) {
            System.out.println(hello);
        }
/*
        public static void println(float hello) {
            System.out.println(hello);
        }

        public static void println(float hello) {
            System.out.println(hello);
        }

 */

        public static void println(Word w) {
            System.out.println(w);
        }

        public static void println(Object[] content) {
            for (Object object : content
            ) {
                System.out.println(object);

            }
        }

        public ArrayList<String> liste = new ArrayList<String>();

        {
            liste.add("1");
            liste.add("2");
            liste.add("3");
            liste.add("4");
            liste.add("5");
        }

        public static void println(List<Object> obj) {
            for (Object o : obj
            ) {
                System.out.println(o);
                ;

            }

        }


    }
}

