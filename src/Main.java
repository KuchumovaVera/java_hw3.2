public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double bmi1 = bmi.calculate(68, 1.72);
        System.out.println((int)bmi1);
    }
}