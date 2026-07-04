public class Main5 {
    public static void main(String[] args) {
        System.out.println("--- Campus Activity Log --- \n");

        
        System.out.println("[Undergraduate Student]");
        UndergraduateStudent undergrad = new UndergraduateStudent();
        undergrad.attendLecture();
        

        System.out.println("\n------------------------------------------------\n");

        
        System.out.println("[Graduate Research Assistant]");
        GraduateResearchAssistant gra = new GraduateResearchAssistant();
        gra.attendLecture();
        gra.conductLabResearch();

        System.out.println("\n------------------------------------------------\n");

        
        System.out.println("[Professor]");
        Professor prof = new Professor();
        prof.attendLecture();
        prof.conductLabResearch();
    }
}

class UniversityMember {
    public void attendLecture() {
        System.out.println("Attending a lecture.");
    }
}

interface Researcher {
    void conductLabResearch();
}


class UndergraduateStudent extends UniversityMember {
}

class GraduateResearchAssistant extends UniversityMember implements Researcher {
    @Override
    public void conductLabResearch() {
        System.out.println("GRA: Publishing papers and running experiments.");
    }
}

class Professor extends UniversityMember implements Researcher {
    @Override
    public void conductLabResearch() {
        System.out.println("Professor: Leading research teams and analyzing data.");
    }
}



