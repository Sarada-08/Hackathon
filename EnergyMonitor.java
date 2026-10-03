import java.util.Scanner;

public class EnergyMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double energyGenerated = sc.nextDouble();
        
        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
    }
}