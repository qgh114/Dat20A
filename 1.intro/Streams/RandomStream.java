import java.util.Random;

public class RandomStream {
    public static void main(String[] args) {
        Random random = new Random();
        //outputs a stream of random numbers (limit = how many numbers printed)
        random.ints().limit(4).forEach((number) -> System.out.println(number));
    }
}
