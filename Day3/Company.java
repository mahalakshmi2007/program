class Company {
    static String companyName = "TechCorp";
    String employeeName;

    Company(String employeeName) {
        this.employeeName = employeeName;
    }

    void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee: " + employeeName);
    }

    public static void main(String[] args) {
        Company emp1 = new Company("maha");
        Company emp2 = new Company("punitha");

        emp1.displayDetails();
        emp2.displayDetails();

        companyName = "InnovateX";

        Company emp3 = new Company("Charlie");
        emp3.displayDetails();
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
