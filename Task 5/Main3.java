
class Patient{
    private String patientName;
    private String nationalID;

    public Patient(String patientName, String nationalID){
        this.patientName = patientName;
        this.nationalID = nationalID;
    }

    public String getPatientName(){
        return patientName;
    }

    public String getNationalId(){
        return nationalID;
    }
}


class IdValidator{
    public boolean validateId(String nationalID) {
        return nationalID.length() == 10 || nationalID.length() == 17;
    }
}

class SmsService  {
    public void sendSms(Patient patient) {
        System.out.println("Sending SMS to " + patient.getPatientName() + ": Registration Successful.");

    }

}
public class Main3 {
    public static void main(String[] args){
        Patient patient = new Patient("Rahim", "123445");
        IdValidator validator = new IdValidator();
        SmsService sms = new SmsService();
        if(validator.validateId(patient.getNationalId())){
            sms.sendSms(patient);
        } else {
            System.out.println("Invalid National ID.");
        }
    }
}
