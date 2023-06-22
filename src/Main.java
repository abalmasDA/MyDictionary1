/**
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість використання його екземпляра.
 * Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар елементів,
 * індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної кількості пар елементів.
 */


public class Main {

    public static void main(String[] args) {

        MyDictionaryUkrainianToEnglish ukrainianToEnglish = new MyDictionaryUkrainianToEnglish();
        ukrainianToEnglish.addingElementToDictionary("Бігати", "Run");
        ukrainianToEnglish.addingElementToDictionary("Стрибати", "Jump");
        ukrainianToEnglish.addingElementToDictionary("Ходити", "Walk");
        ukrainianToEnglish.addingElementToDictionary("Плавати", "Swim");
        ukrainianToEnglish.addingElementToDictionary("Вчитись", "Learn");
        ukrainianToEnglish.addingElementToDictionary("Програмувати", "Program");
        System.out.println(ukrainianToEnglish.getElementByIndex(5));
        System.out.println(ukrainianToEnglish.getTotalNumberElement());


    }
}
