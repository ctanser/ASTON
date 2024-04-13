public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        this.name = "Неизвестно";
        this.position = "Неизвестно";
        this.email = "Неизвестно";
        this.phone = "Неизвестно";
        this.salary = 10000;
        this.age = 1;
    }

    public void printEmployee() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        //1
        System.out.println("Задание 1");
        Employee employee1 = new Employee("Иванов Иван Иванович", "Тестировщик", "aston@mail.ru", "79101231212", 1000000.1, 25);
        employee1.printEmployee();

        //2
        System.out.println("\nЗадание 2");
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов Иван Иванович", "Тестировщик", "aston@mail.ru", "79101231212", 1000000.1, 25);
        empArray[1] = new Employee();
        empArray[2] = new Employee("Сидоров Сидор Сидорович", "Разработчик", "aston2@mail.ru", "79101231212", 1200000.1, 24);
        empArray[3] = new Employee();
        empArray[4] = new Employee("Петров Петр Петрович", "Аналитик", "aston3@mail.ru", "79101231212", 1000000.1, 25);

        for (Employee employee : empArray) {
            employee.printEmployee();
        }

    }
}
