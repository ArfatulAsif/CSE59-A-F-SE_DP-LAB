class UniversityMember {
    public void attendLecture() {
        System.out.println("Attending lecture");
    }
}
class Researcher extends UniversityMember {
    public void conductResearch() {
        System.out.println("Conducting research");
    }
}

class UndergraduateStudent extends UniversityMember {
}

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Undergraduate Student");
        UndergraduateStudent student = new UndergraduateStudent();
        student.attendLecture();

        System.out.println("researcher ");
        Researcher researcher = new Researcher();
        researcher.attendLecture();
        researcher.conductResearch();
    }
}
