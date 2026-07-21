interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

public class Main {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        NotificationService emailNotification = new NotificationService(email);
        emailNotification.alertUser("Hello via Email!");

        MessageSender sms = new SMSSender();
        NotificationService smsNotification = new NotificationService(sms);
        smsNotification.alertUser("Hello via SMS!");
    }
}
