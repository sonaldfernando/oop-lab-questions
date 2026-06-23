public class StudentAverageCalculator {

    private int totalMarks;
    private int numberOfStudents;

    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    public int calculateAverage() {
        return totalMarks / numberOfStudents;
    }
}