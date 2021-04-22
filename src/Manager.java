final public class Manager extends Employee {

   final double factorM = getNumberOfSubordinates() * 0.03;

    public Manager(int salary, String name, int numberOfSubordinates) {
        super(salary, name, numberOfSubordinates);
    }


    @Override
    public double getSalary() {

        return getBaseSalary() + getBaseSalary() * factorM;
    }

}