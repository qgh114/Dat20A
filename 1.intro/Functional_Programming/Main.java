import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //anonymous class
        AbstractClass abstractClassImplemented = new AbstractClass(){
            @Override
            public void makeSurrealArt(){
                System.out.println("Created by ");

            }
        };

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String firstString, String secondString) {
                return firstString.compareTo(secondString);
            }

        };
        System.out.println(comparator.compare("a","b"));

        //Create this as lambda
        Concatenator concat = (firstString, secondString) -> firstString + secondString;
        System.out.println(concat.cat("Hello", "World"));



    }
}
