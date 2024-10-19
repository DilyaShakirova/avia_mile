public class Main {
    public static void main(String[] args) {
        int price = 20_276, price_for_1_mile = 20;
        int miles = price / price_for_1_mile;
        System.out.println("Количество начисленных миль составило: " + miles);
    }
}