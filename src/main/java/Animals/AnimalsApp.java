package Animals;

public class AnimalsApp {
    public static void main(String[] args) {
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

        Bowl bowl = new Bowl(50);
        //коты едят
        for (Cat cat : cats) {
            cat.eat(bowl, 22);
            System.out.println(cat.name + " сытость: " + cat.satiety);
        }
        //добавляем еды
        bowl.addEat(35);
        cats[2].eat(bowl, 20);
        System.out.println(cats[2].name + " сытость: " + cats[2].satiety);
    }
}