import java.util.ArrayList;

public class Word {
    String word;

    public Word(String word){
        this.word=word;

    }

    public ArrayList<Word> liste = new ArrayList<Word>();{
        liste.add("1");
        liste.add("2");
        liste.add("3");
        liste.add("4");
        liste.add("5");
    }


    @Override
    public String toString() {
        return word;
    }
}
