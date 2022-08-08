public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 72;
        double growth = 1.77;
        double bmi = service.calculate(weight, growth);
        System.out.println("Индекс массы тела: " + bmi);
    }
}