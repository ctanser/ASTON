package Animals;

public class Cat extends Animal {
    static int countCat = 0;
    public boolean satiety;

    Cat(String name, boolean satiety) {
        super();
        countCat++;
        this.name = name;
        this.satiety = satiety;
    }

    @Override
    public void run(int range) {
        if (range > 200) {
            System.out.println(name + " не может пробежать больше 200");
        } else {
            System.out.println(name + " пробежал " + range);
        }
    }

    @Override
    public void swim(int range) {
        System.out.println("Кот не умеет плавать");
    }

    static int getCountCat() {
        return countCat;
    }

    public void eat(Cat cat, Bowl bowl, int food) {
        if (Bowl.food >= food) {
            Bowl.food -= food;
            cat.satiety = true;
            System.out.println(cat.name + " поел, осталось еды: " + Bowl.food);
        } else {
            System.out.println(cat.name + " не хватило еды");
        }
    }

}