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
        return nationalId.length() == 10 || nationalId.length() == 17;
    }
}

class SmsService {
    public void sendSmsConfirmation(Patient patient, boolean isValid) {
        if (isValid) {
            System.out.println("Sending SMS to " + patient.getPatientName() + ": Registration successful.");
        }
    }
}

public class BasicPrinter {
    public static void main(String[] args) {
        Patient patient = new Patient("Rahman", "1234567890");
        IdValidator validator = new IdValidator();
        SmsService sms = new SmsService();

        boolean isValid = validator.validateId(patient.getNationalId());
        sms.sendSmsConfirmation(patient, isValid);
    }
}
