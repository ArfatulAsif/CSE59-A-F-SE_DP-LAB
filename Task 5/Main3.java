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

    public boolean validateId(String nationalId) {
        // Checks if ID is exactly 10 or 17 digits
        return nationalId.length() == 10 || nationalId.length() == 17;
    }
}

class SmsService {

    public void sendSmsConfirmation(Patient patient) {
        System.out.println("Sending SMS to " + patient.getPatientName()
                + ": Registration successful.");
    }
}

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient("John", "1234567890");

        IdValidator validator = new IdValidator();
        SmsService smsService = new SmsService();

        if (validator.validateId(patient.getNationalId())) {
            smsService.sendSmsConfirmation(patient);
        } else {
            System.out.println("Invalid National ID.");
        }
    }
}
