import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public MethodReference(String content){
        System.out.println(content);
    }

    public static void outStaticVersion(String content){
        System.out.println(content);
    }

    public void out(String content){
        System.out.println(content);
    }

    public static void main(String[] args) {
        List<String> greetings = Arrays.asList("Hello World", "Godmorgen");

        // Not a method reference but a lambda
        greetings.forEach((greeting) -> System.out.println(greeting));

        // Method references
        //greetings.forEach(new MethodReference()::out);

        //calls the constructor
        greetings.forEach(MethodReference::new);

    }
}
