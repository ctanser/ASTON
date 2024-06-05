public class PhonesApp {
    public static void main(String[] args) {
        Phones phones = new Phones();
        phones.add("Иванов", "111");
        phones.add("Петров", "222");
        //phones.add("Зайцев", "333");
        phones.add("Иванов", "444");

        System.out.println("Телефон Иванов: " + phones.get("Иванов"));
        System.out.println("Телефон Петров: " + phones.get("Петров"));
        System.out.println("Телефон Зайцев: " + phones.get("Зайцев"));
    }
}
