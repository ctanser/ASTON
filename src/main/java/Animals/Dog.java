package Animals;

public class Dog extends Animal {
    static int countDog = 0;

    Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }

    @Override
    public void run(int range) {
        if (range > 500) {
            System.out.println(name + " не может пробежать больше 500");
        } else {
            System.out.println(name + " пробежал " + range);
        }
    }

    @Override
    public void swim(int range) {
        if (range > 10) {
            System.out.println(name + " не может проплыть больше 10");
        } else {
            System.out.println(name + " проплыл " + range);
        }
    }

    static int getCountDog() {
        return countDog;
    }
}