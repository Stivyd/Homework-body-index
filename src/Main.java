import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        double mass = service.calculate(weight, height);

        String formattedMass = new DecimalFormat("#0.00").format(mass);
        System.out.println("Ваш индекс массы тела составляет = " + formattedMass + " Kg/M2. " );
    }
}