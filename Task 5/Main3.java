class Patient {
     private String patientName;
     private String nationalId;

     public Patient(String patientName, String nationalId) {

         this.patientName = patientName;
         this.nationalId = nationalId;
 }

  public String getPatientName() {
    return patientName;
  }

  public String getNationalId() {
    return nationalId;
  }

}

class IdValidator {

     public boolean isValid (String nationalId) {
        return nationalId.length() == 10 || nationalId.length() == 17;
     }
}

class SmsService {

    public void sendSms(String patientName) {
        System.out.println("Sending SMS ro " + patientName + ": Registration successful.");

    }
}

public class Main3 {
    public static void main(String[] args) {
          
        Patient patient = new Patient ("Rahim", "1234567890");

        IdValidator validator = new IdValidator();

        SmsService  smsService = new SmsService();

        if (validator.isValid(patient.getNationalId())) {
            smsService.sendSms(patient.getPatientName());

        }  else {
           

        System.out.println("Invalid National Id. Registration failed.");
        }
    }
}

