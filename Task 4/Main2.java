public class Main {
    public static void main(String[] args) {
        FullTimeEmployee alice = new FullTimeEmployee("Alice");
        Contractor bob = new Contractor ("bob");
        
        System.out.println("Employee: "+ alice.getName());
        alice.calculateBonus();
        
        System.out.println("Employee: "+ bob.getName());
    }
    
}

class Employee {
    protected String name;
    
    public Employee(String name){
        this.name =name ;
        
    }
    public String getName(){
        return name;
    }
}

interface BonusEligible{
    void calculateBonus();
}

class FullTimeEmployee extends Employee implements BonusEligible {
    public FullTimeEmployee(String name){
        super(name);
        
    }
    @Override
    public void calculateBonus(){
        System.out.println("Calculate standerd employee bonus for " +name + "...");
        
    }
}
class Contractor extends Employee{
    public Contractor(String name){
        super (name);
    }
}
