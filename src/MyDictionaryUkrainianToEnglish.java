import java.util.ArrayList;

public class MyDictionaryUkrainianToEnglish implements Dictionary {

    private ArrayList<String> ukrainianWords;
    private ArrayList<String> englishWords;

    private int wordPairCounter;

    public MyDictionaryUkrainianToEnglish() {
        ukrainianWords = new ArrayList<>();
        englishWords = new ArrayList<>();
        wordPairCounter = 0;
    }

    @Override
    public void addingElementToDictionary(String ukrainianWord, String englishWord) {
        ukrainianWords.add(ukrainianWord);
        englishWords.add(englishWord);
        wordPairCounter++;
    }

    @Override
    public String getElementByIndex(int index) {
        return ukrainianWords.get(index) + " - " + englishWords.get(index);
    }

    @Override
    public int getTotalNumberElement() {
        return wordPairCounter;
    }


}
