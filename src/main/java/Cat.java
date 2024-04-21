public class Cat extends Animal {
    boolean satiety;
    String name;
    static int countCat = 0;
    static int food = 50;


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

    @Override
    public void eat() {
        if (food >= 20) {
            food -= 20;
            satiety=true;
            System.out.println("Кот " + name + " сыт("+satiety+"), осталось еды: " + food);
        } else {
            System.out.println("Коту " + name + " не хватило еды, сытость: "+satiety);
        }
    }

    @Override
    public void addEat(int foodAdd) {
        food += foodAdd;
        System.out.println("Еды в миске " + food);
    }


}