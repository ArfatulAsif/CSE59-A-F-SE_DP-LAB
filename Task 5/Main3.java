public class Main3 {
    public static void main(String[] args) {
        IdValidator validator = new IdValidator();
        SmsService smsService = new SmsService();

        
        Patient patient1 = new Patient("Alice Smith", "1234567890");
        processRegistration(patient1, validator, smsService);

        
        Patient patient2 = new Patient("Bob Jones", "12345");
        processRegistration(patient2, validator, smsService);
    }

    private static void processRegistration(Patient patient, IdValidator validator, SmsService smsService) {
        System.out.println("Processing registration for: " + patient.getName());
        
        if (validator.validate(patient.getNationalId())) {
            smsService.sendConfirmation(patient);
        } else {
            System.out.println("Error: Registration failed due to invalid ID length.");
        }
        System.out.println("------------------------------------------------");
    }
}

class Patient {
    private final String name;
    private final String nationalId;

    public Patient(String name, String nationalId) {
        this.name = name;
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public String getNationalId() {
        return nationalId;
    }
}


class IdValidator {
    public boolean validate(String nationalId) {
        if (nationalId == null) {
            return false;
        }
        int length = nationalId.length();
        return length == 10 || length == 17;
    }
}


class SmsService {
    public void sendConfirmation(Patient patient) {
        System.out.println("Sending SMS to " + patient.getName() + ": Registration successful.");
    }
}



