
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


interface BonusEligible {
    void calculateBonus();
}


class FullTimeEmployee extends Employee implements BonusEligible {

    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus for " + name);
    }
}


class Contractor extends Employee {

    public Contractor(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " is working as a contractor.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Employee employee = new FullTimeEmployee("Sadman");
         if (employee instanceof BonusEligible bonusEmp) {
            bonusEmp.calculateBonus();
        }
        
        Contractor contractor = new Contractor("Akib");
        
        contractor.work();
    }
}
