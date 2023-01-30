public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10000;
        int miles = service.calculate(ticketPrice);
        System.out.println("Стоимость вашего билета " + ticketPrice + " руб.");
        System.out.println("Вам начисленно " + miles + " миль");
    }
}