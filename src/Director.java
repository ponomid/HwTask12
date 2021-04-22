final public class Director extends Employee{
    final double factorD = getNumberOfSubordinates() * 0.09;

    public Director(int salary, String name, int numberOfSubordinates) {
        super(salary, name, numberOfSubordinates);
    }


    @Override
    public double getSalary() {
        return getBaseSalary() + getBaseSalary() * factorD;
    }
}
