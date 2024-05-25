package Animals;

public class Bowl extends Animal {
    public static int food;

    public Bowl(int food) {
        Bowl.food = food;
    }

    public void addEat(int foodAdd) {
        food += foodAdd;
        System.out.println("Еды в миске " + food);
    }
}
