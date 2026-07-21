class UniversityMember {
    public void attendLecture(){
        System.out.println("Attending a lecture.");
    }
}

interface Researcher {
    void conductLabResearch();
}

class UndergraduateStudent extends UniversityMember {

}

class GraduateStudent extends UniversityMember implements Researcher {
    public void conductLabResearch(){
        System.out.println("Graduate student doing research.");
    }
}

class Professor extends UniversityMember implements Researcher {
    public void conductLabResearch() {
        System.out.println("Professor leading research.");
    }
}

public class Main5 {
    public static void main(String[] args) {
        UniversityMember u1 = new UniversityMember();
        u1.attendLecture();

        Researcher r1 = new GraduateStudent();
        Researcher r2 = new Professor();

        r1.conductLabResearch();
        r2.conductLabResearch();
    }
    
}

