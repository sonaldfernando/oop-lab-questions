class LabAssistant extends StaffMember
{
    private int hoursWorked;
    private double hourlyRate;

    // department can be used here because protected members are accessible in child classes
    public LabAssistant(String fullName, String staffId, String department,
                        int hoursWorked, double hourlyRate)
    {
        super(fullName, staffId, department);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlyPayment()
    {
        return hoursWorked * hourlyRate;
    }

    public void displayLabAssistantDetails()
    {
        System.out.println("\n----- Lab Assistant Details -----");

        displayBasicDetails();

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate : " + hourlyRate);
    }
}