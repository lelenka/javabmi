public class BmiService {
    public int calculate(double weight_kg, double height_m) {
        double bmi;
        bmi = (weight_kg / (height_m * height_m));

        return (int) bmi;
    }


}