public class Park {
    public static class Attraction {
        private String name;
        private String openingTime;
        private String closingTime;
        private double price;

        public Attraction(String name, String openingTime, String closingTime, double price) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время открытия: " + openingTime);
            System.out.println("Время закрытия: " + closingTime);
            System.out.println("Цена: " + price);
        }
    }
}