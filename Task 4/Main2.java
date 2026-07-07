
public class Main2 {
    public static void main(String[] args) {
        
        TeamMember[] team = {
            new FullTimeEmployee("Rahim"),
            new Contractor("Karim")
        };

        
        System.out.println("--- Team Directory ---");
        for (TeamMember member : team) {
            System.out.println("Member: " + member.getName());
        }

        
        System.out.println("\n--- Calculating Bonuses ---");
        for (TeamMember member : team) {
            if (member instanceof BonusEligible) {
                ((BonusEligible) member).calculateBonus();
            } else {
                System.out.println(member.getName() + " is a Contractor (Not eligible for bonus).");
            }
        }
    }
}


abstract class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


interface BonusEligible {
    void calculateBonus();
}


class FullTimeEmployee extends TeamMember implements BonusEligible {
    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus for " + name + "...");
    }
}


class Contractor extends TeamMember {
    public Contractor(String name) {
        super(name);
    }
}

