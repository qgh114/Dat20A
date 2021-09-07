import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hey", "Hello", "Mate", "Words", "Test", "Wooby", "Dub","Dub", "Hello", "");

        List<String> onlywords = strings.stream().filter(word -> !word.isEmpty()).collect(Collectors.toList());
        System.out.println(onlywords);

        long vocabulary = strings.stream().filter(word -> !word.isEmpty()).distinct().count();
        System.out.println(vocabulary);

        String sentence = strings.stream().filter(word -> !word.isEmpty()).collect(Collectors.joining(" "))+".";
        System.out.println(sentence);
    }
}
