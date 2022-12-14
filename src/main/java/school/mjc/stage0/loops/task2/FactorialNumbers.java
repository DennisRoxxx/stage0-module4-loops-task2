package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int i = 0;

        if (printToInclusive == 0) {
            System.out.println(1);
        }
        else {
            System.out.println(1);
            while (i < printToInclusive) {
                i++;
                factorial *= i;
                System.out.println(factorial);
            }
        }

    }
}
