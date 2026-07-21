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


    public void conductLabResearch() {
        System.out.println("Publishing papers and running experiments.");
    }
}

class Professor extends UniversityMember implements Researcher {


    public void conductLabResearch() {
        System.out.println("Publishing papers and running experiments.");
    }
}

public class Main {

    public static void main(String[] args) {

        UndergraduateStudent undergrad = new UndergraduateStudent();
        GraduateResearchAssistant gra = new GraduateResearchAssistant();
        Professor professor = new Professor();

        undergrad.attendLecture();

        gra.attendLecture();
        gra.conductLabResearch();

        professor.attendLecture();
        professor.conductLabResearch();
    }
}
