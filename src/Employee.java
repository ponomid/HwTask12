public abstract class Employee {
    private int baseSalary;
    private String name;
    int NumberOfSubordinates;

    public Employee(int salary, String name, int numberOfSubordinates) {
        this.baseSalary = salary;
        this.name = name;
        this.NumberOfSubordinates = numberOfSubordinates;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public double getSalary();

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.NumberOfSubordinates = numberOfSubordinates;
    }
}
