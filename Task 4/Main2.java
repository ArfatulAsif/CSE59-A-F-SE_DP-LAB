
class TeamMember {
    protected String name;

    TeamMember(String name) {
        this.name = name;
    }
}

interface BonusEligible {
    void calculateBonus();
}

class Employee extends TeamMember implements BonusEligible {

    Employee(String name) {
        super(name);
    }
    
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus...");
    }
}

class Contractor extends TeamMember {

    Contractor(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " is working as a contractor.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice");
        emp.calculateBonus();

        Contractor con = new Contractor("Bob");
        con.work();
    }
}
