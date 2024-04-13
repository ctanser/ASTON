import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private String city;
    private String address;
    private List<Attraction> attractions;

    private Park() {
        this.parkName = "Васильки";
        this.city = "Росилевск";
        this.address = "Сусанина гора";
        this.attractions = new ArrayList<>();
    }

    public class Attraction {
        private String attractionName;
        private String startWork;
        private String endWork;
        private int price;

        private Attraction(String attractionName, String startWork, String endWork, int price){
            this.attractionName = attractionName;
            this.startWork = startWork;
            this.endWork = endWork;
            this.price = price;
        }


        public void printAttraction() {
            System.out.println("Название: " + attractionName);
            System.out.println("Начало работы: " + startWork);
            System.out.println("Окончание работы: " + endWork);
            System.out.println("Цена: " + price+"\n");
        }


    }
    public void addAttraction(String attractionName, String startWork, String endWork, int price) {
        this.attractions.add(new Attraction(attractionName, startWork, endWork, price));
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void printPark() {
        System.out.println("Парк: " + parkName);
        System.out.println("Город: " + city);
        System.out.println("Адрес: " + address);

    }

    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Водопад", "10:00", "18:00", 500);
        park.addAttraction("Горка", "11:00", "17:00", 200);
        park.addAttraction("Карусель", "09:00", "17:00", 300);

        park.printPark();
        System.out.println("\nАттракционы:");
        for(Park.Attraction attraction: park.getAttractions()){
            attraction.printAttraction();
        }
    }

}
