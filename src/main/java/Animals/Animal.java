package Animals;

public class Animal {
    public static int countAnimal = 0;
    public boolean satiety;
    public String name;
    public Animal() {
        countAnimal++;
    }

    void run(int range) {

    }

    void swim(int range) {

    }

    static int getCountAnimal() {
        return countAnimal;
    }



    public boolean eat(String name, boolean satiety){

        return satiety;
    }

    void addEat(int foodAdd) {

    }

}