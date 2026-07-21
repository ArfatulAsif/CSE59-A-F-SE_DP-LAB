class VaccineRegistration {
    private String patientName;
    private String nationalId;

    public VaccineRegistration(String patientName, String nationalId) {
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
        public boolean validateId(String nationalId) {
            return nationalId.length() == 10 || nationalId.length() == 17;

        }
    }

    class SmsService {
        public void sendSms(String patientName) {
            System.out.println("sending sms"+ patientName+ "registration successful");

        }
    }


public class Main3 {
    public static void main(String[] args) {
        VaccineRegistration registration = new VaccineRegistration("Rahim","1234567890");

        IdValidator validator = new IdValidator();
        SmsService smsService = new SmsService();

        if (validator.validateId(registration.getNationalId())) {
            smsService.sendSms(registration.getPatientName());
        } else {
            System.out.println("Invalid Id");
        }
    }
    
}


