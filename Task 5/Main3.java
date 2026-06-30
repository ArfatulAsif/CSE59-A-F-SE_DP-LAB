
import javax.print.attribute.standard.PageRanges;

class Patient {
    private String patientName;
    private String nationalId;

    public Patient(String patientName, String nationalId) {
        this.patientName = patientName;
        this.nationalId = nationalId;
    }

    public String getPatientName(){
        return patientName;
    }

    public String getNationalId(){
        return nationalId;
    }
}

class Idvalidator{
    public boolean validateId(String nationalId){
        return nationalId.length() == 10 || nationalId.length() == 17;
    }
}

class SmsService{
    public void sendSmsConfirmation(Patient patient){
        Idvalidator validator = new Idvalidator();

        if(validator.validateId(patient.getNationalId())){
            System.out.println("Sending SMS to " + patient.getPatientName() + ": Registration successful.");
        }

        else{
            System.out.println("Invalid National ID.");
        }

    }
}

public class Main3{
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe", "1234567890");
        SmsService smsService = new SmsService();
        smsService.sendSmsConfirmation(patient);
    }
}
