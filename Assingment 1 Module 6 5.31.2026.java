public class AverageCalculator {

    // Method that calculates the average of N numbers
    public double calculateAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }

        return sum / numbers.length;
    }
}
