import java.util.ArrayList;
import java.util.List;

public  class Animal {
    static int countAnimal = 0;
    public List<Cat> cats;
    public Animal() {
        countAnimal++;
        this.cats = new ArrayList<>();
    }

    void run (int range) {

    }

    void swim (int range){

    }

    static int getCountAnimal(){
        return countAnimal;
    }

    void eat () {

    }

    void addEat (int foodAdd) {

    }

}