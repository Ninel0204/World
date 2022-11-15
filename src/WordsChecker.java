public class WordsChecker {
    private String text;

    public WordsChecker(String text){
        this.text=text;
    }

    public boolean hasWord(String Wold){
        return text.contains(Wold);

    }
}
