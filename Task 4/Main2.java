class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee extends TeamMember {

    public Employee(String name) {
        super(name);
    }

    public void calculateBonus() {
        System.out.println(name + " receives standard employee bonus.");
    }
}

class Contractor extends TeamMember {

    public Contractor(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " is working as a contractor.");
    }
}

public class main2 {
    public static void main(String[] args) {

        Employee emp = new Employee("Alice");
        emp.calculateBonus();

        Contractor con = new Contractor("Bob");
        con.work();
    }
}
