public class Cat extends Animal {
    String name;
    static int countCat = 0;
    static int food = 50;


    Cat(String name) {
        super();
        countCat++;
        this.name = name;
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

    @Override
    public void eat() {
        if (food >= 20) {
            food -= 20;
            System.out.println("Кот " + name + " поел, осталось еды: " + food);
        } else {
            System.out.println("Коту " + name + " не хватило еды");
        }
    }

    @Override
    public void addEat(int foodAdd) {
        food += foodAdd;
        System.out.println("Еды в миске " + food);
    }


}