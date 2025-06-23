package financialforecast;

public class Forecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, years - 1);
    }

    // Iterative version (optimized)
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int years) {
        double futureValue = presentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.05; // 5% growth
        int years = 3;

        double futureValueRecursive = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Predicted Future Value after %d years (Recursive): ₹%.2f%n", years, futureValueRecursive);

        double futureValueIterative = calculateFutureValueIterative(presentValue, growthRate, years);
        System.out.printf("Predicted Future Value after %d years (Iterative): ₹%.2f%n", years, futureValueIterative);
    }
}