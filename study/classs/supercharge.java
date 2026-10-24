package study.classs;

public class supercharge {
    public static void main(String[] args) {
        Person person = new Person("Adolf", "Hitler");
        Reich reich = new Reich("Max","Mad", 2.4);
        Employee employee = new Employee("Adlof", "Hitman", 15000);
        reich.showgpa();
        employee.showSalary();
        person.showName();
        reich.isRunning();
        person.isRunning();
    }
}