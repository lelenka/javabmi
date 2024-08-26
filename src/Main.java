public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 59;
        double heightM = 1.60;
        int bmi = service.calculate(weightKg, heightM);

        System.out.println(bmi);
    }
}
