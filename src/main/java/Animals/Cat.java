package Animals;

public class Cat extends Animal {

    static int countCat = 0;

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


}