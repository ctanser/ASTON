package Animals;

public class Bowl extends Animal {
    public int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addEat(int foodAdd) {
        food += foodAdd;
        System.out.println("Еды в миске " + food);
    }
}
