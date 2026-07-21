interface Researcher {
    void conductLabResearch ();
}

class UniversityMember {
    public void attendLecture (){
        System.out.println ("Attending a Lecture.");
    }
}

class UndergraduateStudent extends UniversityMember {
    
    
}

class GraduateResearchAssistend extends UniversityMember implements Researcher {
    @Override 
    public void conductLabResearch (){
        System.out.println ("Publishing papers and running experiments.");
    }
}

public static void main(String[] args) {
        UniversityMember undergrad = new UndergraduateStudent();
        undergrad.attendLecture();

        GraduateResearchAssistend gra = new GraduateResearchAssistend();
        gra.attendLecture();
        gra.conductLabResearch();
    }
