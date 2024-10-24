public class Main {
    public static void main(String[] args) {
        int price = 20_276;
        int priceForMile = 20;
        int miles = price / priceForMile;
        System.out.println("Количество начисленных миль составило: " + miles);
    }
}