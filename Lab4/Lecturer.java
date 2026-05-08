class Lecturer extends StaffMember
{
    private int courseCount;
    private double paymentPerCourse;

    public Lecturer(String fullName, String staffId, String department,
                     int courseCount, double paymentPerCourse)
    {
        super(fullName, staffId, department);

        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    @Override
    public double calculateMonthlyPayment()
    {
        return courseCount * paymentPerCourse;
    }

    public void displayLecturerDetails()
    {
        System.out.println("\n----- Lecturer Details -----");

        displayBasicDetails();

        System.out.println("Course Count      : " + courseCount);
        System.out.println("Payment Per Course: " + paymentPerCourse);
    }
}