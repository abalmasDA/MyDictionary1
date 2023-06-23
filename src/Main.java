/**
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість використання його екземпляра.
 * Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар елементів,
 * індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної кількості пар елементів.
 */


public class Main {

    public static void main(String[] args) {

        MyDictionaryUkrainianToEnglish myDictionaryUkrainianToEnglish = new MyDictionaryUkrainianToEnglish<>();
        myDictionaryUkrainianToEnglish.addingElementToDictionary("Бігати", "Run");
        myDictionaryUkrainianToEnglish.addingElementToDictionary("Стрибати", "Jump");
        myDictionaryUkrainianToEnglish.addingElementToDictionary("Ходити", "Walk");
        myDictionaryUkrainianToEnglish.addingElementToDictionary("Бігати", "Run");
        myDictionaryUkrainianToEnglish.addingElementToDictionary("Плавати", "Swim");
        myDictionaryUkrainianToEnglish.addingElementToDictionary("Вчитись", "Learn");
        myDictionaryUkrainianToEnglish.addingElementToDictionary("Програмувати", "Program");
        System.out.println(myDictionaryUkrainianToEnglish.getElementByIndex(6));
        System.out.println(myDictionaryUkrainianToEnglish.getTotalNumberElement());


    }
}
