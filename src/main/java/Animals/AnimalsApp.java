package Animals;

public class AnimalsApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Животных " + Animal.getCountAnimal());

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", false);
        cats[1] = new Cat("Мурзик", false);
        cats[2] = new Cat("Жора", false);

        Dog dog1 = new Dog("Тузик");
        Dog dog2 = new Dog("Тимка");

        System.out.println("\nКошек " + Cat.getCountCat());
        cats[0].run(150);
        cats[1].run(300);
        cats[2].swim(1);


        System.out.println("\nСобак " + Dog.getCountDog());
        dog1.run(50);
        dog2.run(600);
        dog1.swim(11);
        dog2.swim(2);
        System.out.println();

        //коты едят
        for (Cat cat : cats) {
            cat.eat();
        }

        //добавляем еды
        cats[2].addEat(35);
        cats[2].eat();
    }
}