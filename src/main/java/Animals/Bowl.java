package Animals;

public class Bowl extends Animal {
    private int food;
       public Bowl(int food) {
        this.food = food;
    }

    @Override
    public boolean eat(String name, boolean satiety) {
        if (food >= 20) {
            food -= 20;
            satiety=true;
            System.out.println( name + " поел, осталось еды: " + food);
        } else {
            System.out.println(name + " не хватило еды");
        }
        return satiety;
    }

    @Override
    public void addEat(int foodAdd) {
        food += foodAdd;
        System.out.println("Еды в миске " + food);
    }
}
