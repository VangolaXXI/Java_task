import java.text.DecimalFormat;
public class mission_3 {
    public static void main(String[] args) {
        double[] numbers = {8, -2, -4, 2, 3, 6};
        double sum = 0.0;
        boolean foundNegative = false;
        int count = 0;
        for (double number : numbers) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            } else if (number < 0) {
                foundNegative = true;
            }
        }
        double average = sum / count;
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(average);
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + formatted);
    }
}
