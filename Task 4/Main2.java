abstract class TeamMember {
    protected String name ;
    
    public TeamMember ( String name ){
        this . name = name ; 
    }
    
    public String getName() {
        return name ;
    }
    
}

interface BonusEligible {
    void calculateBonus ();
}

class RegularEmployee extends TeamMember implements BonusEligible {
    public RegularEmployee ( String name ){
        super ( name );
    }
    
    @Override 
    public void calculateBonus (){
        System.out . println ( "Calculating standard employee bonus for " + name + "..."); 
    }
}

class Contractor extends TeamMember {
    public Contractor ( String name ){
        super ( name );
    }
}

public class main {
    public static void main ( String[] args ){
        RegularEmployee employee = new RegularEmployee ("Fariha");
        System. out . println ( " Employee: " + employee. getName ());
        employee.calculateBonus ();
        
        System.out.println ("---------------------------");
        
        Contractor contractor = new Contractor ("Diya");
        System.out.println ( " Contractor :" + contractor.getName());
        
    }
}
