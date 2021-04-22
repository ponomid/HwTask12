public class Main {
    public static void main(String[] args) {
        Director director = new Director(100, "Ilia", 4);
        Manager manager = new Manager(100, "Kvak", 4);
        Worker worker = new Worker(100, "Tolya", 0);

        System.out.println(director.getSalary());
        System.out.println(manager.getSalary());
        System.out.println(worker.getBaseSalary());

        System.out.println("2");

    }
}
