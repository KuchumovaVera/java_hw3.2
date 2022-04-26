public class BmiService {
    public double calculate(double weight, double high) {
        double bmi = weight / (high * high);
        return bmi;
    }
}