public class Main {

    public static void main(String[] args){
    Main main=new Main();
    main.test("test");
    //Systems.test("Say hello");
    //Systems.test2(5);
    Systemas.out.println("Say hello");
    Systemas.out.println(5);
    Systemas.out.println(5.00);
    Systemas.out.println(5.0);
    Systemas.out.println(new Word("w"));

    Word[] words = new Word[]{
            new Word("1"),
            new Word("2"),
            new Word("3"),
            new Word("4"),
            new Word("5"),
    };
        System.out.println(words.toString());

        Systemas.out.println(words);




    }

    public static void test(String hello){
        System.out.println(hello);

    }

}
