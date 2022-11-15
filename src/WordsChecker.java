import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private final Set<String> worldHet = new HashSet<>();

    public WordsChecker(String text) {
        Collections.addAll(worldHet, text.split("\\P{IsAlphabetic}+"));
    }


    public boolean hasWord(String Wold) {
        return worldHet.contains(Wold);

    }
}
