public class Worker extends Employee{


    public Worker(int salary, String name, int numberOfSubordinates) {
        super(salary, name, numberOfSubordinates);
    }

    @Override
    final public double getSalary() {
        return 0;
    }

    @Override
   final public int getBaseSalary() {
        return super.getBaseSalary();
    }

    //Задача №2
    //
    //Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
    //
    //Необходимо создать класс Manager в который нужно добавить следующие методы:
    //getNumberOfSubordinates - получить количество подчиненных
    //setNumberOfSubordinates
    //
    // в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> *
    // (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.
    //
    //Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать
    // результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0,
    // то результат как у обычного рабочего.

}
