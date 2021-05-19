/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть.
В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.; плавание:
кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/

package HomeWork6;

public class HomeWork6 {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Семён", 550, 9);
        Cat cat1 = new Cat("Муста", 150, 1);
        Cat cat2 = new Cat("Вася", 201, 9);

        Animal[] animal = {dog1, cat1, cat2};

        for (int i = 0; i < animal.length; i++) {
            animal[i].run(animal[i].lengthRun);
            animal[i].swim(animal[i].lengthSwim);
            System.out.println("--");
        }

        System.out.println("Кол-во животных - " + Animal.amount + ", кол-во котов - " + Cat.amountCat + ", кол-во собак - " + Dog.amountDog);
    }
}
