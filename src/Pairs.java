public class Pairs<oneLanguage, twoLanguage> {
    private oneLanguage word1;
    private twoLanguage word2;

    public Pairs(oneLanguage word1, twoLanguage word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public oneLanguage getWord1() {
        return word1;
    }

    public twoLanguage getWord2() {
        return word2;
    }

    @Override
    public String toString() {
        return "{" +
                "word1=" + word1 +
                ", word2=" + word2 +
                '}';
    }
}
