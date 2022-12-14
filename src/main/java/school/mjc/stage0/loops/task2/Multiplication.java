package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;

        if (multiplyByAndToInclusive == 0) {
            System.out.println();
        }

        else if (multiplyByAndToInclusive < 0) {
            int factorial = multiplyByAndToInclusive * (-1);

            while (counter <= factorial) {
                int result = factorial * counter;
                System.out.println(result * (-1));
                counter++;
            }
        } else {
            while (counter <= multiplyByAndToInclusive) {
                int result = multiplyByAndToInclusive * counter;
                System.out.println(result);
                counter++;
            }
        }
    }
}

