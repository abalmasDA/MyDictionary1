import java.util.ArrayList;

public class MyDictionaryUkrainianToEnglish<oneLanguage, twoLanguage> implements Dictionary {
    private ArrayList<Pairs<oneLanguage, twoLanguage>> dictionaryUkrainianToEnglish;

    public MyDictionaryUkrainianToEnglish() {
        dictionaryUkrainianToEnglish = new ArrayList<>();
    }

    @Override
    public void addingElementToDictionary(Object ukrainianWord, Object englishWord) {
        Pairs pairs = new Pairs<>(ukrainianWord, englishWord);
        dictionaryUkrainianToEnglish.add(pairs);
    }


    @Override
    public String getElementByIndex(int index) {
        return dictionaryUkrainianToEnglish.get(index).toString();
    }

    @Override
    public int getTotalNumberElement() {
        return dictionaryUkrainianToEnglish.size();
    }


}
