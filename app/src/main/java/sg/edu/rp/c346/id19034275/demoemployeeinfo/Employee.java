package sg.edu.rp.c346.id19034275.demoemployeeinfo;

public class Employee {
    private String name;
    private String title;
    private Double salary;

    public Employee(String name, String title, Double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public Double getSalary() {
        return salary;
    }
}
