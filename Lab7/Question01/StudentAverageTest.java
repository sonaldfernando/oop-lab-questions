public class StudentAverageTest {

    public static void main(String[] args) {

        StudentAverageCalculator calculator =
                new StudentAverageCalculator(500, 0);

        try {
            // Exception occurs because numberOfStudents is 0
            int average = calculator.calculateAverage();
            System.out.println("Average: " + average);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of students cannot be zero.");

        } finally {
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
}